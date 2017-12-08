package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.user;
import javabean.Jlogin;

public class loginservlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		boolean success;
		String userName = request.getParameter("uname");
		String passWord = request.getParameter("pwd");
		Jlogin userDao = new Jlogin();
		String i=request.getParameter("urole");
		if(i.equals("1"))
		{
			 success = userDao.login(userName, passWord);
			 if(success){
					//合法用户
					//request.getSession().setAttribute("isLegalLogin", "YES");
					request.getRequestDispatcher("/Superadmin.jsp").forward(request, response);
				}else{
					//非法用户
					//request.setAttribute("errorMessage" , "用户名或密码错误！");
					request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
				}
		}
		else if(i.equals("2"))
		{
			 success = userDao.login1(userName, passWord);
			 
		if(success){
			//合法用户
			//request.getSession().setAttribute("isLegalLogin", "YES");
			request.getRequestDispatcher("/admin.jsp").forward(request, response);
		}else{
			//非法用户
			//request.setAttribute("errorMessage" , "用户名或密码错误！");
			request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
			}
		}
		
	}

}
