package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import com.cisc181.eNums.eMajor;
import com.cisc181.core.Semester;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	static ArrayList<Student> listOfStudents = new ArrayList<Student>();
	static ArrayList<Course> listOfCourses = new ArrayList<Course>();
	static ArrayList<Semester> listOfSemesters = new ArrayList<Semester>();
	static ArrayList<Section> listOfSections = new ArrayList<Section>();
	
	public static Date newDate(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}
	
	@BeforeClass
	public static void setup() {
		/*listOfCourses.add(Course(1234, "Intro to Computer Science", 100, eMajor.COMPSI));
		listOfCourses.add(Course(5678, "Intro to Business", 100, eMajor.BUSINESS));
		listOfCourses.add(Course(9101, "Intro to Nursing", 100, eMajor.NURSING));
		
		listOfSemesters.add(Semester(newDate(2016, 2, 7), newDate(2016, 5, 25));
		listOfSemesters.add(Semester(newDate(2016, 9, 1), newDate(2016, 12, 14));
		
		
		listOfStudents.add(Student("Bob", "John", "Smith", newDate(1998, 3, 25), eMajor.CHEM, "Newark",
				"(111)-111-1111", "bobsmith@udel.edu"));
		listOfStudents.add(Student("John", "Bob", "Smith", newDate(1998, 6, 19), eMajor.BUSINESS, "Wilmington",
				"(222)-222-2222", "johnsmith@udel.edu"));
		listOfStudents.add(Student("Bill", "Bob", "Evans", newDate(1998, 4, 12), eMajor.PHYSICS, "Philadelphia",
				"(333)-333-3333", "billevans@udel.edu"));
		listOfStudents.add(Student("Bob", "Bill", "Evans", newDate(1998, 7, 9), eMajor.NURSING, "New York",
				"(444)-444-4444", "bobevans@udel.edu"));
		listOfStudents.add(Student("Jennifer", "Melissa", "Williams", newDate(1998, 10, 26), eMajor.COMPSI, "San Francisco",
				"(555)-555-5555", "jenniferwilliams@udel.edu"));
		listOfStudents.add(Student("Melissa", "Jennifer", "Williams", newDate(1998, 12, 31), eMajor.CHEM, "Miami",
				"(666)-666-6666", "melissawilliams@udel.edu"));
		listOfStudents.add(Student("Catie", "Karen", "Robinson", newDate(1998, 1, 31), eMajor.BUSINESS, "Chicago",
				"(888)-888-8888", "catierobinson@udel.edu"));
		listOfStudents.add(Student("Karen", "Catie", "Robinson", newDate(1998, 1, 11), eMajor.PHYSICS, "",
				"(999)-999-9999", "karenrobinson@udel.edu"));
		listOfStudents.add(Student("Elyse", "Cheryl", "Swell", newDate(1998, 3, 12), eMajor.NURSING, "London",
				"(123)-456-7890", "elyseswell@udel.edu"));
		listOfStudents.add(Student("Cheryl", "Elyse", "Swell", newDate(1998, 4, 20), eMajor.COMPSI, "London",
				"(246)-810-1214", "cherylswell@udel.edu"));
		*/
	}

	@Test
	public void testGPA() {
		// I know I need to use a for each loop, but not too sure how to implement it 
		return;
	}
	
	@Test
	public void courseAverage() {
		// Again, pretty sure I need to use a for each loop and create a course average by adding the grades
		// and have the return line calculate the average by dividing by however much there is 
		return;
	}
	
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}