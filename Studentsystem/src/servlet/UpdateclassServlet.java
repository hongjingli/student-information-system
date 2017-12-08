package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.ClassMessage;
import javabean.SClass;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateclassServlet extends HttpServlet {

	public UpdateclassServlet() {
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
		
		String sclass = request.getParameter("class");
//	  	sclass = new String(sclass.getBytes("ISO-8859-1"),"utf-8");
		String grade = request.getParameter("grade");
//		grade = new String(grade.getBytes("ISO-8859-1"),"utf-8");
		String scount = request.getParameter("scount");
//		scount = new String(scount.getBytes("ISO-8859-1"),"utf-8");
		String sroom = request.getParameter("sroom");
//	  	sroom = new String(sroom.getBytes("ISO-8859-1"),"utf-8");
		String banzhuren = request.getParameter("banzhuren");
//	  	banzhuren = new String(banzhuren.getBytes("ISO-8859-1"),"utf-8");
		String fudaoyuan = request.getParameter("fudaoyuan");
//	  	fudaoyuan = new String(fudaoyuan.getBytes("ISO-8859-1"),"utf-8");
		System.out.print(sclass);
		
		ClassMessage st = new ClassMessage();
		st.setsclass(sclass);
		st.setgrade(grade);
		st.setscount(scount);
		st.setsroom(sroom);
		st.setbanzhuren(banzhuren);
		st.setfudaoyuan(fudaoyuan);
		
		SClass stu = new SClass();
		int r = stu.modify(st,sclass);
		
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
