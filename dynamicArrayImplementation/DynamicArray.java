package dynamicArrayImplementation;

import java.util.Arrays;

public class DynamicArray {
	
	// instance variables
	// default value for dynamic arrays is x == 5;
	Node[] arrayNodes;
	boolean isFull;
	
	// constructors
	public DynamicArray() {
		arrayNodes = new Node[5]; // this is setting the space for node array
		isFull = false;
	}
	
	// methods
	// add, rm, size, ...
	
	public void add(int data) {
		// we want to add a new node to the node array
		
		// create a node with the data that we're given
		Node newNode = new Node(data);
		boolean notFull = false; // default value
		
		// 2 cases
		// either the array is not full and we simply append at the first null spot
		// or is the array is full, and we double, cp, etc. and then append
		
		// first, figure out which case is true
		
		for (int i = 0; i < arrayNodes.length; i++) {
			if (arrayNodes[i] == null) {
				notFull = true;
			}
		}
		
		// CASE notFull
				// iterate through the node array
				// if we get a null value, then the array has space
				// otherwise, we keep going
		
		if (notFull) {
			for (int i = 0; i < arrayNodes.length; i++) {
				if (arrayNodes[i] == null) {
					arrayNodes[i] = newNode;
					break; // this break is critical, otherwise newNode will be added to ALL elements
				}
			}
		}
		else { // it is full
			// double the size of the array into a new array
			Node[] doubleArrayNodes = new Node[arrayNodes.length * 2];
			
			// copy all old array contents into the new array
			for (int i = 0; i < arrayNodes.length; i++) {
				doubleArrayNodes[i] = arrayNodes[i];
			}
			
			// now that we have an array with copied contents and double the size,
			// give the new array value to the old array
			arrayNodes = doubleArrayNodes;
			
			// now we have space to add the node
			for (int i = 0; i < arrayNodes.length; i++) {
				if (arrayNodes[i] == null) {
					arrayNodes[i] = newNode;
					break;
				}
			}
		}
		
	}
	
	public int getSize() {
		
		// to get the size, we'll iterate through the array
		// and find how many elements aren't null (i.e. are nodes)
		// we'll count how many and return that
		
		int count = 0;
		
		for (int i = 0; i < arrayNodes.length; i++) {
			if (arrayNodes[i] != null) {
				count++;
			}
		}
		
		return count;
	}
	
	public String toString() {
		
		// for each element in the Node array,
		// if the element is null, then catch the NullPointerException
		
		int[] nodeVals = new int[arrayNodes.length];
		
		for (int i = 0; i < arrayNodes.length; i++) {
			try {
				nodeVals[i] = arrayNodes[i].data;
			}
			// try-catch loop with exception e: https://www.geeksforgeeks.org/null-pointer-exception-in-java/
			catch (NullPointerException e) {
				System.out.println("At least one node in the array is null");
				break;
			}
		}
		
		return Arrays.toString(nodeVals);
		
		
	}
	
	// Data Structures EC #1
	public void remove(int index) {
		// what happens if the index is out of bounds?
		// take care of this with the if statement beforehand
		
		// what happens if there's a hole? how to patch it?
		// create a new array which only adds non-null elements,
		// then reassign the old array with the new array's contents
		
		if (0 <= index && index < arrayNodes.length) { // index can't be negative or out of bounds on the right
			// because of zero index, it should be < length and not <=
				
			// also track how many non-null elements there are - this is the length of the new array
			// to the new array, append only the non-null elements (and these will be reassigned to the old array)
			
			int notNullCount = 0;
			
			for (int i = 0; i < arrayNodes.length; i++) {
				if (index == i) { // is this index the one to delete?
					arrayNodes[i] = null;
				}
				else {
					notNullCount++;
				}
			}
			
			// new array
			int indexToAppend = 0;
			
			Node[] notNullNodeArray = new Node[notNullCount];
			for (int i = 0; i < arrayNodes.length; i++) {
				if (arrayNodes[i] != null) {
					// regardless of which array index is being appended (i = 1, 2, 3, ...)
					// indexToAppend must start at 0 and add as many as needed
					// in other words, regardless of whether it's the first, second, ... in the overall node array,
						// it's the first in the non-null array
					notNullNodeArray[indexToAppend] = arrayNodes[i];
					indexToAppend++;
				}
			}
			
			// reassign the new array to arrayNodes
			arrayNodes = notNullNodeArray;
			
		}
		else { // index is either < 0 or > length, which is unsuitable input and would result in IndexOutOfBoundException
			System.out.println("Invalid input");
		}
	}

}
