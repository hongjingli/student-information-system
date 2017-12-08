package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.Student;
import javabean.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddstuServlet extends HttpServlet {


	public AddstuServlet() {
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
		
		String id = request.getParameter("xuehao");
		String name = request.getParameter("name");
		String zhuanye = request.getParameter("zhuanye");
		String classs = request.getParameter("class");
		String xueyuan = request.getParameter("xueyuan");
		String phone = request.getParameter("phone");
		String dorid = request.getParameter("susheid");
		String did = request.getParameter("did");
		
		StudentMessage st = new StudentMessage();
		st.setid(id);
		st.setname(name);
		st.setzhuanye(zhuanye);
		st.setclasss(classs);
		st.setxueyuan(xueyuan);
		st.setphone(phone);
		st.setdorid(dorid);
		st.setdid(did);
		
		StudentDao stu = new StudentDao();
		int r = stu.add(st);
		
		if(r!=1){
			//添加失败
			request.setAttribute("message", "添加失败请重新添加");
		}
			else{
				request.setAttribute("message", "添加成功");
		}
		request.getRequestDispatcher("/Insertstu.jsp").forward(request,response);
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
