/***********************************************************************
 Program Name: StudentGPAInfo.java
 Programmer's Name: Aviram Moran
 Program Description: This is a class to store information about a student's courses and calculate their GPA.
 ***********************************************************************/

package studentinfopkg;

public class StudentInfoTest {
	public static void main (String[] args) {
	      StudentInfo student1 = new StudentInfo( "Joe Smith", 90, 310);
	      System.out.println(student1);
	      StudentInfo student2 = new StudentInfo( "Joe Slacker", 125, 210);
	      System.out.println(student2);
	      StudentInfo student3 = new StudentInfo( "Jacob Suckup", 130, 400);
	      System.out.println(student3);	     
	}
}
