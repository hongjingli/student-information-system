package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.XueYuan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class delectXYServlet extends HttpServlet {

	
	public delectXYServlet() {
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
		String zhuanye = request.getParameter("s");
		zhuanye = new String(zhuanye.getBytes("ISO-8859-1"),"utf-8");
		
		//String xueyuan=request.getParameter("s");
		//String zhuanye=request.getParameter("s");
		
		XueYuan XY = new XueYuan();
		int r = XY.delete(zhuanye);
		if(r!=1){
		}
			else{
				request.setAttribute("message", "É¾³ý³É¹¦");
		}
		request.getRequestDispatcher("/queryXY.jsp").forward(request,response);
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
