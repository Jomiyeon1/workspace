package spring.web.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class User001Controller {
   
   // field
   
   
   // ctor   
   public User001Controller() {
      System.out.println("==> User001Controller default Constructor call......");
   }

   @RequestMapping("/logon.do")
   public ModelAndView logon() {
      
      System.out.println("[ logon() start... ]");
      
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/user001/logon.jsp");
      
      return modelAndView;
   }
   
   @RequestMapping("/home.do")
   public ModelAndView home() {
      
      System.out.println("[ home() start....... ]"); 
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/user001/home.jsp");

      return modelAndView;
   }
   
   @RequestMapping("/logonAction.do")
   public ModelAndView logonAction() {
      
      System.out.println("[ logonAction() start....... ]"); 
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/user001/logonAction.jsp");

      return modelAndView;
   }
   
   
   @RequestMapping("/logout.do")
   public ModelAndView logout() {
      
      System.out.println("[ logout() start....... ]"); 
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("/user001/logout.jsp");

      return modelAndView;
   }
}