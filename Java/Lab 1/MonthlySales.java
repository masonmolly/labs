public class MonthlySales {
	public static void main(String[] args) {
		double [] monthlySales = {50000.0 , 40000.1, 55000.0, 30000.0, 250000.2, 600000.2, 450000.0, 36000.0 ,28000.0, 15000.1, 700000.2,
				  15000.0}; /*array containing sales amount for each month in 2016*/
		double total = 0; /*default total*/
		double largest = monthlySales[0]; /*default largest index for comparison*/
		double smallest = monthlySales[0]; /*default smallest index for comparison*/
		for (int i=0;0<=i && i<=11;i++) { /*for each month, add amount to total*/
			total += monthlySales[i];
		}
		for (int j=0;0<=j && j<=11;j++) { /*for each month, compare against current largest index. if larger, make largest current index.*/
			if (largest<monthlySales[j]) {
				largest = monthlySales[j];
			}
		}
		for (int k=0;0<=k && k<=11;k++) { /*for each month, compare against current smallest index. if smaller, make smallest current index.*/
			if (smallest>monthlySales[k]) {
				smallest = monthlySales[k];
			}
		}
		double average = total/monthlySales.length; /*calculates average month sales*/
		System.out.println("The total sale for 2016 is: £" + total); /*prints total*/
		System.out.println("The average month sales for the year 2016 is: £" + average); /*prints average*/
		System.out.println("The largest month sale was: £" + largest); /*prints highest earning month*/
		System.out.println("The smallest month sale was: £" + smallest); /*prints lowest earning month*/
	}
}
