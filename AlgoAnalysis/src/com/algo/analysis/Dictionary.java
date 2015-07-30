/**
 * 
 */
package com.algo.analysis;

/**
 * @author NAYAKDUR
 *
 */
public interface Dictionary<T> {

	public T search(T T);
	public boolean insert(T T);
	public T delete(T T);
	public T getPredessor(T T);
	public T getSuccessor(T T);
	
}
