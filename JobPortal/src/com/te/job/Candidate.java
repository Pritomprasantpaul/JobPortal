package com.te.job;

public class Candidate {
	String name;
	char gender;
	double percentage;
	int yearOfPass;
	long mobile;
	public Candidate(String name, char gender, double percentage, int yearOfPass, long mobile) {
		this.name = name;
		this.gender = gender;
		this.percentage = percentage;
		this.yearOfPass = yearOfPass;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", gender=" + gender + ", percentage=" + percentage + ", yearOfPass="
				+ yearOfPass + ", mobile=" + mobile + "]";
	}
	
}
