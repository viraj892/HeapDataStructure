package classes;

import interfaces.HeapOperationsInterface;

/**
 * 
 * @author Viraj Shah
 *
 */
public class BinaryMinHeap implements HeapOperationsInterface {
	long[] heap;
	int curr_heap_size;

	public BinaryMinHeap(int size) {
		heap = new long[size];
		curr_heap_size = 0;
	}

	/**
	 * 
	 * @param index
	 *            array position of a heap node
	 * @return array position parent of heap node {@code index}
	 */
	private int parent(int index) {
		return (index - 1) / 2;
	}

	/**
	 * Add element {@code value} to the heap
	 * 
	 * @param value
	 *            element to be added to the heap
	 * @return true if element {@code value} is successfully inserted into the
	 *         heap false otherwise
	 * 
	 */
	@Override
	public boolean insert(long value) {
		if (curr_heap_size != heap.length) {

			heap[curr_heap_size] = value;
			heapifyUp(curr_heap_size);
			curr_heap_size++;
			return true;
		}
		System.out.println("Heap is full!");
		return false;

	}

	/**
	 * Additional method added to interface Swaps {@code i} with it's parent if
	 * it is greater, to satisfy min heap property
	 * 
	 * @param i
	 *            index to shift up the heap
	 * 
	 */
	@Override
	public void heapifyUp(int i) {
		int p;
		if (i != 0) {
			p = parent(i);
			// Swap if parent of i is greater
			if (heap[p] > heap[i]) {
				long x = heap[p];
				heap[p] = heap[i];
				heap[i] = x;
				heapifyUp(p);
			}
		}
	}

	/**
	 * Note: Design decision --Linear search is used here since it takes O(n)
	 * time compared to the case of using merge sort + binary search [(nlogn +
	 * logn) = O(nlogn))]
	 * 
	 * @param value
	 *            element to be searched for in the heap
	 * 
	 * @return {@code true} if element exists in heap, {@code false} otherwise
	 * 
	 */
	@Override
	public boolean contains(long value) {
		for (int i = 0; i < curr_heap_size; i++) {
			if (heap[i] == value)
				return true;
		}
		return false;
	}
}
