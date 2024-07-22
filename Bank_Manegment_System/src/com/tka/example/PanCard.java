package com.tka.example;

public class PanCard {

	private String name;
	private String dob;
	private String panNum;
	
	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PanCard(String name, String dob, String panNum) {
		super();
		this.name = name;
		this.dob = dob;
		this.panNum = panNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	@Override
	public String toString() {
		return "PanCard [name=" + name + ", dob=" + dob + ", panNum=" + panNum + "]";
	}
	
	
	
}
