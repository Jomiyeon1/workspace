package spring.model2.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.view.ViewResolverComposite;

/*
 * FileName: DispatcherServlet.java
 * o 단일인입점(Single Point of Entry)
 * o Client 요구사항 판단
 * o 선처리/ 공통처리
 * -work flow Control ::권한 인증등
 * -client form Data 한글 처리
 * o Business logic 수정(Bean Method Call)
 * o Model과 View연결
 * -Business logic 수행(Bean Method call)
 * o 처리된 결과에 따라 JSP로 forward/wendRedirect :Navigation
 */
public class DispatcherServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println("\n[DispatcherServlet.service() start....]");
		
		//=>CONTROLLER::client요구사항 판단:URL/URI
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println("::URI==>"+req.getRequestURI());
		System.out.println("::client의 요구사항은?=>"+actionPage);
		
		//=>CONTROLLER:선처리/공통처리 사항이 있다면
		//=>본 예제는 : 한글처리
		req.setCharacterEncoding("euc_kr");
		
		//==>CONTROLLER: CLIENT요구사항 처리 및 Business logic처리
		//==>Business Logic 을 처리하는 Controller 선언
		Controller controller =null;
		
		//==>client의 request에 대응하는 Controller instance생성
		//==>controllerMapping 를 통해 client Request를 처리할 Conrtroller instance생성
		ControllerMapping cf = ControllerMapping.getInstance();
		controller = cf.getController(actionPage);
		
		//controller.execute(req,res);
		ModelAndView modelAndView = controller.execute(req,res);
		new ViewResolver().forward(req,res,modelAndView);
		
		System.out.println("[ DispatcherServlet.service() end....]");
	}
	
	private String getURI(String requestURI) {
		int start = requestURI.lastIndexOf("/")+1;
		int end = requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start,end);
		return actionPage;
	}
	

}
