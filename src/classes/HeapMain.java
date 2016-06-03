package classes;

import java.util.Arrays;

/**
 * Main class with test cases
 * 
 * 
 * 
 * @author Viraj Shah
 *
 */
public class HeapMain {
	public static void main(String args[]) {
		BinaryMinHeap a = new BinaryMinHeap(10);
		/**
		 * Test: method insert
		 */
		a.insert(25);
		a.insert(333);
		a.insert(4);
		a.insert(-45);
		a.insert(12);

		/**
		 * Test: method insert
		 */
		System.out.println(a.contains(12));
		System.out.println(a.contains(50));

		System.out.println(Arrays.toString(a.heap));
	}
}
