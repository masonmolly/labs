
public class Anonymous implements Length {
	int x = 8;
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void printNumber(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		Anonymous length = new Anonymous();
		
		length.printMessage("y");
		System.out.println("4x"); 
		length.printNumber(10);
	}
}
