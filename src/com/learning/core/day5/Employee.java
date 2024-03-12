package com.learning.core.day05;

public class Employee 
{
	private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;
    private int employeeId;

    public Employee(String name, long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, int voterId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public int getVoterId() {
        return voterId;
    }

}
