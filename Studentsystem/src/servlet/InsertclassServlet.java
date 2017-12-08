package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.ClassMessage;
import javabean.SClass;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertclassServlet extends HttpServlet {

	public InsertclassServlet() {
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
//		zhuanye = new String(zhuanye.getBytes("ISO-8859-1"),"utf-8");
		String grade = request.getParameter("grade");
		String scount = request.getParameter("scount");
		String sroom = request.getParameter("sroom");
		String banzhuren = request.getParameter("banzhuren");
		String fudaoyuan = request.getParameter("fudaoyuan");
		System.out.print(sclass);
		
		ClassMessage st = new ClassMessage();
		st.setsclass(sclass);
		st.setgrade(grade);
		st.setscount(scount);
		st.setsroom(sroom);
		st.setbanzhuren(banzhuren);
		st.setfudaoyuan(fudaoyuan);

		
		SClass stu = new SClass();
		int r = stu.add(st);
		
		if(r!=1){
			//添加失败
			request.setAttribute("message", "添加失败请重新添加");
		}
			else{
				request.setAttribute("message", "添加成功");
		}
		request.getRequestDispatcher("/Jump.jsp").forward(request,response);
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
