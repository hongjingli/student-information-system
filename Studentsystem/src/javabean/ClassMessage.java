package javabean;

public class ClassMessage {
	private String sclass;
	private String grade;
	private String scount;
	private String sroom;
	private String banzhuren;
	private String fudaoyuan;
	
	public ClassMessage(){}
	
	public String getsclass()
	{
		return sclass;
	}
	public void setsclass(String sclass) 
	{
		this.sclass = sclass;
	}
	
	public String getgrade()
	{
		return grade;
	}
	
	public void setgrade(String grade) 
	{
		this.grade = grade;
	}
	public String getscount()
	{
		return scount;
	}
	
	public void setscount(String scount) 
	{
		this.scount = scount;
	}
	
	public String getsroom() 
	{
		return sroom;
	}
	
	public void setsroom(String sroom)
	{
		this.sroom = sroom;
	}
	
	public String getbanzhuren() 
	{
		return banzhuren;
	}
	
	public void setbanzhuren(String banzhuren)
	{
		this.banzhuren = banzhuren;
	}
	
	public void setfudaoyuan(String fudaoyuan) 
	{
		this.fudaoyuan = fudaoyuan;
	}
	public String getfudaoyuan() 
	{
		return fudaoyuan;
	}

}
