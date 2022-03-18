package jw.services.user.vo;

/*
 * 1. Client Data�� Object Modeling
 * 2. Value Object (Value Object Pattern) : Data�� ���� ��ü
 * */
public class UserVO {
	private String name;
	private String gender;
	private String year;
	private String month;
	private String day;
	private String number;
	private String addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "UserVo [ �̸� = " + name + ", ���� = " + gender +", ������� = " + year + month + day 
					+ ", ��ȭ��ȣ : " + number + ", �ּ� : " + addr + "]";
	}
}
