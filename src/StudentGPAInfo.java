
/***********************************************************************
Program Name: StudentGPAInfo.java
Programmer's Name: Aviram Moran
Program Description: This is a class to store information about a student’s courses and calculate their GPA.
***********************************************************************/
import java.util.Scanner;

public class StudentGPAInfo {

	// fields
	   private String myName;
	   private int myCreditHours;
	   private double myGradePoints;

	   // constructor
	   public StudentInfo(String name, int creditHours, double gradePoints) {
	      myName = name;
	      myCreditHours = creditHours;
	      myGradePoints = gradePoints;
	   }

	   //accessors
	   public String getName() {
	      return myName;
	   }

	   public int getCreditHours() {
	      return myCreditHours;
	   }

	   public double getGradePoints() {
	      return myGradePoints;
	   }

	   public double computeGPA() {
	      return myGradePoints / (double)myCreditHours;
	   }

	   public boolean isSenior() {
	      if (myCreditHours >= 125 && computeGPA() >= 2.0)
	         return true;
	      else
	         return false;
	   }

	   public String toString() {
	      return "Name: " + myName +
	         "\n   Credit Hours: " + myCreditHours +
	         "\n   Grade Points: " + myGradePoints +
	         "\n   GPA: " + computeGPA() +
	         "\n   Senior: " + isSenior() + "\n";
	   }
}
