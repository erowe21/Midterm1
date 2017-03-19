package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionId;
	private UUID StudentId;
	private UUID EnrollmentId;
	private double Grade;
	
	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		this.SectionId = SectionId;
		this.StudentId = StudentId;
		this.EnrollmentId = EnrollmentId;
	}
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
	public double getGrade(){
		return this.Grade;
	}

}
