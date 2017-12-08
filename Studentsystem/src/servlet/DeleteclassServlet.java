package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.SClass;
import javabean.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteclassServlet extends HttpServlet {

	
	public DeleteclassServlet() {
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
		
		SClass stu = new SClass();
		int r = stu.delete(sclass);
		
		if(r!=1){
			//Ìí¼ÓÊ§°Ü
			request.setAttribute("message", "É¾³ýÊ§°ÜÇëÖØÐÂÌí¼Ó");
		}
			else{
				request.setAttribute("message", "É¾³ý³É¹¦");
		}
		request.getRequestDispatcher("/Jump.jsp").forward(request,response);
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
