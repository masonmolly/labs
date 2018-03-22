
class ArrayStack {
	private Object[] array;
	private int count;
	public static final int MAX = 100;

	public ArrayStack() {
		array = new Object[MAX];
		count = 0;
	}

	public Object top() { //returns last added element
		if (count == 0) {
			return array[0];
		} else {
			return array[count-1];
		}
	}

	public void pop() { //removes last added element
		array[count-1] = 0;
		count = count - 1;
	}

	public void push(Object obj) { //adds element to the stack
		array[count] = obj;
		count = count + 1;
	}

	public int size() { //returns the size of the stack
		return count;
	}

	public boolean isEmpty() { //checks if the stack is empty 
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public ArrayStack reverseStack(ArrayStack stack) { //question 3
		ArrayStack reverse = new ArrayStack();
		for (int i = stack.count-1; i >= 0; i--) {
			reverse.push(stack.array[i]);
		}
		return reverse;
	}
	
	public Object secondFromTop(ArrayStack stack) { //question 3
		return stack.array[count-2];
	}
} 