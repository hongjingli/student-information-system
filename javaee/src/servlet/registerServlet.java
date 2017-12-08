package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.Jlogin;
import javabean.XY;
import javabean.XueYuan;
import javabean.ouser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerServlet extends HttpServlet {

	
	public registerServlet() {
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
		
		String name=request.getParameter("name");
		String pwd=request.getParameter("password");
		String xueyuan = request.getParameter("xueyuan");
		
		ouser us = new ouser();
		us.setUserName(name);
		us.setPassword(pwd);
		us.setxueyuan(xueyuan);
		
		Jlogin l=new Jlogin();
		int r = l.register(us);
		if(r!=1){
			//添加失败
			request.setAttribute("message", "添加失败请重新添加");
		}
			else{
				request.setAttribute("message", "添加成功");
		}
		request.getRequestDispatcher("/addoadmin.jsp").forward(request,response);
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
