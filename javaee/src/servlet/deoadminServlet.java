package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.Jlogin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deoadminServlet extends HttpServlet {

	
	public deoadminServlet() {
		super();
	}

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String name = request.getParameter("s");
		name = new String(name.getBytes("ISO-8859-1"),"utf-8");
		String pwd = request.getParameter("s1");
		pwd = new String(pwd.getBytes("ISO-8859-1"),"utf-8");
		
		//String name=request.getParameter("s");
		//String pwd=request.getParameter("s1");
		//String xueyuan=request.getParameter("s2");
		
		Jlogin l = new Jlogin();
		int r = l.delete(name,pwd);
		
		if(r!=1){
			request.setAttribute("message", "É¾³ýÊ§°Ü");
		}
			else{
				request.setAttribute("message", "É¾³ý³É¹¦");
		}
		request.getRequestDispatcher("/deoadmin.jsp").forward(request,response);
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
