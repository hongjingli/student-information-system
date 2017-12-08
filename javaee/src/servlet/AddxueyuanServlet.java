package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.XY;
import javabean.XueYuan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddxueyuanServlet extends HttpServlet {

	
	public AddxueyuanServlet() {
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
		
		String xueyuan=request.getParameter("xyname");
		String zhuanye=request.getParameter("zyname");
		XY xy = new XY();
		xy.setxueyuan(xueyuan);
		xy.setzhuanye(zhuanye);
		
		XueYuan XY = new XueYuan();
		int r = XY.add(xy);
		if(r!=1){
			//添加失败
			request.setAttribute("message", "添加失败请重新添加");
		}
			else{
				request.setAttribute("message", "添加成功");
		}
		request.getRequestDispatcher("/addXY.jsp").forward(request,response);
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
