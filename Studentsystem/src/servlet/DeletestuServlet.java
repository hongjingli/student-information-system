package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javabean.StudentDao;
import javabean.College;
import javabean.StudentMessage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeletestuServlet extends HttpServlet {

	
	public DeletestuServlet() {
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
		
		StudentDao stu = new StudentDao();
		int r = stu.delete(sid);
		
		if(r!=1){
			//���ʧ��
			request.setAttribute("message", "ɾ��ʧ�����������");
		}
			else{
				request.setAttribute("message", "ɾ���ɹ�");
		}
		request.getRequestDispatcher("/Jump.jsp").forward(request,response);
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
