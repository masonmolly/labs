
public class ArrayQueueDemo {

	public static void main(String[] args) {
		ArrayQueue a = new ArrayQueue();
		a.join(1);
		a.join(2);
		a.join(3);
		System.out.println(a.head()); //returns 1
		System.out.println(a.tail()); //returns 3
		System.out.println(a.isEmpty()); //returns false
		System.out.println(a.size()); //returns 3
		a.leave();
		System.out.println(a.head()); //returns 2
		System.out.println(a.size()); //returns 2
	}

}
