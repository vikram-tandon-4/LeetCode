package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

	  public static void main(String[] args) {
	        // 1. Initialize a queue.
	        Queue<Integer> q = new LinkedList<Integer>();
	        // 2. Get the first element - return null if queue is empty.
	        System.out.println("The first element is: " + q.peek());
	        // 3. Push new element.
	        q.offer(5);
	        System.out.println("The first element is: " + q.peek());
	        q.offer(13);
	        System.out.println("The first element is: " + q.peek());
	        q.offer(8);
	        System.out.println("The first element is: " + q.peek());
	        q.offer(6);
	        System.out.println("The first element is: " + q.peek());
	        // 4. Pop an element.
	        q.poll();
	        // 5. Get the first element.
	        System.out.println("The first element is: " + q.peek());
	        // 7. Get the size of the queue.
	        System.out.println("The size is: " + q.size());
	        
	        
	        
	        Queue<String> queue = new LinkedList<String>();
			
			queue.add("x");
			queue.add("y");
			queue.add("z");
			queue.add("a");
			queue.add("b");
			queue.add("c");
			
			System.out.println("queue= "+ queue);
			System.out.println("head of queue-" + queue.peek());
			System.out.println(queue.remove());
			System.out.println("queue= "+ queue);
			System.out.println("head of queue-" + queue.peek());
			System.out.println(queue.add("d"));
			System.out.println("queue= "+ queue);
			System.out.println(queue.remove());
			System.out.println("queue= "+ queue);
			
	    }
}
