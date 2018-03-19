import java.util.*; /* Imports needed utilities for program, such as scanner */
import java.io.*;

public class WordOccurencesInFile {

	public static void main(String[] args) throws FileNotFoundException{ /* prevents program ended if exception is found */
		Scanner scan = new Scanner(System.in); /* implements scanner */
		System.out.println("Please input the name of your file: "); /* informs user what their input is needed for */
		String input = scan.nextLine().trim(); /* takes user input, trimming trailing whitespace */
		System.out.println("Your file name is: " + input); /* informs user of their input file name */
		System.out.println("Please enter the word you would like to count occurences for: "); /* informs user what their input is needed for */
		String word = scan.nextLine().trim(); /* takes user input, trimming trailing whitespace */
		Scanner file = new Scanner(new File(input)); /* checks user input for file, exact file path must have been input */
		int wordOccur = 0; /* default word occurrence is 0 */
		while (file.hasNextLine()) { /* while looping through whole file */
			String line = file.nextLine(); /* splits each line up in file, below line splits each line into an array by space, fullstop, and commas */
			String[] lineArray = line.split(" |\\,|\\.");
			for (int i = 0; i < lineArray.length; i++) {
				if (lineArray[i].equals(word)) {
					wordOccur = wordOccur + 1; /* if the current word is the same as the user's input word, wordOccur increases by 1 */
				}
			}
			System.out.println(line); /* prints current line */
		}
		System.out.println("Your chosen word occurred " + wordOccur + " times in your file."); /* informs user how times their word occurred */
		scan.close(); /* closes */
		file.close();
	}
}
