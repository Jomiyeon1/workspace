package spring.model2.control;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.service.user.dao.UserDao;
import spring.madel2.service.user.vo.UserVO;

/*
 * - 단일인입점(Single Point of Entry)
 * - Client 요구사항 판단(?)
 * - 선처리 / 공통처리
 *   > Work Flow Control :: 권한, 인증 등
 *   > Client Form Data 한글처리
 * - Business logic 수행(Bean Method Call)
 * - Model 과 View 연결
 *   > Business Logic 처리 결과 JSP 전달 (Object Scope / VO 사용)
 * - 처리된 결과에 따라, JSP 로 forward/sendRedirect : Navigation
 * */

//@WebServlet("/ControlServlet")
public class ControlServlet extends HttpServlet {
	//init()
	public void init(ServletConfig config) throws ServletException {
		super.init(sc);
		//==>web.xml 설정 :: <load-on-startup>1<load-on-startup> 확인
		System.out.println("\n\n=============================");
		System.out.println("ControlServlet의 init() Method");
		System.out.println("================================\n");
		
	}

	//service()
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("\n[ControlServlet.service() start.....]");
		
		//==> CONTROLLER :: Client 요구사항 판단 :: URL/RUI 이용
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println("::URI ? => "+ req.getRequestURI());
		System.out.println("::client의 요구사항은?? => " + actionPage);
		
		//==> CONTROLLER :: 선처리 / 공통처리 사항이 있다면..
		// ==> 본 예제 : 한글처리/ session 관리,처리 / 선,공통처리
		req.setCharacterEncoding("euc-kr");
		HttpSession session = req.getSession(true);
		
		//==> CONTROLLER :: Navagation (forward/sendRedirect view page 결정)
		// Navigation 디폴트 페이지 지정
		String requsetPage ="user/logon.jsp";
		
		//==> CONTROLLER 권한 / 인증처리
		//==> session ObjectScope 저장된 UserVO 객체 이용 인증
		//==> 경우 1. session ObjectScope 에 userVO 인스턴스 생성 및 저장
		if(session.isNew() || session.getAttribute("userVO") ==null) {
			session.setAttribute("userVO", new UserVO());
			
		}
		
		//==> 경우 2. session ObjectScope userVO 추출
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		
		//==> UserVO.active 이용 로그인 유무판단
		if(userVO != null && uesrVO.isActive()) {
			requestPage = "user/home.jsp";
		}
		
		//==> CONTROLLER :: Client 요구사항 처리 Business layer 접근
		
		// 1. logon.do 경우 :: Business Logic 처리할 것 없음 : default page로 forward
		else if(actionPage.equals("logon")) {
			
		}
		
		// 2. logonAction.do 경우
		//==> CONTROLLER :: Client 요구사항 처리 및 Business logic 처리
		//==> - Client Form Data 처리
		//==> - Client Form data 를 Business Layer 로 전송하기 위한 VO Binding
		//==> - Business Layer Method 호출 및 결과값 받아 View(JSP)에서 사용할 수 있도록
		//      ObjectScope에 저장 :: Mosel / View 연결
		
		else if (actionPage.equals("logonAction")) {
			
			//==> Client Form Data처리
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");
			
			//==> CONTROLLER :: Model과 View 의 연결 : Binding
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			//==> CONTROLLER :: Business logic 처리
			UserDao userDao = new UserDao();
			userDao.getUser(userVO);
			
			//==> CONTROLLER  :: Navigation (forward/sendRedirect viewpage 결정)
			if(userVO.isActive()) {
				requsetPage = "user/home.jsp";
			}
			
			// 3. home.do의 경우
			//==> 비 로그인 회원이 home.do Request : default request page로 forward
			else if (actionPage.equals("home")) {
				
			}
			
			System.out.println("[ ControlServlet.service() end..... ]");
		}
		
		//client의 요구사항 판단 ==> requserURL = "/~~.do" 형식이므로...
		private String getURI(String requestURI) {
			int start = requestURI.lastIndexOf('/')+1;
			int end = requestURI.lastIndexOf(".do");
			String actionPage = requestURI.substring(start, end);
			return acionPage;
			
		}
	}

}
