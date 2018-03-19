import java.util.Arrays; /* imports java Arrays class */

public class UndergraduateStudent extends Student { /* UndergraduateStudent class is derived from Student class */

	int year;
	String program;
	
	UndergraduateStudent() { /* Initalising default constructor */
		year = 0000;
		program = "";
	}
	
	UndergraduateStudent(String n, int y, int m, int d, String i, int m1, int m2, int m3, int m4, int m5, int yr, String p) { /* Constructor to input year y and program p, along with arguments from Person and Student superclasses */
		super(n,y,m,d,i,m1,m2,m3,m4,m5);
		year = yr;
		program = p;
	}
	
	public double getFinalMark() { /* method gets average mark from top 3 marks */
		double average = 0.0;
		int bestMarksCount = 0;
		int[] marks = super.marks; /* gets marks variable from Student.java */
		Arrays.sort(marks); /* sorts marks array */
		int[] bestMarks = new int[3];
		bestMarks[0] = marks[2]; /* makes values in bestMarks array the top 3 values in the sorted marks array */
		bestMarks[1] = marks[3];
		bestMarks[2] = marks[4];
		for (int i = 0; i < bestMarks.length; i++) { /* for each element in bestMarks array, add to bestMarksCount (calculates total value of bestMarks array */
			bestMarksCount = bestMarksCount + bestMarks[i];
		}
		average = bestMarksCount / 3; /* divide marks total by 3 (number of best marks) to get average */
		return average; /* method returns average */
	} 
	
	public String getGrade() { /* method getGrade() calculates grade from getFinalMark() return value (average of top 3) */
		String grade = "None";
		if (this.getFinalMark() >= 50) {
			grade = super.getGrade(); /* if current subjectIndex marks are higher than or equal to 50, calls getGrade() method from Student.java (to return grades A-F) */
		} else if (this.getFinalMark() >= 40 && this.getFinalMark() < 50) {
			grade = "Pass"; /* if current subjectIndex marks are more than or equal to 40 and less than 50, grade is a pass */
		} else if (this.getFinalMark() < 40) {
			grade = "Fail"; /* if current subjectIndex marks lower than 40, grade is a fail */
		}
		return grade; /* method returns grade (from this class) */
	}
	
	public String toString() {
		return super.toString() + " UndergraduateStudent [year=" + year + ", program=" + program + "]"; /* string representation of UndergraduateStudent class, includes strings from Student.java and Person.java (superclasses) */
	}

	public static void main(String[] args) { /* main method empty, testing done in Testing.java */
	}

}
