package com.class1807.basicconstructor;

public class Faculty {
	private int EmpId;
	private String name;
	private String Department;
	
	public Faculty(int empId, String name, String department) {
		super();
		EmpId = empId;
		this.name = name;
		Department = department;
	}
	
	@Override
	public String toString() {
		return "Faculty [EmpId=" + EmpId + ", name=" + name + ", Department=" + Department + "]";
	}
	
	

	
}
