public class MyArrayList {
	
private static final int SIZE_FACTOR = 5; /* variable to hold initial array size */
private Object data[]; /* initial array variable */
private Object dataStore[];
private int index;
private int size;
int count = 0;
int rCount = 0;
int dCount = 0;

	public MyArrayList(){ /* constructor to make new array */
		this.data = new Object[SIZE_FACTOR]; 
		this.size = SIZE_FACTOR; /* array size is SIZE_FACTOR (5) */
	}
	
	public void add(Object obj){ /* method add() adds a new element (obj) to the array */
		if (count == data.length) { /* if the array is full (number of elements stored is equal to array size), make a new array of current array size + 1, copying all of the current array's elements over and adding the new element obj, then make current array new array */
			dataStore = new Object[data.length+1];
				for (int i = 0; i < data.length; i++) {
					dataStore[i] = data[i];
				}
			data = dataStore;
		}
		data[count] = obj; /* if array isn't full, add obj to array */
		count++; /* increase count each time something is added to array */
	}
	
	public Object get(int i) throws Exception{ /* method get(), taking argument i, returns i indexed element in the array */
		return data[i];
	}
	
   public void remove(int i) throws Exception{ /* method remove(), taking argument i, removes i indexed element in array */
	   dataStore = new Object[data.length-1]; /* new array dataStore has length of current array minus 1, as an element is being removed */
	   for (int r = 0; r < data.length; r++) { /* for loop iterates through array, copying all elements except i to new array dataStore */
		   if (r == i) {
			   dCount++;
			   continue;
		   } else {
			   dataStore[rCount] = data[dCount];
			   rCount++;
			   dCount++;
		   }
	   }
	   data = dataStore; /* make current array new array */
   	}
   
   public void printArray() { /* method printArray() prints each element in the array */
	   for (int i = 0; i < data.length; i++) { /* for each element in the array length, print element */
		   System.out.println(data[i]);
	   }
   }
   
   public static void main(String[] args) throws Exception { /* main method for testing */
     MyArrayList mal = new MyArrayList(); /* new ArrayList called mal */
     mal.add("zero");
     mal.add("one");
     mal.add("two");
     mal.add("three");
     mal.add("four");
     mal.add("five");
     mal.add("six");
     mal.add("seven");
     mal.add("eight");
     mal.add("nine");
     mal.remove(6);
     System.out.println(mal.get(8)); /* returns "nine" as the 6th indexed element was removed */
     mal.printArray();
   }
}
