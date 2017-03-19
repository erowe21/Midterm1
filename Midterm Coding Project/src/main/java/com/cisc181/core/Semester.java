package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterId;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(UUID semesterid, Date startdate, Date enddate){
		SemesterId = semesterid;
		StartDate = startdate;
		EndDate = enddate;
	}


    public void setSemesterId(UUID SemesterId){
        this.SemesterId = SemesterId;
    }

    public UUID getSemesterId(){
        return this.SemesterId;
    }	
    public void setStartDate(Date StartDate){
        this.StartDate = StartDate;
    }

    public Date getStartDate(){
        return this.StartDate;
    }
    public void setGradePoints(Date EndDate){
        this.EndDate = EndDate;
    }

    public Date getEndDate(){
        return this.EndDate;
    }
    
}

