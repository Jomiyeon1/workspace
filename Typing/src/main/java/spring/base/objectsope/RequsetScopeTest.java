package spring.base.objectsope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/RequsetScopeTest")
public class RequsetScopeTest extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		//1. request Object Scope "count"����
		Integer count = (Integer)request.getAttribute("count");
		
		//2. ���ٸ�..
		//==> name : "count" value : new Integer(1)
		if(count == null) {
			out.println("::1��° Request::");
			request.setAttribute("count", new Integer(1));
			
		}
		
		//3. �ִٸ�...
		//==> request ObjectScope ������ ���
		//==> count ���� ���� (+1) �ٽ� request ObjectSecpoe ����
		else {
			int changeCount = count.intValue()+1;
			out.println("::" + changeCount +"��° Request ::");
			
			request.setAttribute("count", new Integer(changeCount));
		}
	}

}
