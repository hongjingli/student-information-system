package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.Jlogin;
import javabean.user;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewpwdServlet extends HttpServlet {

	public NewpwdServlet() {
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
		
		String uname = request.getParameter("s");
		String pwd = request.getParameter("newpwd");
		System.out.print(uname);System.out.print(pwd);
		user us =new user();
		us.setUserName(uname);
		us.setPassword(pwd);
		
		Jlogin l = new Jlogin();
		int r = l.newpwd(us);
		if(r==1){
			request.setAttribute("message", "�޸ĳɹ�");
			request.getRequestDispatcher("/Jump.jsp").forward(request,response);
		}
		else{
			request.setAttribute("errorMessage", "�޸�ʧ�ܣ������ԣ�");
			request.getRequestDispatcher("/Jump.jsp").forward(request, response);
		}
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
