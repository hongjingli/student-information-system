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

public class RestuServlet extends HttpServlet {

	public RestuServlet() {
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
		//System.out.print(pid);
		//name = new String(name.getBytes("ISO-8859-1"),"utf-8");
		String id = request.getParameter("s1");
		//id = new String(id.getBytes("ISO-8859-1"),"utf-8");
		String name = request.getParameter("s2");
		//name = new String(name.getBytes("ISO-8859-1"),"utf-8");
		String zhuanye = request.getParameter("s3");
		//zhuanye = new String(zhuanye.getBytes("ISO-8859-1"),"utf-8");
		String classs = request.getParameter("s4");
		//classs = new String(classs.getBytes("ISO-8859-1"),"utf-8");
		String xueyuan = request.getParameter("s5");
		//xueyuan = new String(xueyuan.getBytes("ISO-8859-1"),"utf-8");
		String phone = request.getParameter("s6");
		//phone = new String(phone.getBytes("ISO-8859-1"),"utf-8");
		String dorid = request.getParameter("s7");
		//dorid = new String(dorid.getBytes("ISO-8859-1"),"utf-8");
		String did = request.getParameter("s8");
		//did = new String(did.getBytes("ISO-8859-1"),"utf-8");
		System.out.print(id);System.out.print(name);System.out.print(zhuanye);System.out.print(classs);
		System.out.print(xueyuan);System.out.print(phone);System.out.print(dorid);System.out.print(did);
		
		Student st = new Student();
		st.setid(id);
		st.setname(name);
		st.setzhuanye(zhuanye);
		st.setclasss(classs);
		st.setxueyuan(xueyuan);
		st.setphone(phone);
		st.setdorid(dorid);
		st.setdid(did);
		
		StudentDao stu = new StudentDao();
		int r = stu.modify(st,request.getParameter("pid"));
		if(r==1){
			request.getRequestDispatcher("/DeStu.jsp").forward(request,response);
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
