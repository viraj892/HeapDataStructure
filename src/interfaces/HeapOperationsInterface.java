package interfaces;

/**
 * Interface for Heap operations
 * 
 * @author Viraj Shah
 *
 */
public interface HeapOperationsInterface {
	/**
	 * Attempt to insert {@code value} into the collection and return
	 * {@code true} if the collection is modified after this method returns
	 * (e.g. {@code value} was not already contained in the collection)
	 * 
	 * @param value
	 *            a long value to insert into the collection
	 * @return {@code true} if {@code value} didn't previously exist in the
	 *         collection and is inserted
	 */
	public boolean insert(long value);

	/**
	 * Return {@code true} if {@code value} exists within the collection.
	 * 
	 * @param value
	 *            the value for which to check
	 * @return {@code true} if {@code value} is contained within the collection
	 */
	public boolean contains(long value);

	/**
	 * Move node at position {@code index} to its correct position satisfying properties on min heap
	 * 
	 * @param index
	 *            the index position of the node that is to be moved to its
	 *            correct position
	 */
	public void heapifyUp(int index);
}
