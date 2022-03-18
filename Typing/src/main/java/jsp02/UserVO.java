package jsp02;

public class UserVO {

	private String id;
	private String pwd;
	private boolean active;
	private int no;

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

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ",pwd=" + pwd + ", active" + active + "+, no =" + no + "]";
	}
}
