/**
 * 
 */
package com.algo.analysis.linkedlist.ds;

import com.algo.analysis.Node;
import com.algo.analysis.PriorityQueue;

/**
 * @author NAYAKDUR
 *
 */
public class QueueImpl<T> implements PriorityQueue<T> {
	
	private Node<T> root;
	

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	@Override
	public boolean insert(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T findMinimum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findMaximum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T deleteMinimum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T deleteMaximum() {
		// TODO Auto-generated method stub
		return null;
	}

}
