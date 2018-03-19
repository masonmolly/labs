public class Exercise3{
   public static void main(String[] args) {
     int [] numbers = {1, 100, 200, 300, 250, 216, 500, 1000, 400};
     System.out.println(duplicates(numbers)); /* prints return value of duplicates function */
}
   
   public static boolean duplicates(int [] num) { /* duplicates function taking array of integers (num) as input */
	   for (int i = 0; i < num.length; i++) { /* for looping through each value in the input array */
		   for (int j = i + 1; j < num.length; j++) { /* nested for looping through every other value in the array, to compare against the current iteration's value */
			   if (num[i] == num[j]) { /* if any of the other values match the current iteration's value, there is a duplicate in the array, thus returning true */
				   return true;
			   }
		   }
	   }
	   return false; /* if no duplicates, return false */
   }
}
