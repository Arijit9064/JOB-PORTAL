package master.dao;
import java.sql.*;
import master.dto.ClientDto;
import master.utilities.ConnectionFactory;
public class ClientDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from client";
	private String insert_sql="insert into client values(?,?,?,?,?,?)";
	private String search_sql="select * from client where domain=?";
	public void insertData(ClientDto cdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		    ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,cdto.getUsername());
		    ps.setString(2,cdto.getPassword());
		    ps.setString(3,cdto.getName());
		    ps.setString(4,cdto.getPhno());
		    ps.setString(5,cdto.getDomain());
		    ps.setString(6,cdto.getYrexp());
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
	public void searchData(ClientDto cdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		    ps=cn.prepareStatement(search_sql);
		    ps.setString(5,cdto.getDomain());
		    ps.execute();//insert data
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}