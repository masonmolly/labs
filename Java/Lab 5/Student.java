import java.util.Arrays; /* imports Arrays class */

public class Student extends Person { /* Student class is derived from Person class */

	String studentID;
	int[] marks;
	
	Student() { /* Initalising default constructor */
		studentID = "";
		marks = new int[5]; /* empty array with 5 elements */
	}
	
	Student(String n, int y, int m, int d, String i, int m1, int m2, int m3, int m4, int m5) { /* Constructor to input studentID i and 5 subject marks m, along with arguments from Person superclass */
		super(n,y,m,d);
		studentID = i;
		marks = new int[5];
		marks[0] = m1;
		marks[1] = m2;
		marks[2] = m3;
		marks[3] = m4;
		marks[4] = m5;
	}
	
	public double getFinalMark() { /* getFinalMark() method gets student's average mark across all subjects */
		int averageCount = 0; /* variable to hold total marks */
		for (int i = 0; i < marks.length; i++) { 
			averageCount = averageCount + marks[i]; /* for each element in the marks array, add the contents to averageCount (adds all marks in array together */
		}
		double average = averageCount / 5; /* divide marks total by 5 (number of subject marks) to get average */
		return average; /* method returns average */
	}
	
	public String getGrade() {  /* method getGrade() calculates grade from getFinalMark() return value (average) */
		String grade = "None"; 
		if (getFinalMark() >= 70) {
			grade = "A"; /* if subject marks are above or equal to 70, grade is A */
		} else if (getFinalMark() >= 60 && getFinalMark() < 70) {
			grade = "B"; /* if subject marks are above or equal to 60, and less than 70, grade is B */
		} else if (getFinalMark() >= 50 && getFinalMark() < 60) {
			grade = "D"; /* if subject marks are above or equal to 50, and less than 60, grade is D */
		} else if (getFinalMark() < 50) {
			grade = "F"; /* if subject marks are below 50, grade is F */
		}
		return grade; /* method returns grade */
	}
	
	public String toString() {
		return super.toString() + " Student [studentID=" + studentID + ", marks=" + Arrays.toString(marks) + "]"; /* string representation of Student class, includes string from Person.java (superclass) */
	}
 
	public static void main(String[] args) { /* main method empty, testing done in Testing.java */
	}
}

