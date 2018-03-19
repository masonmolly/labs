import java.time.LocalDate; /* imports LocalDate class, I use this class over Date as much of Date is deprecated */
import java.time.Period; /* imports Period class */

public class Person {

	String name;
	LocalDate DoB;
	
	Person() { /* Initalising default constructor */
		name = "";
		DoB = LocalDate.of(2000, 1, 1);
	}
	
	Person(String n, int y, int m, int d) { /* Constructor to input name n and date of birth (year y, month m, day d) */
		name = n;
		DoB = LocalDate.of(y, m, d);
	}
	
	public int age(int y, int m, int d) { /* method age takes y (year), m, (month), and d (day) arguments */
		DoB = LocalDate.of(y, m, d); /* arguments y, m, and d converted to date format + held in DoB variable*/
		LocalDate current = LocalDate.now(); /* variable to hold current date */
		Period age = Period.between(DoB, current); /* finds time between the given date of birth, and the current date, stores in variable age */
		return age.getYears(); /* returns just the years from the time difference calculation */
	}
	
	public String toString() {
		return "Person [name=" + name + ", DoB=" + DoB + "]"; /* string representation of Person class */
	}

	public static void main(String[] args) { /* main method empty, testing done in Testing.java */
	}

}

