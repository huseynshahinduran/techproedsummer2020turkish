package project;

import java.util.Scanner;

public class Students {
	
	private static int id=1000;
	private String studentId;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses="";
	private static int costOfCourse=600;
	private int tuitionBalance;
	
	public void setStudentId() {
		
		id++;
		this.studentId=gradeYear+""+id;
		
	}
	
	public Students() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter student's first name: ");
		this.firstName=scan.nextLine();
		System.out.println("Enter student's last name: ");
		this.lastName=scan.nextLine();
		System.out.println("Enter student's class level: ");
		System.out.println("1-Freshmen");
		System.out.println("2-Sophmore");
		System.out.println("3-Junior");
		System.out.println("4-Senior");
		this.gradeYear=scan.nextInt();
		setStudentId();
	}
	
	public void enrool() {
		
		do {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter course to enroll (Q to quit)");
			String course=scan.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n"+course;
			}else {
				break;
			}
		}while(true);
		
		System.out.println("Enrolled in: "+courses);
	}

}
