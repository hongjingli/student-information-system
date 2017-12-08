package javabean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	private Connection conn = null;
	//private ResultSet rs = null;
	private PreparedStatement cmd = null;
	public StudentDao(){
		conn=DBconntion.getConnection();
	}
	public int add(StudentMessage st){
		int r = -1;
		try {
			String sql = "insert into studentmessage(SID,SNAME,XUEYUAN,ZHUANYE,GRADE,CLASS,PHONE,DID,uname,pwd) values(?,?,?,?,?,?,?,?,?,?)";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, st.getsid());
			cmd.setString(2, st.getsname());
			cmd.setString(3, st.getxueyuan());
			cmd.setString(4, st.getzhuanye());
			cmd.setString(5, st.getgrade());
			cmd.setString(6, st.getsclass());
			cmd.setString(7, st.getphone());
			cmd.setString(8, st.getdid());
			cmd.setString(9, st.getuname());
			cmd.setString(10, st.getpwd());
			
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
	public int delete(String sid)
	{
		int r = -1;
		String sql = "delete from studentmessage where sid=?";
		try{
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,sid);
			r = cmd.executeUpdate();
			}catch (SQLException e) 
			{
				r = -2;
				e.printStackTrace();
				try {
					if(cmd != null)
					{
						cmd.close();
					}
			} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			}		
			return r;
	}
	
	public int modify(StudentMessage st,String sid){
		int r = -1;
		String ssid = sid;
		System.out.print(ssid);
		String sql = "update studentmessage set sid=?,sname=?,xueyuan=?,zhuanye=?,grade=?,class=?,phone=?,did=?,uname=?,pwd=? where sid='"+ssid+"'";
		try {
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, st.getsid());
			cmd.setString(2, st.getsname());
			cmd.setString(3, st.getxueyuan());
			cmd.setString(4, st.getzhuanye());
			cmd.setString(5, st.getgrade());
			cmd.setString(6, st.getsclass());
			cmd.setString(7, st.getphone());
			cmd.setString(8, st.getdid());
			cmd.setString(9, st.getuname());
			cmd.setString(10, st.getpwd());
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
	
	public List<StudentMessage> allstu()
	{
		List<StudentMessage> list = new ArrayList<StudentMessage>();
		try{

			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from studentmessage");
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
	
/*	public List<StudentMessage> somestu(String username)
	{
		List<StudentMessage> list = new ArrayList<StudentMessage>();
		try{
			
			Statement cmd = conn.createStatement();
			System.out.print(username);
			
			ResultSet r = cmd.executeQuery("select * from ouser where uname='"+username+"'");
			r.next();
			String st=r.getString(3);
			System.out.print(st);
			ResultSet rs = cmd.executeQuery("select * from student where xueyuan='"+st+"'");
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
	*/
	
}
