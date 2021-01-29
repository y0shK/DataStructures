package dynamicArrayImplementation;

public class DynamicArrayTester {
	
	// things in main are callable and executable
	public static void main(String[] args) {
		
		DynamicArray da = new DynamicArray();
		
		/*
		System.out.println(da.getSize());
		da.add(2);
		da.add(3);
		da.add(42);
		da.add(62);
		System.out.println(da.getSize());
		System.out.println(da);
		
		// if null is -1
		// then da is [2, 3, 42, 62, -1]
		// da.remove(3) should be [2, 3, 42, -1]
		da.remove(3);
		da.remove(da.getSize()); // [2, 3, 42]
		
		da.remove(0); // [3, 42]
		
		System.out.println(da);
		
		da.add(42);
		da.add(57);
		
		// [3, 42, 42, 57]
		da.remove(1);
		da.remove(0);
		da.remove(da.getSize());
		
		// [42]
		System.out.println(da);
		*/
		
		da.add(2);
		da.add(3);
		da.add(4);
		da.add(5);
		
		// da.getSize() will return non-null size
		da.remove(da.getSize());
		System.out.println(da);
		
		DynamicArray da2 = new DynamicArray();
		
		System.out.println(da2);
		
		
	}

}
