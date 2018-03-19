/* Program to test Person, Student, and UndergraduateStudent.java */
public class Testing {

	public static void main(String[] args) {
		Person jonathan = new Person(); /* makes variables for each Person class (all constructor versions) */
		Person dustin = new Person("Dustin Henderson", 1971, 3, 25); 
		
		Student mike = new Student(); /* makes variables for each Student class (all constructor versions) */
		Student barb = new Student("Barb Holland", 1967, 9, 13, "justice4barb", 40, 30, 90, 20, 50);
		
		UndergraduateStudent steve = new UndergraduateStudent(); /* makes variables for each UndergraduateStudent class (all constructor versions) */
		UndergraduateStudent nancy = new UndergraduateStudent("Nancy Wheeler", 1967, 5, 20, "rrrrrr", 10, 10, 20, 20, 20, 1984, "Photography");
		
		System.out.println(jonathan.toString());
		System.out.println(dustin.toString()); /* shows result of each variable (Persons) */
		
		System.out.println(mike.toString());
		System.out.println(barb.toString()); /* shows result of each variable (Students) */

		System.out.println(steve.toString());
		System.out.println(nancy.toString()); /* shows result of each variable (UndergraduateStudents) */
		
		System.out.println(jonathan.age(1997,5,20)); /* tests + shows result of Person age() method across all classes */
		System.out.println(mike.age(1984,7,15));
		System.out.println(steve.age(1961,8,25));
		
		System.out.println(barb.getGrade()); /* tests + shows result of Student getGrade() method */
		System.out.println(barb.getFinalMark()); /* tests + shows result of Student getFinalMark() method */
		
		System.out.println(nancy.getGrade()); /* tests + shows result of UndergraduateStudent getGrade() method */
		System.out.println(nancy.getFinalMark()); /* tests + shows result of UndergraduateStudent getFinalMark() method */
		
		System.out.println(jonathan.toString()); /* show updated dobs */
		System.out.println(mike.toString());
		System.out.println(steve.toString());
	}

}
