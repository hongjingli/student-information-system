package javabean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Ordinary {
	
	
	private Connection conn = null;
	//private ResultSet rs = null;
	private PreparedStatement cmd = null;
	
	public Ordinary(){
		conn=DBconntion.getConnection();
	}
	
	
	public int delete(String uname, String pwd)
	{
		int r = -1;
		String sql = "delete from ordinary where uname=? and pwd=?";
		try{
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,uname);
			cmd.setString(2,pwd);
			r = cmd.executeUpdate();
			conn.close();
			}
		catch (SQLException e) 
		{	}
	return r;
	}
	
	public List<OrdinaryMessage> alladmin()
	{
		List<OrdinaryMessage> list = new ArrayList<OrdinaryMessage>();
		try{
			
			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from ordinary");
			while(rs.next())
			{
				OrdinaryMessage x=new OrdinaryMessage();
				x.setuname(rs.getString(1));
				x.setpwd(rs.getString(2));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
}
