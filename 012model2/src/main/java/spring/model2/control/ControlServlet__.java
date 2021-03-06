package spring.model2.control;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;

/*
 * FileName:ControlServlet
 * ㅇ 단일인입점(Single Point of Entry)
 * ㅇ Client요구사항 판단(?)
 * ㅇ 선처리/공통처리
 * -Work Flow Control::권한, 인증 등
 * -Client Form Data한글 처리
 * ㅇBusiness logic수행(Bean Method Call)
 * ㅇ Model과 View연결
 * -Business Logic 처리 결과 JSP전달
 * ㅇ처리된 결과에 따라,JSP로 forward/sendRedirect:Navigation
 */

public class ControlServlet__ extends HttpServlet {

	public void init(ServletConfig sc) throws ServletException {
		super.init(sc);
		// ==> web.xml설정::<load-on-startup>1<load-on-startup>확인
		System.out.println("\n\n================");
		System.out.println("ControlServlet의 init() Method");
		System.out.println("=====================\n");
	}

	// Service() Method
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("\n[ControlServlet.service() start....]");
		
		//==>CONTROLLER:Client요구사항 판단::URL/URI 이용
		String actionPage =this.getURI(req.getRequestURI());
		System.out.println("::URI?=>:"+req.getRequestURI());
		System.out.println("::client의 요구사항은?=>:"+actionPage);
		
		//==> CONTROLLER:선처리/공통처리 사항이 있다면
		//==> 본 예제:한글처리/session 관리,처리/선/공통처리
		req.setCharacterEncoding("euc_kr");
		HttpSession session = req.getSession(true);
	
		//==>CONTROLLER:Navigation(forward/sendRedirect view page결정)
		//Navigation 디폴트 페이지 지지정
		String requestPage="/user/logon.jsp";
		
		//==>CONTROLLER::권한/인증처리
		//==>session ObjectScope 저장된 UserVO 객체 이용 인증
		//==>경우1:session ObjectScope 에 userVO인스턴스 생성 및 저장
		if(session.isNew()|| session.getAttribute("userVO") == null) {
			session.setAttribute("userVO",new UserVO());
		}
		//==>경우2:session ObjectScope userVO추출
		UserVO userVO=(UserVO)session.getAttribute("userVO");
		
		//==>UserVO.active이용 로그인 유무 판단
		if(userVO!=null&&userVO.isActive()) {
			requestPage="/user/home.jsp";
		}
		
		//==>CONTROLLER:Client요구하상 처리Business layer접근
		//1.logon do경우::Business Logic처리 할 것 없음: defaultpage로 forward
		else if(actionPage.equals("logon")) {
			
		}
		//2.logonAction.do 경우
		//==> CONTROLLER::Client요구사항 처리 및 Business logic처리
		//==>ㅇ Client Form data처리
		//==> o Client form data를 Business Layer로 전송하기 위한 VO Binding
		//==>o Business Layer Method 호출 및 결과 값 받아 View(JSP)에서 사용 할 수 있도록
		//==>ObjectScope에 저장::Model/View연결
		else if(actionPage.equals("logonAction")) {
			
			//==>Client form Data처리
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");
			
			//==>CONTROLLER:model과 View의 연결
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			UserDao userDao = new UserDao();
			userDao.getUser(userVO);
			
			if(userVO.isActive()) {
				requestPage="/user/home.jsp";
			}
		}
		//3.home.do의 경우
		//==>비 로그인 회원이 home.jdo Request:default request page 로 forward
		else if(actionPage.equals("home")) {
			
		}
		System.out.println("::최종 결정된  View page는:[["+requestPage+".jsp]]"+userVO.isActive());
		
		//==>Controller:Naviagation(최종 결정된page forward)
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(requestPage);
		rd.forward(req,res);
		
		System.out.println("[ControlServlet.service() end....]");
	}
	
	//client의 요구사항 판단
	private String getURI(String requestURI) {
		int start = requestURI.lastIndexOf('/')+1;
		int end=requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start,end);
		return actionPage;
	}

}
