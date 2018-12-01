package Queue;
import java.util.ArrayList;

/*
 * basic queue implementation 
 * using ArrayList
 * with no length restriction
 */
 class NewQueue {
	
	private ArrayList<Integer> data;
	private int pointerStart =0;

	public NewQueue() {
		data = new ArrayList<Integer>();
	}
	
	public boolean isEmpty() {
		return pointerStart > data.size();
	}
	
	public boolean enqueue(int newEntry) {
		return data.add(newEntry);
	}
	
	public boolean dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			return false;
		}
		pointerStart++;
		System.out.println("Element Removed");
		return true;
	}
	
	public int Front() {
		return data.get(pointerStart);
	}
	
	public void printAllElements() {
		System.out.println("All Elements: ");
		for(int element : data) {
			System.out.print(" "+ element);
		}
		System.out.println();
		
		System.out.println("Queue Elements");
		
		for(int i = pointerStart; i< data.size(); i++) {
			System.out.print(" " + data.get(i));
		}
		System.out.println();
	}
}

class Queue{
	
	public static void main(String[] arg) {
		NewQueue q = new NewQueue();
		
		q.enqueue(1);
		
		q.printAllElements();
		
		q.enqueue(2);
		
		q.printAllElements();
		
		if(!q.isEmpty()) {
			q.dequeue();
		}

		q.printAllElements();
		
		q.enqueue(3);
		
		q.printAllElements();
		
		q.enqueue(4);
		
		q.printAllElements();
		
		if(!q.isEmpty()) {
			q.dequeue();
		}
		
		q.printAllElements();
	}
}
