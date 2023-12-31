package entity;

import java.time.LocalDate;

public class User {
	private String uid; 
	private String pwd; 
	private String uname; 
	private String email; 
	private LocalDate regDate; 
	private int isDeleted; 
	private String profile; 
	private String addr;
	
	// update에 사용
	public User(String uid, String uname, String email, String profile, String addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.profile = profile;
		this.addr = addr;
	}
	// insert에 사용
	public User(String uid, String pwd, String uname, String email, String profile, String addr) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.profile = profile;
		this.addr = addr;
	}
	
	public User(String uid, String pwd, String uname, String email, LocalDate regDate, int isDeleted, String profile,
			String addr) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.regDate = regDate;
		this.isDeleted = isDeleted;
		this.profile = profile;
		this.addr = addr;
	} 
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", pwd=" + pwd + ", uname=" + uname + ", email=" + email + ", regDate=" + regDate
				+ ", isDeleted=" + isDeleted + ", profile=" + profile + ", addr=" + addr + "]";
	}
}
