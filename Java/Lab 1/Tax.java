public class Tax  {
	public static void main(String[] args) {
		double salary = 100000; /*salary amount*/
		double tax = 0; /*default tax is 0%*/
		if (salary <= 15000) { /*if salary is larger than or equal to 15,000, tax is 0%*/
			tax = 0.00;
		}
		else if (salary > 15000 && salary <= 30000) { /*if salary is larger than 15,000 but less than or equal to 30,000, tax is 5%*/
			tax = 0.05;
		}
		else if (salary > 30000 && salary <= 50000) { /*if salary is larger than 30,000 but less than or equal to 50,000, tax is 10%*/
			tax = 0.10;
		}
		else if (salary > 50000) { /*if salary is larger than 50,000, tax is 20%*/
			tax = 0.20;
		}
		double taxpaid = 0;
		taxpaid = salary * tax; /*calculates how much tax is due*/
		System.out.println("The salary is £" + salary + ", and the tax due is £" + taxpaid); /*prints salary and how much tax is due*/
	}
}
