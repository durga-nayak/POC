/**
 * 
 */
package poc.algo.ds.contiguous.queue;

import poc.algo.ds.Queue;

/**
 * @author NAYAKDUR
 * @param <E>
 *
 */
public class QueueImpl<E> implements Queue<E>{
	
	protected Object[] items;
	private int INIT_SIZE = 11;
	int head = -1;
	int tail = -1;
	
	public QueueImpl() {
		items = new Object[INIT_SIZE];
	}
	
	
	@Override
	public void enQueue(E e) {
		if (head == -1) {
			head++;
		}
		tail++;
		items[tail] = e;
	}

	@Override
	public E deQueue() {
		E e = (E) this.items[head];
		items[head] = null;
		head++;
		return e;
	}

}
