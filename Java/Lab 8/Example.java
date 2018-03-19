import java.io.*;

class Example {
	
   public static void main(String args[]) throws IOException {
     FileInputStream fis = null;
     try {
    	 	fis = new FileInputStream("B:/myfile.txt");
     } catch (FileNotFoundException f) {
    	 	System.out.println("The file could not be found.");
     }
     try {
    	 	int k;
    	 	while(( k = fis.read() ) != -1) {
    	 		System.out.print((char)k);
    	 	}
    	 	fis.close();
     } catch (NullPointerException n) {
    	 	System.out.println("The file cannot be found, and thus cannot be printed.");
     }
     
   }
}
