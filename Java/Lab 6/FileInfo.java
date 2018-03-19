import java.io.*; /* imports classes needed for the program */
import java.util.*;

public class FileInfo {

	@SuppressWarnings("unchecked") /* suppresses unchecked warnings */
	public static void main(String[] args) throws FileNotFoundException { /* main method, accounting for FileNotFound exception */
		if (args.length > 0) { /* if command line argument args is longer than nothing, run rest of program */
			File file = new File(args[0]); /* set file to command line argument */
			Scanner scanner = new Scanner(new FileInputStream(file)); /* set scanner to taken file */
			
			int wordCount = 0;
			while(scanner.hasNext()){ /* iterates through each thing in file, increasing word count each time */
				scanner.next();
				wordCount++;
			}
			
			System.out.println("There are" + wordCount + "words in this file."); /* prints how many words in file */
			
			int wordUnique = 0;
			ArrayList<String> uniques = new ArrayList<String>(); /* new ArrayList to hold unique words */
			next: while(scanner.hasNext()){ /* iterates through file, if word isn't already in list uniques, add to list */
				for (int i = 0; i < uniques.size(); i++) {
					if (!scanner.next().equals(uniques.get(i))) {
						uniques.add(scanner.next());
						wordUnique++;
						scanner.next();
						continue next;
					} 
				}
			}
			
			System.out.println("There are" + wordUnique + "unique words in this file."); /* prints how many unique words in file */
			
			HashMap<String,Integer> uniquesHashMap = new HashMap<String,Integer>(); /* new hash map to store unique words + number of occurrences */
			int wordUniqueCount = 0;
			boolean bool = true; /* boolean to tell while loop when to stop */
			while(bool == true){
				for (int i = 0; i < uniques.size(); i++) { /* nested for looping through each word in uniques, and checking against each word in file. if words are the same, add one to that current word's occurrence count */
					for (int j = 0; j < wordCount; j++) {
						if (scanner.next().equals(uniques.get(i))) {
							wordUniqueCount++;
							scanner.next();
						}
					}
					uniquesHashMap.put(uniques.get(i), wordUniqueCount); /* add current word and it's occurrence count to the hash map uniqueHashMap (word is key, occurrence number is value) */
					System.out.print(uniques.get(i) + wordUniqueCount); /* print current word + times it occurred in file */
					wordUniqueCount = 0; /* reset occurrence count to 0 for next word in array */
				}
				bool = false; /* while loop ends once all words have been counted */
			}
			
			Object[] sort = uniquesHashMap.entrySet().toArray(); /* new Object sort to store set array of uniquesHashMap */
			Arrays.sort(sort, new Comparator<Object>() { /* sort array of hash map, by highest to lowest values */
		        public int compare(Object value1, Object value2) {
		            return ((HashMap.Entry<String, Integer>) value1).getValue().compareTo(((HashMap.Entry<String, Integer>) value2).getValue());
		        }
			});
			
			for (int i = 0; i < 20; i++) { /* prints each unique word (key) and their occurrence count (value) in sorted hash map array, from highest to lowest, up to 20 times */
				for (Object word : sort) {
					System.out.println(((HashMap.Entry<String, Integer>) word).getKey() + " = " + ((HashMap.Entry<String, Integer>) word).getValue());
				}
			}
		    
			scanner.close(); /* closes scanner */
			
			}
		}
}
