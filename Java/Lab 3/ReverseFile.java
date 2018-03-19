import java.util.*; /* Imports needed utilities for program, such as scanner */
import java.io.*;

public class ReverseFile {

	public static void main(String[] args) throws FileNotFoundException{ /* prevents program ended if exception is found */
		Scanner scan = new Scanner(System.in); /* implements scanner */
		System.out.println("Please input the name of your first file: "); /* informs user what their input is needed for */
		String input1 = scan.nextLine().trim();
		System.out.println("Please input the name of your second file: "); /* informs user what their input is needed for */
		String input2 = scan.nextLine().trim();
		System.out.println("Your file names are: " + input1 + " and " + input2);
		Scanner file1 = new Scanner(new File(input1)); /* checks user input for file, exact file path must have been input */
		Scanner file2 = new Scanner(new File(input2));
		FileWriter filewrite = new FileWriter(file1.getAbsoluteFile(),true); /* to write to specified file, keeping current content */
		BufferedWriter bufferwrite = new BufferedWriter(filewrite); 
		bufferwrite.write(file2); /* append second file to first */
		System.out.println("File appended.");
		scan.close(); /* closes */
		file1.close();
		file2.close();
	}
}
