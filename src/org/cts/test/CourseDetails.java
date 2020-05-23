package org.cts.test;

public class CourseDetails {

	public void javaCourse() {
		System.out.println("Java Course Started");
	}
	public void oracleCourse() {
		System.out.println("Oracle Course Started");
	}
	
	public static void main(String [] args) {
		CourseDetails cd = new CourseDetails();
		cd.javaCourse();
		cd.oracleCourse();
	}
}
