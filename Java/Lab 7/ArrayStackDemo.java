
public class ArrayStackDemo {

	public static void main(String[] args) {
		ArrayStack a = new ArrayStack();
		System.out.println(a.isEmpty()); //no entries, returns true
		a.push(5); //adds 5 to the stack
		System.out.println(a.top()); //5 is the only entry, returns 5
		System.out.println(a.size()); //1 entry in stack
		System.out.println(a.isEmpty()); //has an entry, returns false
		a.pop(); //removes entry from stack
		System.out.println(a.isEmpty()); //stack is empty again, returns true
		
		ArrayStack b = new ArrayStack();
		b.push(6);
		b.push(8);
		b.push(10);
		System.out.println(b.top()); //returns 10
		System.out.println(b.size()); //3 entries in stack
		b.pop();
		System.out.println(b.top()); //returns 8, as 10 was removed
	}

}
