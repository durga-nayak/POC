/**
 * 
 */
package poc.algo.ds.linkedlist.bst;

import poc.algo.ds.Dictionary;

/**
 * @author NAYAKDUR
 *
 */
public class BinarySearchTree<T> implements Dictionary<T> {

	int size;
	TreeNode<T> rootNode;
	/**
	 * 
	 */
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
	}

	private T search(TreeNode<T> root, T t) {
		if (root == null) {
			return null;
		} else if (this.compareTo(root.getT(), t) == -1) {

				return search((TreeNode<T>) root.getRightNode(), t);

		} else if (this.compareTo(root.getT(), t) == 1) {
		
				return search((TreeNode<T>) root.getLeftNode(), t);
		} else {
			return root.getT();
		}
	}
	
	@Override
	public T search(T t) {
		// TODO Auto-generated method stub
		T result = this.search(rootNode, t);
		System.out.println(result);
		return result;
	}

	@Override
	public boolean insert(T t) {
		// TODO Auto-generated method stub
		if (this.rootNode == null) {
			this.rootNode = new TreeNode<T>(t);
		} else {
			insert(rootNode, t);
		}
		return false;
	}

	@Override
	public T delete(T T) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getPredessor(T T) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getSuccessor(T T) {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(Object o1, Object o2) {
		return ((Comparable<? super T>)o1).compareTo((T) o2);
	}
	
	private boolean insert(TreeNode<T> root, T t) {
		if (this.compareTo(root.getT(), t) == -1 || this.compareTo(root.getT(), t) == 0) {
			
			if (root.getRightNode() == null) {
				TreeNode<T> node = new TreeNode<T>(t);
				root.setRightNode(node);
				size++;
			} else {
				insert((TreeNode<T>)root.getRightNode(), t);
			}
			
		} else if (this.compareTo(root.getT(), t) == 1) {
			if (root.getLeftNode() == null) {
				TreeNode<T> node = new TreeNode<T>(t);
				root.setLeftNode(node);
				size++;
			} else {
				insert((TreeNode<T>)root.getLeftNode(), t);
			}
		} 
		return true;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public TreeNode<T> getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode<T> rootNode) {
		this.rootNode = rootNode;
	}
		
}
