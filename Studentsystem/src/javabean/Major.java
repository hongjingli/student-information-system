package javabean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javabean.MajorCollegeMessage;
import javabean.DBconntion;

public class Major {
	
	private Connection conn = null;
	//private ResultSet rs = null;
	private PreparedStatement cmd = null;
	
	public Major(){
		conn=DBconntion.getConnection();
	}
	
	public int add(MajorCollegeMessage zhuanye){
		int r = -1;
		try {
			String sql = "insert into majormessage(ZHUANYE,JIANJIE,MCOUNT,CCOUNT) values(?,?,?,?)";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,zhuanye.getzhuanye() );
			cmd.setString(2, zhuanye.getjianjie());
			cmd.setString(3, zhuanye.getmcount());
			cmd.setString(4, zhuanye.getccount());
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
	
	public int delete(String zhuanye)
	{
		int r = -1;
		String sql = "delete from majormessage where ZHUANYE=?";
		try{
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,zhuanye);
			r = cmd.executeUpdate();
			conn.close();
			}
		catch (SQLException e) 
		{	}
	return r;
	}
	
/*	public int modify(MajorCollegeMessage zhuanye){
		int r = -1;
		String sql = "update majormessage set ZHUANYE = ? , JIANJIE = ? , MCOUNT = ?, CCOUNT = ? where ZHUANYE='"+zhuanye+"'";
		try {
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, zhuanye.getzhuanye());
			cmd.setString(2, zhuanye.getjianjie());
			cmd.setString(3, zhuanye.getmcount());
			cmd.setString(4, zhuanye.getccount());
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
	}*/
	
	public int modify(MajorCollegeMessage zy,String zhuanye){
		int r = -1;
		String sql = "update majormessage set ZHUANYE = ? , JIANJIE = ? , MCOUNT = ?, CCOUNT = ? where ZHUANYE='"+zhuanye+"'";
		try {
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, zy.getzhuanye());
			cmd.setString(2, zy.getjianjie());
			cmd.setString(3, zy.getmcount());
			cmd.setString(4, zy.getccount());
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
	
	public List<MajorCollegeMessage> allzhuanye()
	{
		List<MajorCollegeMessage> list = new ArrayList<MajorCollegeMessage>();
		try{
			
			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from majormessage;");
			while(rs.next())
			{
				MajorCollegeMessage x=new MajorCollegeMessage();
				x.setzhuanye(rs.getString(1));
				x.setjianjie(rs.getString(2));
				x.setmcount(rs.getString(3));
				x.setccount(rs.getString(4));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
	
	public List<MajorCollegeMessage> query(String zhuanye){
		List<MajorCollegeMessage> list = new ArrayList<MajorCollegeMessage>();
		try{
			
			Statement cmd = conn.createStatement();
			String sql="select * from majormessage where ZHUANYE='"+zhuanye+"'";
			//String z=new String("".getBytes("ISO-8859-1"),"utf-8");
			ResultSet rs = cmd.executeQuery(sql);
			while(rs.next())
			{
				MajorCollegeMessage x=new MajorCollegeMessage();
				x.setzhuanye(rs.getString(1));
				x.setjianjie(rs.getString(2));
				x.setmcount(rs.getString(3));
				x.setccount(rs.getString(4));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
			
		}
		return list;
	}
}
