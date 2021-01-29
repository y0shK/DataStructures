package linkedListImplementation;

public class LinkedListTester {
	
	public static void pInt(int i) {
		System.out.println(i);
	}
	
	public static void pLL(LinkedList ll) {
		System.out.println(ll);
	}

	public static void main(String[] args) {
		
		LinkedList ll1 = new LinkedList(2);
		int size = ll1.getSize();
		pInt(size); // 1
		
		ll1.append(3);
		pInt(ll1.getSize()); // 2
		
		for (int i = 0; i < 4; i++) {
			ll1.append(62 + i);
		}
		pInt(ll1.getSize()); // 6
		
		pLL(ll1); // 2 -> 3 -> 62 -> 63 -> 64 -> 65
		
		ll1.prepend(12); // 12 -> 2 -> 3 -> 62 -> 63 -> 64 -> 65
		ll1.prepend(0); // 0 -> 12 -> 2 -> 3 -> 62 -> 63 -> 64 -> 65
		
		pLL(ll1);
		
		ll1.insertTo(324, 3); // 0 -> 12 -> 2 -> 324 -> 3 -> 62 -> 63 -> 64 -> 65
		
		pLL(ll1);
		
		ll1.delete(0);
		
		pLL(ll1); // -> 12 -> 2 -> 324 -> 3 -> 62 -> 63 -> 64 -> 65
		
	}

}
