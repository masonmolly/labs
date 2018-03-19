import java.util.*; 

public class LinkedListInt {

private Node node;

	public LinkedListInt(int item) { /* constructor to make new linked list */
		node = new Node(); 
		node.value = item; /* node.value is set to argument item */
		node.link = null; /* initial node has no links to other nodes */
	}
	
	class Node { /* class to make node */
	     private int value;
	     private Node link;
	}
	
	public boolean insertItemAtBack(int item) { /* method insertItemAtBack() takes one argument item, to insert at end of linked list */
		Node node2 = new Node();
		node2.value = item; /* new node, node2, has value set to argument item */
		node2.link = null;
		Node node3 = node; /* comparator node */
		while (node3.link != null) {
				node3 = node3.link; /* iterate to end of linked list */
			}
		node3.link = node2; /* insert new node at end of list */
		return true;
	}
	   
	public boolean insertItemAtFront(int item) { /* method insertItemAtFront() takes one argument item, to insert at beginning of linked list */
		Node node2 = new Node();
		node2.value = item; 
		node2.link = node; /* new node node2 links to rest of linked list */
		node = node2; /* node set as node2 */
		return true;
	}
	   
	public boolean deleteItem(int item) { /* method deleteItem() removes the given argument item from the linked list */
		Node node2 = node;
		Node temp = null; /* node to store previous node in iteration */
		if (node2.link == null && node2.value == item) { /* if linked list only has one node, return null list */
			node2 = null;
			return true;
		}
		while (node2.link != null && node2.value != item) { /* else, iterate through linked list until reach item node */
			temp = node2; 
			node2 = node2.link;
		}
		temp.link = node2.link; /* re-links node, skipping node to be deleted */
		return true;
	}
	             
	public void printList() { /* method printList() prints the linked list */
		Node node2 = node;
	    if (node2.link != null) { /* iterates through linked list, printing the value of each node */
	    	System.out.println(node2.value);
	    	while (node2.link != null) {
	    		node2 = node2.link;
	    		System.out.println(node2.value);
	    	 }
	     } else { /* if only one node in list, print just the first value */
	    	 System.out.println(node2.value);
	     }
		
	}
	   
	public void sortListDesc() { /* method sortListDesc() sorts the linked list in descending order */
		ArrayList<Integer> sorted = new ArrayList<Integer>(); /* new ArrayList to hold linked list values */
		Node node2 = node;
		while (node2.link != null) { /* iterates through linked list, adding each value to ArrayList sorted */
			sorted.add(node2.value);
			node2 = node2.link; 
		}
		sorted.add(node2.value);
		Collections.sort(sorted); /* array of linked list is sorted and printed */
		for(Integer value: sorted){
			System.out.println(value);
		}
	}
}