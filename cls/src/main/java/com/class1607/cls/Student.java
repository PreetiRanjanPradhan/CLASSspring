package com.class1607.cls;

public class Student {
	private int RegdNo;
	private String Name;
	private String Address;
	
	public int getRegdNo() {
		return RegdNo;
	}


	public void setRegdNo(int regdNo) {
		RegdNo = regdNo;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	@Override
	public String toString() {
		return "Student [RegdNo=" + RegdNo + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	
}
