package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.JobApplyDao;
import master.dto.JobApplyDto;

/**
 * Servlet implementation class JobApplyServe
 */
@WebServlet("/JobApplyServe")
public class JobApplyServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String jname=request.getParameter("jname");
		String jobid=request.getParameter("jobid");
		String applydt=request.getParameter("applydt");
	
		JobApplyDto jdto=new JobApplyDto();
		jdto.setJname(jname);
		jdto.setJobid(jobid);
		jdto.setApplydt(applydt);
		JobApplyDao jdao=new JobApplyDao();
		jdao.insertData(jdto);
		response.sendRedirect("JobPortal.jsp");
	}

}