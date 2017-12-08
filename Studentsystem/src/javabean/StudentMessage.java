package javabean;

public class StudentMessage {
	private String sid;
	private String sname;
	private String zhuanye;
	private String sclass;
	private String xueyuan;
	private String phone;
	private String grade;
	private String did;
	private String uname;
	private String pwd;
	
	public StudentMessage(){}
	
	public String getsid()
	{
		return sid;
	}
	public void setsid(String sid) 
	{
		this.sid = sid;
	}
	public String getsname()
	{
		return sname;
	}
	
	public void setsname(String sname) 
	{
		this.sname = sname;
	}
	
	public String getzhuanye()
	{
		return zhuanye;
	}
	
	public void setzhuanye(String zhuanye) 
	{
		this.zhuanye = zhuanye;
	}
	public String getsclass()
	{
		return sclass;
	}
	
	public void setsclass(String sclass) 
	{
		this.sclass = sclass;
	}
	
	public String getxueyuan() 
	{
		return xueyuan;
	}
	
	public void setxueyuan(String xueyuan)
	{
		this.xueyuan = xueyuan;
	}
	
	public String getphone() 
	{
		return phone;
	}
	
	public void setphone(String phone)
	{
		this.phone = phone;
	}
	
	public void setgrade(String grade) 
	{
		this.grade = grade;
	}
	public String getgrade() 
	{
		return grade;
	}
	
	public void setdid(String did) 
	{
		this.did = did;
	}
	
	public String getdid() 
	{
		return did;
	}
	
	public void setuname(String uname) 
	{
		this.uname = uname;
	}
	
	public String getuname() 
	{
		return uname;
	}
	
	public void setpwd(String pwd) 
	{
		this.pwd = pwd;
	}
	
	public String getpwd() 
	{
		return pwd;
	}
}
