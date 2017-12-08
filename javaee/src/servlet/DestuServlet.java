package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.StudentDao;
import javabean.XueYuan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DestuServlet extends HttpServlet {

	
	public DestuServlet() {
		super();
	}


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doPost(request, response);
	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("s");
		id = new String(id.getBytes("ISO-8859-1"),"utf-8");


		System.out.print(id);
		StudentDao st = new StudentDao();
		
		int r = st.delete(id);
		if(r!=1){
			request.setAttribute("message", "删除失败请重新添加");
		}
			else{
				request.setAttribute("message", "删除成功");
		}
		request.getRequestDispatcher("/DeStu.jsp").forward(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String id=request.getParameter("s");
		StudentDao st = new StudentDao();
		int r = st.delete(id);
		if(r!=1){
			request.setAttribute("message", "删除失败请重新添加");
		}
			else{
				request.setAttribute("message", "删除成功");
		}
		request.getRequestDispatcher("/DeStu.jsp").forward(request,response);*/
		//doGet(request, response);
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
