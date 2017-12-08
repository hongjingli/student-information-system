package javabean;

public class XY {

	private String xueyuan;
	private String zhuanye;
	
	public XY(){}
	
	public XY(String xueyuan,String zhuanye)
	{
		this.xueyuan=xueyuan;
		this.zhuanye=zhuanye;
	}
	public String getxueyuan() {
		return xueyuan;
	}
	public void setxueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	public String getzhuanye() {
		return zhuanye;
	}
	public void setzhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
}
