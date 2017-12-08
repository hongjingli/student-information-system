package javabean;

public class MajorCollegeMessage {
	
	//MajorMessage
	private String zhuanye;
	private String jianjie;
	private String mcount;
	private String ccount;
	//CollegeMessage
	private String xueyuan;
	private String xjianjie;
	private String yuanzhang;
	private String office;
	
	
	public MajorCollegeMessage(){}
	
	public String getzhuanye()
	{
		return zhuanye;
	}
	public void setzhuanye(String zhuanye) 
	{
		this.zhuanye = zhuanye;
	}
	
	public String getjianjie()
	{
		return jianjie;
	}
	
	public void setjianjie(String jianjie) 
	{
		this.jianjie = jianjie;
	}
	public String getmcount()
	{
		return mcount;
	}
	
	public void setmcount(String mcount) 
	{
		this.mcount = mcount;
	}
	
	public String getccount() 
	{
		return ccount;
	}
	
	public void setccount(String ccount)
	{
		this.ccount = ccount;
	}
	
	
	//College
	public String getxueyuan()
	{
		return xueyuan;
	}
	public void setxueyuan(String xueyuan) 
	{
		this.xueyuan = xueyuan;
	}
	
	public String getxjianjie()
	{
		return xjianjie;
	}
	public void setxjianjie(String xjianjie) 
	{
		this.xjianjie = xjianjie;
	}
	
	public String getyuanzhang()
	{
		return yuanzhang;
	}
	public void setyuanzhang(String yuanzhang) 
	{
		this.yuanzhang = yuanzhang;
	}
	
	public String getoffice()
	{
		return office;
	}
	public void setoffice(String office) 
	{
		this.office = office;
	}
	
}
