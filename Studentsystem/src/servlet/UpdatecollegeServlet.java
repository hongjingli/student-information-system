package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.MajorCollegeMessage;
import javabean.College;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatecollegeServlet extends HttpServlet {

	public UpdatecollegeServlet() {
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
		//xueyuan = new String(xueyuan.getBytes("ISO-8859-1"),"utf-8");
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
		int r = stu.modify(st,xueyuan);
		
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
