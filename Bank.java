package com.xworkz.oops;

public class Bank { 
	private String name; 
	private String  adress; 
	private String city; 
	private String branch; 
	private Customer customer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getAll() { 
		String b = name+"\t"+adress+"\t"+city+"\t"+branch+"\t"+customer+"\t"+getAll();
		return b;
	}
	

}
