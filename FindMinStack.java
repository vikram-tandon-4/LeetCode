/*
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */
import java.util.Stack;

public class FindMinStack {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-30);
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin();
		minStack.pop();
		minStack.top();
		System.out.println(minStack.getMin());
	}
}

class MinStack {

	Stack<Integer> st;
	Stack<Integer> min;

	public MinStack() {
		st = new Stack<Integer>();
		min = new Stack<Integer>();
	}

	public void push(int x) {
		st.push(x);
		if (min.empty() || min.peek() > x) {
			min.push(x);
		} else {
			min.push(min.peek());
		}
	}

	public void pop() {
		st.pop();
		min.pop();
	}

	public int top() {
		return st.peek();
	}

	public int getMin() {
		return min.peek();
	}
}