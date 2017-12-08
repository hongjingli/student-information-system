package javabean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javabean.XY;
import javabean.DBconntion;

public class XueYuan {
	
	private Connection conn = null;
	//private ResultSet rs = null;
	private PreparedStatement cmd = null;
	
	public XueYuan(){
		conn=DBconntion.getConnection();
	}
	
	public int add(XY xy){
		int r = -1;
		try {
			String sql = "insert into xy(xueyuan,zhuanye) values(?,?)";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,xy.getxueyuan() );
			cmd.setString(2, xy.getzhuanye());
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
		String sql = "delete from xy where zhuanye=?";
		try{
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,zhuanye);
			//cmd.setString(2,zhuanye);
			r = cmd.executeUpdate();
			conn.close();
			}
		catch (SQLException e) 
		{	}
	return r;
	}
	
	public int modify(XY xy,String xueyuan,String zhuanye){
		int r = -1;
		String sql = "update xy set xueyuan = ? , zhuanye = ? where xueyuan='"+xueyuan+"' and zhuanye='"+zhuanye+"'";
		try {
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, xy.getxueyuan());
			cmd.setString(2, xy.getzhuanye());
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
	
	public List<XY> allXYs()
	{
		List<XY> list = new ArrayList<XY>();
		try{
			
			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from xy");
			while(rs.next())
			{
				XY x=new XY();
				x.setxueyuan(rs.getString(1));
				x.setzhuanye(rs.getString(2));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
	
	public List<XY> query(String xueyuan,String zhuanye){
		List<XY> list = new ArrayList<XY>();
		try{
			
			Statement cmd = conn.createStatement();
			String sql="select * from xy where xueyuan='"+xueyuan+"' and zhuanye='"+zhuanye+"'";
			//String z=new String("".getBytes("ISO-8859-1"),"utf-8");
			ResultSet rs = cmd.executeQuery(sql);
			while(rs.next())
			{
				XY x=new XY();
				x.setxueyuan(rs.getString(1));
				x.setzhuanye(rs.getString(2));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
			
		}
		return list;
	}
}
