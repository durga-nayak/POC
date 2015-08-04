/**
 * 
 */
package com.algo.analysis.contiguous.ds.impl;

/**
 * @author NAYAKDUR
 *
 */
public interface Stack<E> {
	public void push(E e);
	public E pop();
	public E getSuccessor(int index);
	public E getPredessor(int index);
}
