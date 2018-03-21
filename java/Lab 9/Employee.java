
class Employee {

	private int id;
	private String name;
	private String sex;
	private double salary;

	Employee(int id,String name, String sex,double salary){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.salary=salary;
	}
	
	class Address {
		
		int houseNo;
		String street;
		String city;
		String postCode;
		
		Address(int houseNo, String street, String city, String postCode) {
			this.houseNo = houseNo;
			this.street = street;
			this.city = city;
			this.postCode = postCode;
		}
		
		public void printAll() {
			System.out.println("ID:" + id + "\tName:" + name + "\tSex:" + sex + "\tSalary:" + salary + "\nAddress:\n" + "\tHouse No:" + houseNo + "\n\tStreet No:" + street + "\n\tCity:" + city + "\n\tPostcode:" + postCode);
		}
	}
	
	public void printInfo(){
		System.out.println("ID:"+id+"\tName:"+name+"\tSex:"+sex+"\tSalary:"+salary);
	}
}

