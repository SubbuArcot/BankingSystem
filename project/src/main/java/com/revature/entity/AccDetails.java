package com.revature.entity;

public class AccDetails {


	private int id;
	private String user_name;
	private String phone_no;
	private String address;
	private double balance;
	private int aadhar_no;
	
	
	

	public AccDetails(String user_name, String phone_no, String address, double opening_balance,int aadhar) {
		super();
	//	this.id = id;
		this.user_name = user_name;
		this.phone_no = phone_no;
		this.address = address;
		this.balance = opening_balance;
		this.aadhar_no=aadhar;	}
	
	public AccDetails() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAadhar_no() {
		return aadhar_no;
	}


	public void setAadhar_no(int aadhar) {
		this.aadhar_no = aadhar;
	}
	@Override
	public String toString() {
		return "AccDetails [id :" + id + ", user_name : " + user_name + ", phone_no : " + phone_no +", address : "+address+", balance : " +balance+"] Aadhar_No: [" +aadhar_no+ "]";
}

}