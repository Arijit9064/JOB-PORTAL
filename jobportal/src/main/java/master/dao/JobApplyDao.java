package master.dao;
import java.sql.*;

import master.dto.JobApplyDto;
import master.utilities.ConnectionFactory;
public class JobApplyDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from jobapply";
	private String insert_sql="insert into jobapply values(?,?,?)";
	public void insertData(JobApplyDto jdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		    ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,jdto.getJname());
		    ps.setString(2,jdto.getJobid());
		    ps.setString(3,jdto.getApplydt());
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