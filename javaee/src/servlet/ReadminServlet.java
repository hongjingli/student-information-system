package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.Jlogin;
import javabean.ouser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadminServlet extends HttpServlet {


	public ReadminServlet() {
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
		
		String uname = request.getParameter("uname");
		uname = new String(uname.getBytes("ISO-8859-1"),"utf-8");
		String pwd = request.getParameter("newpassword");
		String xueyuan = request.getParameter("xueyuan");
		
		ouser us = new ouser();
		us.setUserName(uname);
		us.setPassword(pwd);
		us.setxueyuan(xueyuan);
		
		Jlogin l = new Jlogin();
		
		int r = l.Re(us,uname);
		if(r==1){
			request.setAttribute("Message", "修改成功！");
			request.getRequestDispatcher("/deoadmin.jsp").forward(request,response);
		}
		else{
			request.setAttribute("Message", "修改失败，请重试！");
			request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
		}
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
