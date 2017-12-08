package servlet;

import java.io.IOException;

import javabean.Jlogin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet1 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		boolean success = false;
		String userName = request.getParameter("username");
		System.out.print(userName);
		String passWord = request.getParameter("password");
		System.out.print(passWord);
		Jlogin userDao = new Jlogin();
		String i=request.getParameter("urole");
		System.out.print(i);
		if(i.equals("1"))
		{
			 try {
				success = userDao.login(userName, passWord);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.print(success);
			 if(success){
					//合法用户
					//request.getSession().setAttribute("isLegalLogin", "YES");
					request.getRequestDispatcher("/SuperMain.jsp").forward(request, response);
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
			request.getRequestDispatcher("/OrdinaryMain.jsp").forward(request, response);
			 }else{
			//非法用户
			//request.setAttribute("errorMessage" , "用户名或密码错误！");
			request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
			}
		}
		
	}
}
