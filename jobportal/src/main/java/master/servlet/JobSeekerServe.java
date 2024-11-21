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
 * Servlet implementation class JobSeekerServe
 */
@WebServlet("/JobSeekerServe")
public class JobSeekerServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String phno=request.getParameter("phno");
		String domain=request.getParameter("domain");
		String yrexp=request.getParameter("yrexp");
	
		ClientDto cdto=new ClientDto();
		cdto.setUsername(username);
		cdto.setPassword(password);
		cdto.setName(name);
		cdto.setPhno(phno);
		cdto.setDomain(domain);
		cdto.setYrexp(yrexp);
		ClientDao cdao=new ClientDao();
		cdao.insertData(cdto);
		response.sendRedirect("JobApply.jsp");
	}

}