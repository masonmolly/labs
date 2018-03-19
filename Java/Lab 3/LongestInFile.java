import java.util.*; /* Imports needed utilities for program, such as scanner */
import java.io.*;

public class LongestInFile {

	public static void main(String[] args) throws FileNotFoundException{ /* prevents program ended if exception is found */ 
		Scanner scan = new Scanner(System.in); /* implements scanner */
		System.out.println("Please input the name of your file: "); /* informs user what their input is needed for */
		String input = scan.nextLine().trim(); /* takes user input, trimming trailing whitespace */
		System.out.println("Your file name is: " + input); /* informs user of their input file name */
		Scanner file = new Scanner(new File(input)); /* checks user input for file, exact file path must have been input */
		String line = file.nextLine(); /* sets arrays outside while loop, so initial longest value can be set for comparison */
		String[] lineArray = line.split(" |\\,|\\."); /* splits each line up in file, line splits each line into an array by space, fullstop, and commas */
		String longest = lineArray[0];
		while (file.hasNextLine()) { /* loops through file, line by line, if current word is longer than what is currently stored, make longer variable set to current word */
			for (int i = 0; i < lineArray.length; i++) {
				if (lineArray[i].length() > longest.length()) { 
					longest = lineArray[i];
				}
			}
			System.out.println(line); /* prints current line */
			line = file.nextLine();
			lineArray = line.split(" |\\,|\\."); /* splits next line for next loop */
		}
		System.out.println("The longest string in your file is " + longest); /* informs user of the longest word */
		scan.close(); /* closes */
		file.close();
	}
}