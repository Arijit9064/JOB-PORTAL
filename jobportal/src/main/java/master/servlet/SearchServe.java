package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.ClientDao;
import master.dto.ClientDto;

/**
 * Servlet implementation class SearchServe
 */
@WebServlet("/SearchServe")
public class SearchServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String domain=request.getParameter("domain");
	
		ClientDto cdto=new ClientDto();
		cdto.setDomain(domain);
		ClientDao cdao=new ClientDao();
		cdao.searchData(cdto);
		response.sendRedirect("JobPortal.jsp");
	}

}