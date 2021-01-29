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
	
	
}
