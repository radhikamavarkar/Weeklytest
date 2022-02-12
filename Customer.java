package com.xworkz.oops;

public class Customer { 
	private int id; 
	private String name; 
	private long accountnumber;  
	private short ifsccode; 
	private String sign;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public short getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(short ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	} 
	
	public String getAll() { 
		String c = id+"\t"+name+"\t"+accountnumber+"\t"+ifsccode+"\t"+sign+"\t"+getAll();
		return c;
	}

}
