package javabean;

public class OrdinaryMessage {
	private String uname;
	private String pwd;
	private String newpwd;
	
	public OrdinaryMessage() {
		super();
	}
	public String getuname() {
		return uname;
	}
	public void setuname(String uname) {
		this.uname = uname;
	}
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	public String getnewpwd() {
		return newpwd;
	}
	public void setnewpwd(String newpwd) {
		this.newpwd = newpwd;
	}
	
}
