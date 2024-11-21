package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.JobDao;
import master.dto.JobDto;

/**
 * Servlet implementation class JobServe
 */
@WebServlet("/JobServe")
public class JobServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String jobid=request.getParameter("jobid");
		String jobnm=request.getParameter("jobnm");
		String jobtype=request.getParameter("jobtype");
		String domain=request.getParameter("domain");
		String validupto=request.getParameter("validupto");
		String yrsexp=request.getParameter("yrsexp");
		String companyid=request.getParameter("companyid");
	
		JobDto bdto=new JobDto();
		bdto.setJobid(jobid);
		bdto.setJobnm(jobnm);
		bdto.setJobtype(jobtype);
		bdto.setDomain(domain);
		bdto.setValidupto(validupto);
		bdto.setYrsexp(yrsexp);
		bdto.setCompanyid(companyid);
		JobDao bdao=new JobDao();
		bdao.insertData(bdto);
		response.sendRedirect("JobApply.jsp");
	}

}