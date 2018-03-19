public class Exercise5 {
   public static void main(String[] args) {
     String input = "Studying at Goldsmiths College, University of London. Students need to work harder to achieve a first class degree at Goldsmiths."; /* string input */
     wordOccurrences(input); /* calls function with above string */
   }
   
   public static void wordOccurrences(String st) { 
	   String[] wordArray = st.split(" |\\.|\\,"); /* splits the functions input string (st) up into an array (wordArray), one word per index - split by spaces, full stops, and commas */
	   int wordO; /* variable to hold the amount of times a word occurs */
	   for (int i = 0; i < wordArray.length; i++) { /* for looping through each word in the array */
		   wordO = 1; /* each words default occur time is 1, for itself */
		   for (int j = i + 1; j < wordArray.length; j++) { /* nested for looping through every word in the array, except the current word iteration, to compare against it */
			   if (wordArray[i].equals(wordArray[j])) { /* if the current word is the same as another word in the string array, 1 is added to that words occur time, and the comparison words index is made blank to prevent repeats when printing */
				   wordO = wordO + 1;
				   wordArray[j] = " ";
			   }
		   }
		   if (!wordArray[i].equals(" ") && !wordArray[i].equals(",") && !wordArray[i].equals(".")) { /* if the current word in the array isn't a full stop, comma, or space, print the word and the amount of times it occurred */
		   System.out.println(wordArray[i] + " " +  wordO);
		   }
	}
}
}
