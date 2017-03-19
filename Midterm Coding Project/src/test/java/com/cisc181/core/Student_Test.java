package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private static ArrayList<Course> courseList;
	private static ArrayList<Semester> semesterList;
	private static ArrayList<Section> sectionList;
	private static ArrayList<Student> studentList;
	private static ArrayList<Enrollment> enrollmentList;

	@BeforeClass
	public static void setup() throws PersonException, ParseException{
		ArrayList<Course> courselist = new ArrayList<>();
		ArrayList<Semester> semesterlist = new ArrayList<>();
		ArrayList<Section> sectionlist = new ArrayList<>();
		ArrayList<Student> studentlist = new ArrayList<>();

	courselist.add(new Course(UUID.randomUUID(), "Intro to Computer Science",
			3, eMajor.COMPSI));
	courselist.add(new Course(UUID.randomUUID(), "Calculus C",
			3, eMajor.PHYSICS));
	courselist.add(new Course(UUID.randomUUID(), "Intro to Microeconomics",
			3, eMajor.BUSINESS));
	
	semesterlist.add(new Semester(UUID.randomUUID(), new GregorianCalendar(2016, 8, 30).getTime(),
			new GregorianCalendar(2016, 12, 15).getTime()));
	semesterlist.add(new Semester(UUID.randomUUID(), new GregorianCalendar(2017, 1, 7).getTime(),
			new GregorianCalendar(2017, 4, 20).getTime()));
	
	sectionlist.add(new Section(courseList.get(0).getCourseId(),semesterList.get(0).getSemesterId(),UUID.randomUUID(),121));
	sectionlist.add(new Section(courseList.get(1).getCourseId(),semesterList.get(0).getSemesterId(),UUID.randomUUID(),221));
	sectionlist.add(new Section(courseList.get(2).getCourseId(),semesterList.get(0).getSemesterId(),UUID.randomUUID(),321));
	sectionlist.add(new Section(courseList.get(0).getCourseId(),semesterList.get(1).getSemesterId(),UUID.randomUUID(),421));
	sectionlist.add(new Section(courseList.get(1).getCourseId(),semesterList.get(1).getSemesterId(),UUID.randomUUID(),521));
	sectionlist.add(new Section(courseList.get(2).getCourseId(),semesterList.get(1).getSemesterId(),UUID.randomUUID(),621));
	
	studentlist.add(new Student("Eric","Michael","Rowe",new GregorianCalendar(1996, 2, 2).getTime(), eMajor.BUSINESS,
			"Newark", "(302)-123-4567", "ericrowe@udel.edu"));
	studentlist.add(new Student("Elena","","DelleDonne",new GregorianCalendar(1990, 4, 7).getTime(), eMajor.NURSING,
			"Wilmington", "(302)-234-5678", "delledonne@udel.edu"));
	studentlist.add(new Student("Aaron","Bradley","Charles",new GregorianCalendar(1994, 6, 21).getTime(), eMajor.COMPSI,
			"Milford", "(302)-345-6789", "acharles@udel.edu"));
	studentlist.add(new Student("Danielle","Elaine","Francis",new GregorianCalendar(1996, 8, 7).getTime(), eMajor.NURSING,
			"Seaford", "(302)-456-7890", "efrancis@udel.edu"));
	studentlist.add(new Student("George","Harrold","Inman",new GregorianCalendar(1998, 10, 21).getTime(), eMajor.CHEM,
			"Smyrna", "(302)-098-7654", "Ginman@udel.edu"));
	studentlist.add(new Student("Jane","Kate","Lucifer",new GregorianCalendar(1999, 7, 16).getTime(), eMajor.CHEM,
			"Dover", "(302)-987-6543", "JKL@udel.edu"));
	studentlist.add(new Student("Mark","Nicholas","Patterson",new GregorianCalendar(1996, 3, 3).getTime(), eMajor.BUSINESS,
			"Elsmere", "(302)-876-5432", "mpat@udel.edu"));
	studentlist.add(new Student("Oliver","Quincey","Roberts",new GregorianCalendar(1995, 4, 7).getTime(), eMajor.NURSING,
			"Wyoming", "(302)-765-4321", "orob@udel.edu"));
	studentlist.add(new Student("Steven","Travis","Upshall",new GregorianCalendar(1995, 2, 2).getTime(), eMajor.BUSINESS,
			"Dewey", "(302)-012-3456", "upshall@udel.edu"));
	studentlist.add(new Student("Victoria","Wendy","Xi",new GregorianCalendar(1998, 9, 17).getTime(), eMajor.COMPSI,
			"Rehoboth", "(302)-234-4978", "vic@udel.edu"));
	
	
	for (int i = 0; i<studentlist.size(); i++){
		for (int x = 0; x < sectionlist.size(); x++){
			enrollmentList.add(new Enrollment(studentList.get(i).getStudentID(), sectionList.get(x).getSectionId()));
		}
	}
	for(int i = 0; i < enrollmentList.size(); i++){
		enrollmentList.get(i).setGrade(100);
	}
	}
	@Test
	public void testGrade(){
		for (int i = 0; i < studentList.size(); i++){
			double grade = 0;
			for (int x = i; x < enrollmentList.size(); x = x + studentList.size()){
				grade += enrollmentList.get(x).getGrade();
			}
		
			assertEquals(grade/sectionList.size(),100);
			}
	}
		@Test
		public void testChangeMajor(){
			studentList.get(0).setMajor(eMajor.NURSING);
			assertEquals(studentList.get(0).getMajor(), eMajor.NURSING);
	}
	
}
	

	
	