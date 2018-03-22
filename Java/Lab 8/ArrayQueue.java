
class ArrayQueue {
	private int front, back;
	private Object[] array;
	public static final int MAX = 100;
	
	public ArrayQueue() {
		front = 0;
		back = 0;
		array = new Object[MAX];
	}
	
	public Object head() { // returns head of the queue
		return array[front];
	}
	
	public Object tail() { // returns the tail of the queue
		return array[back-1];
	}
	
	public void leave() { // checks of the front of the queue reaches the end then the front becomes 0
		if (back >= 2) {
			for (int i = 0; i < back-1; i++) {
				array[i] = array[i+1];
			}
			back = back - 1;
		}
		// the description of this function doesn't really make sense so i assume it just meant to remove the head of the queue
	}
	
	public void join(Object obj) { // add an element to the queue
		array[back] = obj;
		back = back + 1;
	}
	
	public boolean isEmpty() { // checks of the queue is empty
		if (back == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() { // returns the size of the queue
		return back;
	}
	
}
