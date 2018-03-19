import java.util.*;

public class MyHashMap {
	
private Container c;
private List<Container> recordList;
public int listIndex = 0; /* default index is 0 */
   
   public MyHashMap(){
	   recordList = new ArrayList<Container>(); /* sets List variable recordList to new ArrayList, taking Container object as input, when new MyHashMap() is created */
   }
   
   public void put(Object k, Object v){ /* method put() adds or sets a new element in the hash map */
	   c = new Container();
	   c.insert(k,v); /* sets given values to the container */
	   
	   Iterator<Container> iterator = recordList.iterator(); /* makes iterator of recordList */
	   while(iterator.hasNext()) { /* iterates through recordList, comparing given key against existing keys */
		   Container compare = iterator.next();
		   if (compare.key.equals(k)) { /* if given key already exists, find index of the current object and set its value to given value v */
			   int index = recordList.indexOf(compare);
			   recordList.set(index, c);
			   return; /* breaks out of method */
		   }
	   }
	   
	   recordList.add(listIndex,c); /* adds given values to end of recordList, if key doesn't exist already */
	   listIndex = listIndex + 1; /* adds one to recordList index variable */
   }
   
   public boolean remove(Object k){ /* method remove() removes the element containing key k */
	   Iterator<Container> iterator = recordList.iterator();
	   while(iterator.hasNext()) { /* iterates through recordList */
		   Container r = iterator.next();
		   if (r.key.equals(k)) { /* if key in current Container element r is the same as given key k, find index of r, and remove the element, returning true */
			   int index = recordList.indexOf(r);
			   recordList.remove(index);
			   return true;
		   }
	   }
	   return false; /* if key k element doesn't exist, return false */
   }
   
   public String toString() { /* method toString() returns the hash map as a string */
	   return "MyHashMap " + recordList;
   }
   
   public void printMyHashMap() { /* method printMyHashMap() prints the hash map */
	   System.out.println(recordList.toString());
   }
   
   public Object get(Object k){ /* method get() returns the value of key k */
	   Iterator<Container> iterator = recordList.iterator(); 
	   while(iterator.hasNext()) { /* iterates through recordList */
		   Container g = iterator.next();
		   if (g.key.equals(k)) { /* if current Container object g's key element is the same as given key k, return current element g's value */
			   return g.value;
		   }
	   }
	   return null; /* if key k doesn't exist, return null */
   }
   

   public static void main(String[] args) { /* testing in main method */
	   MyHashMap map = new MyHashMap();
	   map.put("aaa", 10); /* sets value 10 to key "aaa" */
	   map.put("bbb", 20);
	   map.put("ccc", 30);
	   map.put("ddd", 40);
	   System.out.println(map.toString());
	   System.out.println(map.get("ccc")); /* gets value of key "ccc" - 30 */
	   map.put("ccc", 50); /* as "ccc" already exists, sets value of "ccc" to 50 (from 30) */
	   map.remove("aaa"); /* removes key "aaa" and corresponding value */
	   System.out.println(map.get("aaa")); /* "aaa" no longer exists, returns null */
	   System.out.println(map.get("bbb"));
	   System.out.println(map.get("eee"));
	   map.printMyHashMap();
       }
}