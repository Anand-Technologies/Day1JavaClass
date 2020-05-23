package org.cts.day1;

public class EmployeeDetails {
	
	public void empId() {
		System.out.println("333");
	}
	public void empName() {
		System.out.println("Anand");
	}
	public void empDOB() {
		System.out.println("12/11/1994");
	}
	public void empPhone() {
		System.out.println("9940015190");
	}
	public void empEmail() {
		System.out.println("anandyuvan994@gmail.com");
	}
	public void empAddress() {
		System.out.println("Chennai");
	}
	
	public static void main (String [] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.empId();
		emp.empName();
		emp.empDOB();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
	}
}
