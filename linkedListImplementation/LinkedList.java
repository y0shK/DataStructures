package linkedListImplementation;

public class LinkedList {
	
	// instance variables
	// we always start a linked list by examining the head node
	// the head node is what the linked list variable corresponds to
	Node head;
	int data;
	
	// constructors include data from Node class
	// when we create a LinkedList obj, we're just creating the head
	public LinkedList(int data) {
		this.data = data;
		this.head = new Node(data);
	}
	
	// methods
	
	// size() will count the number of elements and return the count
	// while the current element is not null, keep going, and append count
	// once the current element is null, we've gone past the last element, return the count previously 
	
	public int getSize() {
		
		Node current = head;
		int count = 0;
		
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
		
	}
	
	// appendNode puts a node at the very end of the LinkedList
	// go through all the links and check if the next node is null
		// if it is, we've reached the last element - append after that
	// to iterate through the LinkedList, create a "current" var - don't interact directly with head
	
	public void append(int data) {
		
		Node current = head;
		
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		
	}
	
	// override toString to print a sequence of linked list elements
	// if the element after current is not null, concat the value and an arrow
	// else, just concat the value and end
	
	public String toString() {
		
		Node current = head;
		String concatStr = "";
		
		while (current.next != null) {
			concatStr += current.data + " -> ";
			current = current.next;
		}
		concatStr += current.data; // the next node is null
		
		return concatStr;
	}
	
	
	// create a prepend function - only attach as the first element in the linked list
	// prepend is opposite of append
	// check to see if the node after the current one is the head
		// if it is, then add the node at the very beginning
	
	public void prepend(int data) {
		
		//Node current = head;
		Node newnode = new Node(data);
		
		Node temp = head;
		head = newnode; // put it at the very beginning such that newnode becomes the head
		newnode.next = temp; // all other connections in the linked list stay the same
		
	}
	
	// insertTo is a more generic append function which can put the new node in any position
	// track which position we're at using a counter
	// when we're at the specific index we want to put the new node in, put the new node in
	// the rest of the links are unchanged
	
	// the index provided should be zero-indexed - 0 is 1st element, etc.
	public void insertTo(int data, int index) {
		
		Node current = head;
		int counter = 0;
		
		while (current.next != null) {
			counter++;
			
			if (counter == index) {
				Node temp = current.next;
				current.next = new Node(data);
				current.next.next = temp;
			}
			current = current.next; // remember to move through the nodes to eventually finish the while loop
			
		}
		
	}
	
	// delete will work similarly to insert
	// track the position we're at using a counter
	// when we're at the position, delete the node/reassign the references to patch holes
	public void delete(int index) {
		
		Node current = head;
		int counter = 0;
		
		// 3 cases
		// 1st case: delete first index (0)
		// TODO fix this case
		if (index == 0) {
			while (current.next != null) {
				current = current.next;
			}
		}
		
		// 2nd case: delete last index N
		
		else if (index == getSize()) {
			while (current.next != null) {
				
			}
		}
		
		// 3rd case: delete in between
		// TODO fix this case
		while (current.next != null) {
			counter++;
			
			if (counter == index) {
				current.next = current.next.next;
				// for a doubly linked list, current.prev = current.prev.prev
			}
			current = current.next;
		}
		
	}
	
	
}
