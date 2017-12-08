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
	
	public List<Student> query(String id,String name,String dorid,String phone){
		List<Student> list = new ArrayList<Student>();
		try{
			
			Statement cmd = conn.createStatement();
			//System.out.print(id);System.out.print(name);System.out.print(dorid);System.out.print(phone);
			String sql="";
			String z=new String("".getBytes("ISO-8859-1"),"utf-8");
			boolean result = z.equals(name);
			if(id!=""&&result&&dorid==""&&phone=="")
			{
				sql="select * from student where id='"+id+""
						+ "'";
			}
			else if(id==""&&name!=""&&dorid==""&&phone=="")
			{
				sql="select * from student where name='"+name+"'";
			}
			else if(id==""&&result&&dorid!=""&&phone=="")
			{
				sql="select * from student where dorid='"+dorid+"'";
			}
			else if(id==""&&result&&dorid==""&&phone!="")
			{
				sql="select * from student where phone='"+phone+"'";
			}
			else if(id!=""&&name!=""&&dorid==""&&phone=="")
			{
				sql="select * from student where id='"+id+"' and name='"+name+"'";
			}
			else if(id!=""&&result&&dorid!=""&&phone=="")
			{
				sql="select * from student where id='"+id+"' and dorid='"+dorid+"'";
			}
			else if(id!=""&&result&&dorid==""&&phone!="")
			{
				sql="select * from student where id='"+id+"' and phone='"+phone+"'";
			}
			else if(id==""&&name!=""&&dorid!=""&&phone=="")
			{
				sql="select * from student where name='"+name+"' and dorid='"+dorid+"'";
			}
			else if(id==""&&name!=""&&dorid==""&&phone!="")
			{
				sql="select * from student where name='"+name+"' and phone='"+phone+"'";
			}
			else if(id==""&&result&&dorid!=""&&phone!="")
			{
				sql="select * from student where dorid='"+dorid+"' and phone='"+phone+"'";
			}
			else if(id!=""&&name!=""&&dorid!=""&&phone=="")
			{
				sql="select * from student where id='"+id+"' and name='"+name+"' and dorid='"+dorid+"'";
			}
			else if(id!=""&&name!=""&&dorid==""&&phone!="")
			{
				sql="select * from student where id='"+id+"' and name='"+name+"' and phone='"+phone+"'";
			}
			else if(id==""&&name!=""&&dorid!=""&&phone!="")
			{
				sql="select * from student where name='"+name+"' and dorid='"+dorid+"' and phone='"+phone+"'";
			}
			else if(id!=""&&name!=""&&dorid!=""&&phone!="")
			{
				sql="select * from student where id='"+id+"' and name='"+name+"' and dorid='"+dorid+"' and phone='"+phone+"'";
			}
			ResultSet rs = cmd.executeQuery(sql);
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
	
	public List<Student> query(String id){
		List<Student> list = new ArrayList<Student>();
		try{
			
			Statement cmd = conn.createStatement();
			//System.out.print(id);System.out.print(name);System.out.print(dorid);System.out.print(phone);
			String sql="select * from student where id='"+id+"'";
			

			ResultSet rs = cmd.executeQuery(sql);
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
