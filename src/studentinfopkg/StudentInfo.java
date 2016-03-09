/***********************************************************************
 Program Name: StudentGPAInfo.java
 Programmer's Name: Aviram Moran
 Program Description: This is a class to store information about a student's courses and calculate their GPA.
 ***********************************************************************/

package studentinfopkg;

public class StudentInfo {
	// Variables
	private String studentName; // Student's Name
	private double totalGradePoints; // Student's total Grade Points
	private double totalCredits; // Student's total Credits

	// constructor
	public StudentInfo(String name, int creditHours, double gradePoints) {
		studentName = name;
		totalGradePoints = gradePoints;
		totalCredits = creditHours;
	}

	// methods
	// Set value for name
	public void setName() {
		studentName = "";
	}

	// Returns the name
	public String getName() {
		return studentName;
	}

	public double getCreditHours() {
		return totalCredits;
	}

	public double getGradePoints() {
		return totalGradePoints;
	}

	// Calculates and returns the GPA
	public double calculateGPA() {
		return totalGradePoints / (double) totalCredits;
	}

	
	public String toString() {
		return "Name: " + studentName + "\n   Credit Hours: " + totalCredits
				+ "\n   Grade Points: " + totalGradePoints + "\n   GPA: "
				+ calculateGPA() + "\n";
	}
}
