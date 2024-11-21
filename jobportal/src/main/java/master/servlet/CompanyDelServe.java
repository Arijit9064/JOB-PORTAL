package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.AdminDao;
import master.dto.AdminDto;

/**
 * Servlet implementation class CompanyDelServe
 */
@WebServlet("/CompanyDelServe")
public class CompanyDelServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String compname=request.getParameter("compname");
	
		AdminDto adto=new AdminDto();
		adto.setCompname(compname);
		AdminDao adao=new AdminDao();
		adao.deleteData(adto);
		response.sendRedirect("Admin.jsp");
	}

}