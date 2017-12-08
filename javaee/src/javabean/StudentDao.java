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
	public int add(Student st){
		int r = -1;
		try {
			String sql = "insert into student(id,name,zhuanye,class,xueyuan,phone,dorid,did) values(?,?,?,?,?,?,?,?)";
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, st.getid());
			cmd.setString(2, st.getname());
			cmd.setString(3, st.getzhuanye());
			cmd.setString(4, st.getclasss());
			cmd.setString(5, st.getxueyuan());
			cmd.setString(6, st.getphone());
			cmd.setString(7, st.getdorid());
			cmd.setString(8, st.getdid());
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
	public int delete(String id)
	{
		int r = -1;
		String sql = "delete from student where id=?";
		try{
			cmd = conn.prepareStatement(sql);
			cmd.setString(1,id);
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
	
	public int modify(Student st,String id){
		int r = -1;
		String pid = id;
		System.out.print(pid);
		String sql = "update student set id=?,name=?,zhuanye=?,class=?,xueyuan=?,phone=?,dorid=?,did=? where id='"+pid+"'";
		try {
			cmd = conn.prepareStatement(sql);
			cmd.setString(1, st.getid());
			cmd.setString(2, st.getname());
			cmd.setString(3, st.getzhuanye());
			cmd.setString(4, st.getclasss());
			cmd.setString(5, st.getxueyuan());
			cmd.setString(6, st.getphone());
			cmd.setString(7, st.getdorid());
			cmd.setString(8, st.getdid());
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
	
	public List<Student> allstu()
	{
		List<Student> list = new ArrayList<Student>();
		try{

			Statement cmd = conn.createStatement();
			ResultSet rs = cmd.executeQuery("select * from student");
			while(rs.next())
			{
				Student x=new Student();
				x.setid(rs.getString(1));
				x.setname(rs.getString(2));
				x.setzhuanye(rs.getString(3));
				x.setclasss(rs.getString(4));
				x.setxueyuan(rs.getString(5));
				x.setphone(rs.getString(6));
				x.setdorid(rs.getString(7));
				x.setdid(rs.getString(8));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
	
	public List<Student> somestu(String username)
	{
		List<Student> list = new ArrayList<Student>();
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
				Student x=new Student();
				x.setid(rs.getString(1));
				x.setname(rs.getString(2));
				x.setzhuanye(rs.getString(3));
				x.setclasss(rs.getString(4));
				x.setxueyuan(rs.getString(5));
				x.setphone(rs.getString(6));
				x.setdorid(rs.getString(7));
				x.setdid(rs.getString(8));
				list.add(x);
			}
			conn.close();
		}catch(Exception ex){
		}
		return list;
	}
	
	
}
