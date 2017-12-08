package javabean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Stuquery {
	private Connection conn = null;
	public Stuquery(){
		conn=DBconntion.getConnection();
	}
	
	public List<StudentMessage> query1(String sid, String phone){
		List<StudentMessage> list = new ArrayList<StudentMessage>();
		try{
			//System.out.print(sid);
			Statement cmd = conn.createStatement();
			String sql="select * from studentmessage where SID='"+sid+"' and PHONE='"+phone+"'";
			
			ResultSet rs = cmd.executeQuery(sql);
			while(rs.next())
			{
				StudentMessage x=new StudentMessage();
				x.setsid(rs.getString(2));
				x.setsname(rs.getString(3));
				x.setxueyuan(rs.getString(4));
				x.setzhuanye(rs.getString(5));
				x.setgrade(rs.getString(6));
				x.setsclass(rs.getString(7));
				x.setphone(rs.getString(8));
				x.setdid(rs.getString(9));
				
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
			
		}
		return list;
	}
	
	public List<StudentMessage> query2(String sid){
		List<StudentMessage> list = new ArrayList<StudentMessage>();
		try{
			//System.out.print(sid);
			Statement cmd = conn.createStatement();
			String sql="select * from studentmessage where SID='"+sid+"'";
			
			ResultSet rs = cmd.executeQuery(sql);
			while(rs.next())
			{
				StudentMessage x=new StudentMessage();
				x.setsid(rs.getString(1));
				x.setsname(rs.getString(2));
				x.setxueyuan(rs.getString(3));
				x.setzhuanye(rs.getString(4));
				x.setgrade(rs.getString(5));
				x.setsclass(rs.getString(6)); 
				x.setphone(rs.getString(7));
				x.setdid(rs.getString(8));
				x.setuname(rs.getString(9));
				x.setpwd(rs.getString(10));
				
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
			
		}
		return list;
	}
}
