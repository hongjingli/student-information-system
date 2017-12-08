package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.College;
import javabean.Major;
import javabean.MajorCollegeMessage;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatemajorServlet extends HttpServlet {

	public UpdatemajorServlet() {
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
		
		String zhuanye = request.getParameter("zhuanye");
		//xueyuan = new String(xueyuan.getBytes("ISO-8859-1"),"utf-8");
		String jianjie = request.getParameter("jianjie");

		String mcount = request.getParameter("mcount");

		String ccount = request.getParameter("ccount");

		System.out.print(zhuanye);
		
		MajorCollegeMessage st = new MajorCollegeMessage();
		st.setzhuanye(zhuanye);
		st.setjianjie(jianjie);
		st.setmcount(mcount);
		st.setccount(ccount);
		
		Major stu = new Major();
		int r = stu.modify(st,zhuanye);
		
		if(r==1){
			//request.getRequestDispatcher("/Selectupclass.jsp").forward(request,response);
			request.setAttribute("message", "修改成功");
		}
		else{
			//request.setAttribute("Message", "修改失败，请重试！");
			//request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
			request.setAttribute("message", "修改失败请重新添加");
		}
		request.getRequestDispatcher("/Jump.jsp").forward(request,response);
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
