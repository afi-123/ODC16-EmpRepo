package com.hcltech.domain;

public class Emp {

	private int empID;
	private String empName;
	private double empSal;
	
	public Emp(int empID, String empName, double empSal) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Emp [empId: " + empID + "empName: " + empName + "empSal: " + empSal;
	}
	
	
}
