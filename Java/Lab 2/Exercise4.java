public class Exercise4 {
   public static void main(String[] args) {
     primeNumbers(100); /* calls primeNumbers function, with input 100 */
}
   
   public static void primeNumbers(int n) {
	   primeLoop: for (int i = 2; i <= n; i++) { /* starts at 2 as it's the lowest prime number. for looping through until the iteration is as big as the input number */
		   for (int check = i-1; check > 1; check--) { /* nested for looping through each number lower than the current iteration, not including the iteration itself, and stopping before it gets to 1 */
			   if (i % check == 0) { /* checks if the current iteration is divisible by any number lower than it (excluding <2). if it is, go to the next iteration of the first for loop, as that current number is not prime */
				  	continue primeLoop;
			   } 
			   }
		   System.out.println(i); /* if the current iteration gets to this point in the function, it must be a prime number, and thus prints */
		   }   
	   }
}
