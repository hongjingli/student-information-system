package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.MajorCollegeMessage;
import javabean.College;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertcollegeServlet extends HttpServlet {

	public InsertcollegeServlet() {
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
		
		String xueyuan = request.getParameter("xueyuan");
//		zhuanye = new String(zhuanye.getBytes("ISO-8859-1"),"utf-8");
		String xjianjie = request.getParameter("xjianjie");
		String yuanzhang = request.getParameter("yuanzhang");
		String office = request.getParameter("office");

		System.out.print(xueyuan);
		
		MajorCollegeMessage st = new MajorCollegeMessage();
		st.setxueyuan(xueyuan);
		st.setxjianjie(xjianjie);
		st.setyuanzhang(yuanzhang);
		st.setoffice(office);

		
		College stu = new College();
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
