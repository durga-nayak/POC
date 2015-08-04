/**
 * 
 */
package poc.algo.ds.contiguous.stack;

import poc.algo.ds.Stack;


/**
 * @author NAYAKDUR
 *
 */
public class ContiguousStack<E> implements Stack<E>{
	
private Object[] items;
private int INIT_SIZE = 10;
int top = -1;
public ContiguousStack() {
	items = new Object[INIT_SIZE];
}

public void push(E e) {
	
	//Dynamic Array Implementation
	if (top == items.length - 1) {
		Object[] tempArray = new Object[this.items.length * 2];
		for (int i = 0; i < items.length ; i++) {
			tempArray[i] = items[i];
		}
		items = tempArray;
	}
	top++;
	items[top] = e;
}

public E pop() {
	E e = (E) items[top];
	items[top] = null;
	top--;
	return e;
}

public E getSuccessor(int index){
	return (E) items[index+1];
	
}

public E getPredessor(int index){
	return (E) items[index - 1];
	
}

}
