package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.Student;
import javabean.StudentDao;
import javabean.XY;
import javabean.XueYuan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reXYServlet extends HttpServlet {


	public reXYServlet() {
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
		
		String xueyuan = request.getParameter("xyname");
		//xueyuan = new String(xueyuan.getBytes("ISO-8859-1"),"utf-8");
		System.out.print(xueyuan);
		String zhuanye = request.getParameter("zyname");
		//zhuanye = new String(zhuanye.getBytes("ISO-8859-1"),"utf-8");
		String pxueyuan = request.getParameter("xueyuan");
		pxueyuan = new String(pxueyuan.getBytes("ISO-8859-1"),"utf-8");
		String pzhuanye = request.getParameter("zhuanye");
		pzhuanye = new String(pzhuanye.getBytes("ISO-8859-1"),"utf-8");
		
		System.out.print(xueyuan);System.out.print(zhuanye);
		
		XY x = new XY();
		x.setxueyuan(xueyuan);
		x.setzhuanye(zhuanye);
		XueYuan xy = new XueYuan();
		int r = xy.modify(x,pxueyuan,pzhuanye);
		if(r==1){
			request.getRequestDispatcher("/queryXY.jsp").forward(request,response);
		}
		else{
			//request.setAttribute("Message", "–ﬁ∏ƒ ß∞‹£¨«Î÷ÿ ‘£°");
			request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
		}
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
