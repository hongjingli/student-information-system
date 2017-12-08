package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.StudentMessage;
import javabean.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertstuServlet1 extends HttpServlet {

	public InsertstuServlet1() {
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
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String xueyuan = request.getParameter("xueyuan");
		String zhuanye = request.getParameter("zhuanye");
		String grade = request.getParameter("grade");
		String sclass = request.getParameter("class");
		String phone = request.getParameter("phone");
		String did = request.getParameter("did");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		System.out.print(sid);System.out.print(sname);
		
		StudentMessage st = new StudentMessage();
		st.setsid(sid);
		st.setsname(sname);
		st.setxueyuan(xueyuan);
		st.setzhuanye(zhuanye);
		st.setgrade(grade);
		st.setsclass(sclass);
		st.setphone(phone);
		st.setgrade(grade);
		st.setdid(did);
		st.setuname(uname);
		st.setpwd(pwd);
		
		StudentDao stu = new StudentDao();
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
