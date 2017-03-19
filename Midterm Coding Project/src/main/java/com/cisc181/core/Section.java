package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Section {
	private UUID CourseId;
	private UUID SemesterId;
	private UUID SectionId;
	private int RoomId;
	
	public Section(UUID courseid, UUID semesterid, UUID sectionid, int roomid){
		CourseId = courseid;
		SemesterId = semesterid;
		SectionId = sectionid;
		RoomId = roomid;
	}
	
    public void setCourseId(UUID CourseId){
        this.CourseId = CourseId;
    }

    public UUID getCourseId(){
        return this.CourseId;
    }	
    public void setSemesterId(UUID SemesterId){
        this.SemesterId = SemesterId;
    }

    public UUID getSemesterId(){
        return this.SemesterId;
    }
    public void setSectionId(UUID SectionId){
        this.SectionId = SectionId;
    }

    public UUID getSectionId(){
        return this.SectionId;
    }
    public void setRoomId(){
    	this.RoomId = RoomId;
    }
    public int getRoomId(){
    	return this.RoomId;
    }

}
