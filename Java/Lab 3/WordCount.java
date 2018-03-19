import java.util.*; /* Imports needed utilities for program, such as scanner */
import java.io.*; 

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException{ /* prevents program ended if exception is found */
		Scanner scan = new Scanner(System.in); /* implements scanner */
		System.out.println("Please input the name of your file: "); /* informs user what their input is needed for */
		String input = scan.nextLine().trim(); /* takes user input, trimming trailing whitespace */
		System.out.println("Your file name is: " + input); /* informs user of their input file name */
		Scanner file = new Scanner(new File(input)); /* checks user input for file, exact file path must have been input */
		int wordCount = 0; /*default word count is 0 */
		while (file.hasNextLine()) { /* counts words as long as the file has more lines */
			String line = file.nextLine(); /* splits each line up in file, below line splits each line into an array by space, fullstop, and commas */
			String[] lineArray = line.split(" |\\,|\\.");
			for (int i = 0; i < lineArray.length; i++) { /* for as long as the current line is, add to word count for each */
				wordCount = wordCount + 1;
			}
			System.out.println(line); /* prints current line */
		}
		System.out.println("There are " + wordCount + " words in your file."); /* informs user how many words */
		scan.close(); /* closes */
		file.close();
	}
}
