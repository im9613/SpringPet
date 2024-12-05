package com.test.pet.model;

import lombok.Data;

@Data
public class AdoptionApplication {
	
	private String name;
	private String gender;
	private String age;
    private String telephone;
	private String email;
	private String calltime;
	private String region;
	private String maritalStatus;
	private String job;
	private String q1;
	private String q1Memo; 
	private String q2;
	private String q3Adult;
	private String q3Minor;
	private String q4;
	private String q5;
	private String q6Memo;
	private String q7;
	private String q8;
	private String q9;
	private String q10;
	private String q11;
	private String q12;
	private String q13;
	
	
	
	@Override
	public String toString() {
	    return "AdoptionApplication{" +
	            "name='" + name + '\'' +
	            ", gender='" + gender + '\'' +
	            ", age=" + age +
	            ", telephone='" + telephone + '\'' +
	            ", email='" + email + '\'' +
	            ", calltime='" + calltime + '\'' +
	            ", region='" + region + '\'' +
	            ", maritalStatus=" + maritalStatus +
	            ", job='" + job + '\'' +
	            ", q1=" + q1 +
	            ", q1Memo='" + q1Memo + '\'' +
	            ", q2=" + q2 +
	            ", q3Adult=" + q3Adult +
	            ", q3Minor=" + q3Minor +
	            ", q4=" + q4 +
	            ", q5=" + q5 +
	            ", q6Memo='" + q6Memo + '\'' +
	            ", q7=" + q7 +
	            ", q8='" + q8 + '\'' +
	            ", q9='" + q9 + '\'' +
	            ", q10='" + q10 + '\'' +
	            ", q11=" + q11 +
	            ", q12=" + q12 +
	            ", q13='" + q13 + '\'' +
	            '}';
	}

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
