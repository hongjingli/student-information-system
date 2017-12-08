package javabean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javabean.ClassMessage;
import javabean.DBconntion;

public class SClass {
	
	private Connection conn = null;
	//private ResultSet rs = null;
	private PreparedStatement cmd = null;
	
	public SClass(){
		conn=DBconntion.getConnection();
	}
	
	public int add(ClassMessage sclass){
		int r = -1;
		try {
			String sql = "insert into classmessage(CLASS,GRADE,SCOUNT,SROOM,BANZHUREN,FUDAOYUAN) values(?,?,?,?,?,?)";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,sclass.getsclass() );
			cmd.setString(2, sclass.getgrade());
			cmd.setString(3, sclass.getscount());
			cmd.setString(4, sclass.getsroom());
			cmd.setString(5, sclass.getbanzhuren());
			cmd.setString(6, sclass.getfudaoyuan());	
			
			r = cmd.executeUpdate();
			cmd.close();
			
		} catch (SQLException e) {
			r = -2;
			e.printStackTrace();
			try {
				if(cmd != null){
					cmd.close();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return r;
	}
	
	public int delete(String sclass)
	{
		int r = -1;
		String sql = "delete from classmessage where CLASS=?";
		try{
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,sclass);
			r = cmd.executeUpdate();
			conn.close();
			}
		catch (SQLException e) 
		{	}
	return r;
	}
	
	public int modify(ClassMessage cm, String sclass){
		int r = -1;
		String sql = "update classmessage set CLASS = ? , GRADE = ? , SCOUNT = ?, SROOM = ?, BANZHUREN = ?, FUDAOYUAN = ? where CLASS='"+sclass+"'";
		try {
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, cm.getsclass() );
			cmd.setString(2, cm.getgrade());
			cmd.setString(3, cm.getscount());
			cmd.setString(4, cm.getsroom());
			cmd.setString(5, cm.getbanzhuren());
			cmd.setString(6, cm.getfudaoyuan());
			r = cmd.executeUpdate();
			cmd.close();
		} catch (SQLException e) {
			r = -2;
			e.printStackTrace();
			try {
				if(cmd != null){
					cmd.close();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return r;
	}
	
	public List<ClassMessage> allclass()
	{
		List<ClassMessage> list = new ArrayList<ClassMessage>();
		try{
			
			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from classmessage");
			while(rs.next())
			{
				ClassMessage x=new ClassMessage();
				x.setsclass(rs.getString(1));
				x.setgrade(rs.getString(2));
				x.setscount(rs.getString(3));
				x.setsroom(rs.getString(4));
				x.setbanzhuren(rs.getString(5));
				x.setfudaoyuan(rs.getString(6));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
	
	public List<ClassMessage> query(String sclass){
		List<ClassMessage> list = new ArrayList<ClassMessage>();
		try{
			
			Statement cmd = conn.createStatement();
			String sql="select * from classmessage where CLASS='"+sclass+"'";
			//String z=new String("".getBytes("ISO-8859-1"),"utf-8");
			ResultSet rs = cmd.executeQuery(sql);
			while(rs.next())
			{
				ClassMessage x=new ClassMessage();
				x.setsclass(rs.getString(1));
				x.setgrade(rs.getString(2));
				x.setscount(rs.getString(3));
				x.setsroom(rs.getString(4));
				x.setbanzhuren(rs.getString(5));
				x.setfudaoyuan(rs.getString(6));
				
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
			
		}
		return list;
	}
}
