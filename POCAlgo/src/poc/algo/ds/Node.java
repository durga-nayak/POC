/**
 * 
 */
package poc.algo.ds;

/**
 * @author Lali
 *
 */
public class Node<T>{
	String label;
	T t;
	Node<T> parentNode;
	Node<T> leftNode;
	Node<T> rightNode;
	public Node (T t) {
		this.t = t;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public Node<T> getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}
	public Node<T> getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}	
	
	public Node<T> getParentNode() {
		return parentNode;
	}
	public void setParentNode(Node<T> parentNode) {
		this.parentNode = parentNode;
	}
}
