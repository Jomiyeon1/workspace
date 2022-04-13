package spring.web.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.domain.User;
import spring.service.user.impl.UserDAO;

//@Controller
public class User002Controller {
   
   // field
   
   
   // ctor   
   public User002Controller() {
      System.out.println("==> User002Controller default Constructor call......");
   }

   @RequestMapping("/logon.do")
   public ModelAndView logon(HttpSession session) {
      
      System.out.println("[ logon() start... ]"); // for debugging
      
      if(session.isNew() || session.getAttribute("sessionUser") == null) {
         session.setAttribute("sessionUser", new User());
      }
      
      User sessionUser = (User)session.getAttribute("sessionUser");
      
      String viewName = "/user002/logon.jsp";
      
      if(sessionUser.isActive()) {
         viewName = "/user002/home.jsp";
      }
      System.out.println("[ action : "+viewName+ " ]"); // for debugging
      
      String message = null;
      if(viewName.equals("/user002/home.jsp")) {
         message = "[ logon() ] WELCOME";   
      } else {
         message = "[ logon() ] 아이디, 패스워드 3자 이상 입력하세요.";   
      }
      
      //==> Model(data) / View(jsp) 정보를 갖는 ModelAndView 생성
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName(viewName);
      modelAndView.addObject("message", message);
      
      System.out.println("[ logon() end......]\n");
      
      return modelAndView;
   }   
   
   @RequestMapping("/home.do")
   public ModelAndView home(HttpSession session) {
      
      System.out.println("[ home() start....... ]"); // for debugging
      
      if(session.isNew() || session.getAttribute("sessionUser") == null) {
         session.setAttribute("sessionUser", new User());
      }
      User sessionUser = (User)session.getAttribute("sessionUser");
      
      String viewName = "/user002/logon.jsp";
      
      if(sessionUser.isActive()) {
         viewName = "/user002/home.jsp";
      }
      System.out.println("[ action : "+viewName+ " ]"); // for debugging
      
      String message = null;
      if( viewName.equals("/user002/home.jsp")) {
         message = "[ home() ] WELCOME";
      } else {
         message = "[ home() ] 아이디, 패스워드 3자 이상 입력하세요.";
      }
      
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName(viewName);
      modelAndView.addObject("message", message);
      
      System.out.println("[ home() end......]\n");
      
      return modelAndView;
   }
   
   @RequestMapping("/logonAction.do")
   public ModelAndView logonAction(@ModelAttribute("user") User user, HttpSession session) {
      
      System.out.println("[ logon() start... ]");
      
      if(session.isNew() || session.getAttribute("sessionUser") == null) {
         session.setAttribute("sessionUser", new User());
      }
      User sessionUser = (User)session.getAttribute("sessionUser");
      
      String viewName = "/user002/logon.jsp";
      
      if(sessionUser.isActive()) {
         viewName = "/user002/home.jsp";
      }//==> 로그인한 회원이 아니라면 ...
      else {
         UserDAO userDAO = new UserDAO();
         userDAO.getUser(user);
         
         if(user.isActive()) {
            viewName = "/user002/home.jsp";
            session.setAttribute("sessionUser", user);
         }
      }
      System.out.println("[action : " +viewName+ "]"); // <== 디버깅용
      
      String message = null;
      if(viewName.equals("/user002/home.jsp")) {
         message = "[ LogonAction() ] WELCOME";
      } else {
         message = "[ LogonAction() ] 아이디, 패스워드 3자 이상 입력하세요.";
      }
      
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName(viewName);
      modelAndView.addObject("message", message);
      
      System.out.println("[ LogonAction() end....... ]\n");
      
      return modelAndView;
   }
   
   @RequestMapping("/logout.do")
   public ModelAndView logout(HttpSession session) {
      
      System.out.println("[ Logout() start......]"); // for debugging
      
      session.removeAttribute("sessionUser");
      
      String message = "[Logout()] 아이디, 패스워드 3자 이상 입력하세요.";
      
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/user002/logon.jsp");
      modelAndView.addObject("message", message);
      
      System.out.println("[ Logout() end......]\n");
      
      return modelAndView;
   }
   
}
   
      
      