package day08;
//package jp03.part06;

import java.io.*;

/*
	- 회원정보를 가지고 있는 UserVo :: ValueObject ==> RMI / EJB (Value Object Pattern)
	- 회원 정보를 갖는 UserVo instance 는 file에 저장될 것이며
	- 객체를 입출력자원, networ 자원으로 이동되기 위해서는 Serializable 이라는 marker interface를 구현해야한다.
		==> 객체직열화
*/

public class UserVO implements Serializable{

	//Field
	private int no;
	private String name;

	//Constructor
	public UserVO(){
	}
	public UserVO(int no, String name){
		this.no = no;
		this.name = name;
	}

	//method
	//setter method
	public void setNo(int no){
		this.no = no;
	}
	public void setName(String name){
		this.name = name;
	}

	//getter method
	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}

	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("UserVO [ no =");
		builder.append(no);
		builder.append(", name = ");
		builder.append(name);
		builder.append(" ]");
		return builder.toString();

	}
}
