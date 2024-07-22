package com.tka.example;

public class AdharCard {

	private String myname;
	private String address;
	private String dob;
	private String adharNum;
	public AdharCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdharCard(String myname, String address, String dob, String adharNum) {
		super();
		this.myname = myname;
		this.address = address;
		this.dob = dob;
		this.adharNum = adharNum;
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAdharNum() {
		return adharNum;
	}
	public void setAdharNum(String adharNum) {
		this.adharNum = adharNum;
	}
	@Override
	public String toString() {
		return "AdharCard [myname=" + myname + ", address=" + address + ", dob=" + dob + ", adharNum=" + adharNum + "]";
	}
	
}
