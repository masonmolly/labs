public class Exercise2{
   public static void main(String[] args) {
     int [] numbers = {1, 100, 200, 300, 250, 216, 500, 1000, 400};
     System.out.println(isSorted(numbers)); /* prints return value of isSorted function, taking the numbers array as an argument */
}
   
   public static boolean isSorted(int [] a){
        for (int i = 0; i < a.length-1; i++) { /* for looping through the length of the input array, minus one to prevent index out of bounds, as the index + 1 is also being checked */
        	if (a[i] > a[i+1]) { /* if the current iteration's value is larger than the value following it, the array is not sorted and thus returns false */
        		return false;
        	}
        }
        return true; /* else, the array is sorted and thus returns true */
} 
}
