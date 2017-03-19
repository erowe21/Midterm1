package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseId;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(UUID courseid, String coursename, int gradepoints, eMajor major){
		CourseId = courseid;
		CourseName = coursename;
		GradePoints = gradepoints;
		Major = major;
	}

	
    public void setCourseId(UUID CourseId){
        this.CourseId = CourseId;
    }

    public UUID getCourseId(){
        return this.CourseId;
    }	
    public void setCourseName(String CourseName){
        this.CourseName = CourseName;
    }

    public String getCourseName(){
        return this.CourseName;
    }
    public void setGradePoints(int GradePoints){
        this.GradePoints = GradePoints;
    }

    public int getGradePoints(){
        return this.GradePoints;
    }
    public eMajor geteMajor(){
    	return Major;
    }
    public void setMajor(eMajor Major){
    	this.Major = Major; 
    }
}

