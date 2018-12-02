package Queue;

class MyCircularQ {
    
    int[] queue;
    int start= -1;
    int end = -1;
    
    int k;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQ(int k) {
       queue = new int[k]; 
        this.k = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
           return false; 
        }
        
        if(start == -1 && end == -1){
            start =0;
            end = 0;
        }else{
           end++;  
        }
        queue[end%k] = value;
        
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(start%k == end%k){
            start = -1;
            end = -1;
            return true;
        }
        start ++;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
       if(isEmpty()){
            return -1;
        }
        return queue[start%k]; 
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return queue[end%k];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(start == -1 && end == -1){
            return true;
        }
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(start%k == ( end+1)%k){
            return true;
        }
        return false;
    }
}

class MyCircularQueue{
	
	public static void main(String[] arg) {
		 MyCircularQ obj = new MyCircularQ(6);
		 
		 System.out.print(" "+ obj.enQueue(6));
		 System.out.print(" "+ obj.Rear() );
		 System.out.print(" "+  obj.Rear());
		 System.out.print(" "+ obj.deQueue());
		 System.out.print(" "+ obj.enQueue(5));
		 System.out.print(" "+ obj.Rear());
		 
		 System.out.print(" "+ obj.deQueue());
		 System.out.print(" "+ obj.Front());
		 System.out.print(" "+ obj.deQueue());
		 
//		  boolean param_1 = obj.enQueue(6);
//		  boolean param_2 = obj.deQueue();
//		 int param_3 = obj.Front();
//		 int param_4 = obj.Rear();
//		  boolean param_5 = obj.isEmpty();
//		  boolean param_6 = obj.isFull();
	}
}
