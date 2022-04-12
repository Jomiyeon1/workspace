package spring.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TestController {

	///Filed
	
	///Controller
	public TestController() {
		System.out.println(":: TestColtroller default Constructor call");
	}
	
	//==> 특정 interface를 구현하지 않음으로 OverRiding 할 Method가 없다.
	@RequestMapping("/testView01.do")
	public ModelAndView testView01() {
		System.out.println("[testView01() start......]"); //<== 디버깅용
		
		//ViewName값만 갖는 ModelAndView 객체 return
		return new ModelAndView("/test/testView.jsp");
	}
	
	//==> 특정 interface를 구현하지 않음으로 Overriding할 method가 없다.
	//==> return data type이 fix되어 있지 않다
	@RequestMapping("/testView02.do")
	public String testView02() {
		System.out.println("[testView02() start......]"); //<== 디버깅용

		//viewName을 갖는 String Return
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView03.do")
	public String testView03(@RequestParam("abc") int no, @RequestParam("def") String name) {
		System.out.println("[testView03() start......]"); // <== 디버깅용

		//==> Servlet API를 이용한 Client Data 처리하기를 생각하며 ......
		//==> @~~ 사용법을 생각하면 .....
		//int no = Integer.parseInt(request.getParameter("abc"));
		//String name = request.getParamether("def")
		
		System.out.println("no : " +no+ "=== name : " +name);
		
		//viewNamed을 갖는 String Return
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView04.do")
	public String testView04(@RequestParam(value="abc") int no, 
								@RequestParam(value="def", required=false) String name) {
		System.out.println("[testView04() start......]"); // <== 디버깅용
		
		System.out.println("no : " +no+ "=== name : " +name);
		
		//viewNamed을 갖는 String Return
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView05.do")
	public String testView05(@RequestParam(value="abc", defaultValue="1") int no, 
								@RequestParam(value="def", required=false) String name) {
		System.out.println("[testView05() start......]"); // <== 디버깅용
	
		System.out.println("no : " +no+ "=== name : " +name);
		
		//viewNamed을 갖는 String Return
		return "/test/testView.jsp";
		
	}
}
