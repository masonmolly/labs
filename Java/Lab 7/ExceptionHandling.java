
public class ExceptionHandling {
	
    public static void main(String[] args) {
       String[] s = {"abc", "123", null, "xyz"};
       
       for (int i = 0; i < s.length; i++) {
    	   		try {
    	   			int a = s[i].length(); /* i. throws NullPointerException */
    	   			System.out.println(s[i+1]); /* i. throws ArrayIndexOutOfBoundsException */
    	   			a = Integer.parseInt(s[i]); /* i. throws NumberFormatException */
    	   		} catch (NullPointerException np) {
    	   			System.out.println("NullPointerException");
    	   		} catch (ArrayIndexOutOfBoundsException ai) {
    	   			System.out.println("ArrayIndexOutOfBoundsException");
    	   		} catch (NumberFormatException nf) {
    	   			System.out.println("NumberFormatException");
    	   		}
       	} 
    }
}