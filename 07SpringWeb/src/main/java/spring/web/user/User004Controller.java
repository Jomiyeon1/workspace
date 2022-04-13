package spring.web.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.domain.User;
import spring.service.user.impl.UserDAO;

/*
 * fileName : user004 Controller.java
 * -Controller Coding Policy
 * :return type:mdoelAndView적용
 * :Method parameter
 * -client dAta : @ModelAttrivbute / @ Requets Param 적적이 사용
 * - 필요시 Servlet API 사용
 */
@Controller
public class User004Controller {

   //Field
   
   //Contructor
   public User004Controller() {
      System.out.println("==>User004 Controller default Constructor call......");
      // TODO Auto-generated constructor stub
   }
   
   /////////////////////////////////////////////////////////////////////
   //LogonCheckInterceptor 사용으로 로그인 유무 확인하던 logon() 변경
   //==> 단순 Navigation
   @RequestMapping("/logon.do")
   public ModelAndView logon() {
      
      System.out.println("[logon() start.....]");//=> 디버깅용
      
      //=-=> client에 전달할 Message 생성
      String message = "[logon()] 아이디 패스워드 3자이상 입력하세요";
      
      //=> model(data) / View(jsp) 정보를 갖는 ModelAndView생성
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/user002/logon.jsp");
      modelAndView.addObject("message",message);
      
      System.out.println("[logon() end....]\n");
      
      return modelAndView;
   }
////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
   //LogonCheckInterceptor 사용으로 로그인 유무 확인하던 home() 변경
   //==> 단순 Navigation
   @RequestMapping("/home.do")
   public ModelAndView home(HttpSession session) {
      System.out.println("[home() start....]"); //<==디버깅용
      String message ="[home()] WELCOME";
      
      //==> Model(data) / View(jsp) 정보를 갖는 ModelAndView 생성
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/user002/home.jsp");
      modelAndView.addObject("message",message);
      
      System.out.println("[home() end....]\n");
      
      return modelAndView;
   }
   
////////////////////////////////////////////////////////////////////////
   
   //단순 Navigation
   @RequestMapping(value = "/logonAction.do", method=RequestMethod.GET)
   public ModelAndView logonAction() {
      
      System.out.println("[logonAction() method =RequestMethod.GET start....]");
      
      //==> Model(data) / View(jsp) 정보를 같는  ModelAndView 생성
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/logon.do");
      
      System.out.println("[logonAction() method =RequestMethod.GET end....]\n");
      
      return modelAndView;
   }
   
   //Business Logic 수행 / Navigation
   @RequestMapping(value="/logonAction.do",method=RequestMethod.POST)
   public ModelAndView logonAction(@ModelAttribute("user") User user, HttpSession session) {
      System.out.println("[logonAction() method = RequestMehtod.POST start.....]");
      
      String viewName = "/user002/logon.jsp";
      
      //=>CONTROLLER: Business logic처리
      //==> Business Layer 의 DAO생성 및 Mehtod호출
      UserDAO userDAO = new UserDAO();
      userDAO.getUser(user);
      
      if(user.isActive()) {
         viewName = "/user002/home.jsp";
         session.setAttribute("sessionUser", user);
      }
      
      System.out.println("[action: "+viewName+"]"); //<==디버깅용
      
      //==> Client에 전달할 Message 생성
      String message = null;
      if(viewName.equals("/user002/home.jsp")) {
         message = "[LogonAction()] WELCOME";
      }else {
         message ="[LogonAction()] 아이디 패스워드 3자이상 입력하세요";
      }
      
      //==> Model(data) /View(jsp)정로를 갖는 ModelAndView생성
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName(viewName);
      modelAndView.addObject("message",message);
      
      System.out.println("[logonAction() method =RequestMethod.POST end...]\n");
      
      return modelAndView;
   }
////////////////////////////////////////////////////////////////////////
   
   //권한(logon정보삭제) 확인 /navigation
   @RequestMapping("/logout.do")
   public ModelAndView logout(HttpSession session) {
      System.out.println("[Logout() start...]"); //<==디버깅용
      
      //==> logon 정보삭제
      session.removeAttribute("sessionUser");
      
      //==> client에 전달할 Message생성
      String message = "[Logout()] 아이디 , 패스워드 3자이상 입력하세요";
      
      //==> Model(data) / view(jsp) 정보를 갖는 ModelAndView 생성
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/user002/logon.jsp");
      modelAndView.addObject("message",message);
      
      System.out.println("[Logout() end....]\n");
      
      return modelAndView;
   }
}