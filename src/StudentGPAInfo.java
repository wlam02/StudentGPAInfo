/***********************************************************************
Program Name: StudentGPAInfo.java
Programmer's Name: Aviram Moran
Program Description: This is a class to store information about a student’s courses and calculate their GPA.
***********************************************************************/
import java.util.Scanner;

public class StudentGPAInfo {

	// Data Members
    private String studentName; // Student's Name
    private double totalGradePoints; // Student's total Grade Points
    private double totalCredits; // Student's total Credits
    private double GPA; // Student's calculated GPA

    // Constructor
     StudentInfo()
    {
        studentName = "Set when init";
        totalGradePoints = 0;
        totalCredits = 0;
        GPA = 0;
    }

     
    // Set the student's name
    public void setName(String studentName)
    {
        this.studentName = studentName;     
    }

    // Get the student's name

    public String getName(String studentName)
    {
        return studentName;
    }


    
    // Receives input for class units and grades, updates grade points and credits

            public void addClass()
            {
                String check = "y";
                double credits = 0;
                double gradePoints = 0;
                Scanner input = new Scanner(System.in);
                while(check.equals("y"))
                {

                System.out.println("Enter class credits: ");
                credits = input.nextDouble();
                //System.out.println("Enter letter grade");
                //gradePoints = input.nextDouble();
                //totalCredits += credits;
                //totalGradePoints += gradePoints;
                //System.out.println("Add another class? (y/n)");
                //check = input.nextLine();
                }
                input.close();
            }


            public double getGPA(double totalCredits, double totalGradePoints)
            {
                GPA = (double) totalGradePoints / totalCredits;
                return GPA; 

            }

            public void displayStudent(String studentName, double GPA)
            {
                System.out.println(studentName + " your GPA is " + GPA);
            }
}


public static void main(String[] args) {
// Declare new StudentInfo Object
StudentInfo student1 = new StudentInfo();

// Ask for Student's Name
student1.setName();
student1.getName(student1.studentName);
student1.addClass();
student1.getGPA(student1.totalCredits, student1.totalGradePoints);
student1.displayStudent(student1.studentName, student1.GPA);

}
}
