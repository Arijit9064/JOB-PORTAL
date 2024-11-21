package master.dao;
import java.sql.*;

import master.dto.JobDto;
import master.utilities.ConnectionFactory;
public class JobDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from job";
	private String insert_sql="insert into job values(?,?,?,?,?,?,?)";
	public void insertData(JobDto bdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		    ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,bdto.getJobid());
		    ps.setString(2,bdto.getJobnm());
		    ps.setString(3,bdto.getJobtype());
		    ps.setString(4,bdto.getDomain());
		    ps.setString(5,bdto.getValidupto());
		    ps.setString(6,bdto.getYrsexp());
		    ps.setString(7,bdto.getCompanyid());
		    ps.executeUpdate();//insert data
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public ResultSet getData()
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		    st=cn.createStatement();
		    rs=st.executeQuery(select_sql);
		 	
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return rs;
	}
}