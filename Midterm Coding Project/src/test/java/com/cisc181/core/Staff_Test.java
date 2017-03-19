package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testAverage() throws PersonException{
		ArrayList<Staff> stafflist = new ArrayList<>();
		stafflist.add(new Staff("Eric", "Michael", "Rowe",
				new GregorianCalendar(1996, 1, 1).getTime(),
				"Newark", "(302)-345-6789","ericrowe@udel.edu","2-3",
				3, 240000, new GregorianCalendar(2015, 4, 7).getTime(), eTitle.MR));
		stafflist.add(new Staff("Phillip", "Michael", "Rivers",
				new GregorianCalendar(1981, 11, 7).getTime(),
				"San Diego", "(777)-777-7777","privers@chargers.nfl","3-8",
				0, 20000000, new GregorianCalendar(2004, 3, 17).getTime(), eTitle.MR));
		stafflist.add(new Staff("Alfonso", "Guilleard", "Soriano",
				new GregorianCalendar(1976, 0, 6).getTime(),
				"San Pedro de Macoris", "(123)-456-7890","asoriano@rangers.mlb","10-15",
				1, 18000000, new GregorianCalendar(199, 2, 25).getTime(), eTitle.MR));
		stafflist.add(new Staff("Elena", "", "Delle Donne",
				new GregorianCalendar(1989, 8, 4).getTime(),
				"Wilmington", "(302)-123-4567","delledonne@udel.edu","7-10",
				2, 2400000, new GregorianCalendar(2013, 7, 7).getTime(), eTitle.MS));
		stafflist.add(new Staff("Sarah", "Michelle", "Smith",
				new GregorianCalendar(1993, 10, 1).getTime(),
				"Miami", "(701)-325-6189","msmith@theu.edu","3-4",
				3, 90000, new GregorianCalendar(2012, 8, 2).getTime(), eTitle.MRS));
		
		double average = 0;
        for (Staff staff: stafflist) {
            average += staff.getSalary();
        }
        average /= stafflist.size();
        
        assertEquals(8146000.0, average, 0.0001);
	}
	@Test(expected = PersonException.class)
	public void testStaffPhone() throws PersonException, ParseException{
		Staff staff = new Staff("Joe", "Edward", "Williams",
				new GregorianCalendar(1955, 3, 3).getTime(), 
				"Washington", "(200)-32432-546", "jwilliams@yahoo.com","2-5",
				4, 123456, new GregorianCalendar(1980, 11, 11).getTime(), eTitle.MR);
		
	}
	@Test(expected = PersonException.class)
	public void DOBTest() throws PersonException, ParseException{
		Staff annie = new Staff("Annie", "Sally", "Johnson",
				new GregorianCalendar(1950, 45, 45).getTime(), 
				"Salem", "(410)-432-1546", "ajohnson@yahoo.com","12-15",
				6, 95000, new GregorianCalendar(1780, 11, 11).getTime(), eTitle.MRS);
	}
	
}
