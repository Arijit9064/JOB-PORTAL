package master.dao;
import java.sql.*;
import master.dto.AdminDto;
import master.utilities.ConnectionFactory;
public class AdminDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from company";
	private String insert_sql="insert into company values(?,?,?)";
	private String delete_sql="delete from company where compname=?";
	private String update_sql="update company set compphno=?, compname=? where companyid=?";
	public void insertData(AdminDto adto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		    ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,adto.getCompanyid());
		    ps.setString(2,adto.getCompname());
		    ps.setString(3,adto.getCompphno());
		    ps.executeUpdate();//insert data
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData(AdminDto adto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		    ps=cn.prepareStatement(delete_sql);
		    ps.setString(1,adto.getCompname());
		    
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
	public void updateData(AdminDto adto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		    ps=cn.prepareStatement(update_sql);
		    ps.setString(1,adto.getCompanyid());
		    ps.setString(3,adto.getCompname());
		    ps.setString(2,adto.getCompphno());
		    ps.executeUpdate();//insert data
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}