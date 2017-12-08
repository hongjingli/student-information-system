package javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javabean.DBconntion;
import javabean.user;

public class Jlogin
{
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement cmd = null;

	
	public Jlogin(){
		conn = DBconntion.getConnection();
	}
	public boolean login(String uname,String pwd) throws Exception{
		boolean i = false;
		try{
			System.out.print(uname);System.out.print(pwd);
			/*Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ManageDB?useUnicode=true&characterEncoding=utf8";
			conn = DriverManager.getConnection(url,"root","yaoxiaoting");*/
			String sql="select * from super where uname=? and pwd=?";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, uname);
			cmd.setString(2, pwd);
			rs = cmd.executeQuery();
			if(rs.next())
			{
				i=true;
			}
			else
			{
				i=false;
			}
			rs.close();
			cmd.close();
			conn.close();
		}catch (SQLException e)
		{
			e.printStackTrace();
			DBconntion.close();
		}
		return i;
	}
	
	public boolean login1(String uname,String pwd){
		boolean i = false;
		try{
			String sql="select * from ordinary where uname=? and pwd=?";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, uname);
			cmd.setString(2, pwd);
			rs = cmd.executeQuery();
			if(rs.next())
			{
				i=true;
			}
			else
			{
				i=false;
			}
			rs.close();
			cmd.close();
			conn.close();
		}catch (SQLException e)
		{
			e.printStackTrace();
			DBconntion.close();
		}
		return i;
	}
	
	public boolean login2(String uname,String pwd){
		boolean i = false;
		try{
			String sql="select * from student where uname=? and pwd=?";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, uname);
			cmd.setString(2, pwd);
			rs = cmd.executeQuery();
			if(rs.next())
			{
				i=true;
			}
			else
			{
				i=false;
			}
			rs.close();
			cmd.close();
			conn.close();
		}catch (SQLException e)
		{
			e.printStackTrace();
			DBconntion.close();
		}
		return i;
	}
	
/*	public List<ouser> studentmessage(ouser u){
		List<ouser> list = new ArrayList<ouser>();
		try{
			
			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from ouser");
			while(rs.next())
			{
				ouser x=new ouser();
				x.setUserName(rs.getString(1));
				x.setPassword(rs.getString(2));
				x.setxueyuan(rs.getString(3));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
	
	public int register(ouser u){
		int r = -1;
		try {
			String sql = "insert into ouser(uname,upwd,xueyuan) values(?,?,?)";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, u.getUserName());
			cmd.setString(2, u.getPassword());
			cmd.setString(3,u.getxueyuan());
			r = cmd.executeUpdate();
		} catch (SQLException e) {
			r = -2;
			e.printStackTrace();
		}
		
		return r;
	}
	
	public int delete(String name,String pwd)
	{
		int r = -1;
		String sql = "delete from ouser where uname=? and upwd=?";
		try{
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,name);
			cmd.setString(2,pwd);
			//cmd.setString(3,xueyuan);
			r = cmd.executeUpdate();
	}catch (SQLException e) {
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
	
	public int newpwd(user u){
		int r = -1;
		try {
			String sql = "update super set pwd=? where uname='"+u.getUserName()+"'";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, u.getPassword());
			r = cmd.executeUpdate();
		} catch (SQLException e) {
			r = -2;
			e.printStackTrace();
		}
		
		return r;
	}
/*	
	public int Re(ouser u,String uname){
		int r = -1;
		try {
			String sql = "update ouser set upwd=?,xueyuan=? where uname='"+uname+"'";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, u.getPassword());
			cmd.setString(2, u.getxueyuan());
			r = cmd.executeUpdate();
		} catch (SQLException e) {
			r = -2;
			e.printStackTrace();
		}
		
		return r;
	}
	
	public List<ouser> allstu()
	{
		List<ouser> list = new ArrayList<ouser>();
		try{
			
			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from ouser");
			while(rs.next())
			{
				ouser x=new ouser();
				x.setUserName(rs.getString(1));
				x.setPassword(rs.getString(2));
				x.setxueyuan(rs.getString(3));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
	
	public List<ouser> some(String uname)
	{
		List<ouser> list = new ArrayList<ouser>();
		try{
			
			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from ouser where uname='"+uname+"'");
			while(rs.next())
			{
				ouser x=new ouser();
				x.setUserName(rs.getString(1));
				x.setPassword(rs.getString(2));
				x.setxueyuan(rs.getString(3));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}*/
}
