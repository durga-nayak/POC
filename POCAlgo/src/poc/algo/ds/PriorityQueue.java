/**
 * 
 */
package poc.algo.ds;

/**
 * @author NAYAKDUR
 *
 */
public interface PriorityQueue<E> {
	public boolean insert(E e);
	public E findMinimum();
	public E findMaximum();
	public E deleteMinimum();
	public E deleteMaximum();
}
