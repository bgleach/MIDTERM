package com.cisc181.core;

import static org.junit.Assert.*;
import Exceptions.PersonException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import com.cisc181.eNums.eTitle;
import org.junit.BeforeClass;
import org.junit.Test;


public class Staff_Test {
	
	double sum = 0;

	static ArrayList<Staff> listOfStaff = new ArrayList<Staff>();
	
	public static Date newDate(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}
	
	@BeforeClass
	public static void setup() {
		listOfStaff.add(new Staff("Joe", "John", "Smith", newDate(1964, 10, 26), "Newark", "(123)-456-7890",
				"joesmith@udel.edu", "10 to 11", 1, 1000, newDate(2000, 9, 1), eTitle.MR));
		listOfStaff.add(new Staff("Bill", "Bob", "Brook", newDate(1963, 7, 9), "Wilmington", "(123)-456-7891",
				"billbrook@udel.edu", "11 to 12", 2, 2000, newDate(2001, 8, 29), eTitle.MR));
		listOfStaff.add(new Staff("Jen", "Judy", "Jones", newDate(1940, 5, 19), "Philadelphia", "(123)-456-7892",
				"jenjones@udel.edu", "12 to 1", 3, 3000, newDate(2002, 8, 28), eTitle.MS));
		listOfStaff.add(new Staff("Alyssa", "Amanda", "Athens", newDate(1978, 3, 25), "New York", "(123)-456-7893",
				"alyssaathens@udel.edu", "1 to 2", 4, 4000, newDate(2003, 9, 2), eTitle.MRS));
		listOfStaff.add(new Staff("Greg", "Gary", "Williams", newDate(1954, 6, 19), "Chicago", "(123)-456-7894",
				"gregwilliams@udel.edu", "2 to 3", 5, 5000, newDate(2004, 8, 25), eTitle.MR));

	}
	
	@Test
	public void testSalaryOfStaff() {
		for (Staff staff : listOfStaff) {
			sum = staff.getSalary() + sum;
		}
		double average = sum / listOfStaff.size();
		assertEquals(average, 3000);                
	}
	
	@Test
	public void DOBTest() throws PersonException {
		return;              //Honestly not sure how to do this
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
