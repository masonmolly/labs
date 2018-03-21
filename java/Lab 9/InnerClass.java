
public class InnerClass { //I presume InnerTest means InnerClass on the labsheet
		public static void main(String[] args) {
			Employee emp = new Employee(1000,"James G","M",32000);
			Employee.Address address = emp.new Address(26,"St James","London","SE14 6NW"); // create object of inner class called address
			address.printAll(); // call method of inner class printAll() the print all the employee information
		}
}