package javabean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javabean.MajorCollegeMessage;
import javabean.DBconntion;

public class College {
	
	private Connection conn = null;
	//private ResultSet rs = null;
	private PreparedStatement cmd = null;
	
	public College(){
		conn=DBconntion.getConnection();
	}
	
	public int add(MajorCollegeMessage xy){
		int r = -1;
		try {
			String sql = "insert into collegemessage(XUEYUAN,XJIANJIE,YUANZHANG,OFFICE) values(?,?,?,?)";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, xy.getxueyuan() );
			cmd.setString(2, xy.getxjianjie());
			cmd.setString(3, xy.getyuanzhang());
			cmd.setString(4, xy.getoffice());
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
	
	public int delete(String xy)
	{
		int r = -1;
		String sql = "delete from collegemessage where XUEYUAN=?";
		try{
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,xy);
			r = cmd.executeUpdate();
			conn.close();
			}
		catch (SQLException e) 
		{	}
	return r;
	}
	
	public int modify(MajorCollegeMessage xy,String xueyuan){
		int r = -1;
		String sql = "update collegemessage set XUEYUAN = ? , XJIANJIE = ? , YUANZHANG = ?, OFFICE = ? where XUEYUAN='"+xueyuan+"'";
		try {
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, xy.getxueyuan());
			cmd.setString(2, xy.getxjianjie());
			cmd.setString(3, xy.getyuanzhang());
			cmd.setString(4, xy.getoffice());
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
	
	public List<MajorCollegeMessage> allXY()
	{
		List<MajorCollegeMessage> list = new ArrayList<MajorCollegeMessage>();
		try{
			
			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from collegemessage");
			while(rs.next())
			{
				MajorCollegeMessage x=new MajorCollegeMessage();
				x.setxueyuan(rs.getString(1));
				x.setxjianjie(rs.getString(2));
				x.setyuanzhang(rs.getString(3));
				x.setoffice(rs.getString(4));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
	
	public List<MajorCollegeMessage> query(String xueyuan){
		List<MajorCollegeMessage> list = new ArrayList<MajorCollegeMessage>();
		try{
			
			Statement cmd = conn.createStatement();
			String sql="select * from collegemessage where XUEYUAN='"+xueyuan+"'";
			//String z=new String("".getBytes("ISO-8859-1"),"utf-8");
			
			ResultSet rs = cmd.executeQuery(sql);
			while(rs.next())
			{
				MajorCollegeMessage x=new MajorCollegeMessage();
				x.setxueyuan(rs.getString(1));
				x.setxjianjie(rs.getString(2));
				x.setyuanzhang(rs.getString(3));
				x.setoffice(rs.getString(4));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
			
		}
		return list;
	}
}
