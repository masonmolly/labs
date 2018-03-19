public class Exercise1{
   public static void main(String[] args) {
     String [] stringArray = {"computing", "at ","Goldsmiths", "College",
          "University", "of", "London", "New Cross", "London","SE14 6NW"};
     System.out.println(longestStringInArray(stringArray)); /* prints return value of longestStringInArray function, taking stringArray as argument */  
}
   
   public static String longestStringInArray(String [] a){ 
	   String longest = a[0]; /* default longest string is the first index, for comparison */
	     for (int i = 0; i < a.length; i++) { /* for looping through length of the input array string */
	    	 	if (a[i].length() >= longest.length()) { /* if the current iteration's value is longer than (or equal to) the current value stored in longest variable, make the current iteration longest */
	    	 		longest = a[i];
	    	 	}
	     }
	     return longest; /* returns longest value */
}
}