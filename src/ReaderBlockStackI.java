
public interface ReaderBlockStackI
{
	/**
	 * Adds entry to the stack.
	 *
	 * @param item – Item to add to the front of FIFO
	 */
	public void addItem(String item);

	/**
	 * Remove newest item in the stack. Will block until at least one item exists in
	 * stack.
	 *
	 */
	String remove();
}
