package jw.service.user.vo;

/*
 * 1. Client Data?? Object Modeling
 * 2. Value Object (Value Object Pattern) : Data?? ???? ??ü
 * */
public class UserVO {
	private String id;
	private String pwd;
	private boolean active;
	private int no;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public UserVO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "UserVo [ id = " + id + ", pwd = " + pwd +", active = " + active + " +, no="+  no +"]";
	}
}
