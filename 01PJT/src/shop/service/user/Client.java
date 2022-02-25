package shop.service.user;

public class Client {
	//Field
	private String name;
	String hp;
	protected String job;
	public boolean gender;
	public static final String nationality = "¥Î«—πŒ±π";

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String name, String hp, String job, boolean gender) {
		super();
		this.name = name;
		this.hp = hp;
		this.job = job;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Client [name=" + name + ", hp=" + hp + ", job=" + job + ", gender=" + gender + "]";
	}
	

}
