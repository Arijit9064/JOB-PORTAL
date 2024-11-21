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
 * Servlet implementation class CompanyServe
 */
@WebServlet("/CompanyServe")
public class CompanyServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String companyid=request.getParameter("companyid");
		String compname=request.getParameter("compname");
		String compphno=request.getParameter("compphno");
	
		AdminDto adto=new AdminDto();
		adto.setCompanyid(companyid);
		adto.setCompname(compname);
		adto.setCompphno(compphno);
		AdminDao adao=new AdminDao();
		adao.insertData(adto);
		response.sendRedirect("Job.jsp");
	}

}