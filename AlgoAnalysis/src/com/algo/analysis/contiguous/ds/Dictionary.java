/**
 * 
 */
package com.algo.analysis.contiguous.ds;

/**
 * @author NAYAKDUR
 *
 */
public interface Dictionary<K,V> {

	public V search(K k);
	public boolean insert(K k, V v);
	public V delete(K k);
	public V getPredecessor(K k);
	public V getSuccessor(K k);
	public V getPredessor(K k);
	
}
