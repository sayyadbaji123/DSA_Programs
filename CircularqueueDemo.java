package queue;

public class CircularqueueDemo {

	   int[] data;
	   int capacity;
	   int front;
	   int rear;
	   int size;
	   
	   
	   public CircularqueueDemo(int capacity) {
		   this.capacity=capacity;
		   this.data=new int[capacity];
		   this.front=0;
		   this.rear=0;
		   this.size=0;
		   
	   }
	   
	   public boolean isEmpty() {
		   return size == 0;
		   
	   }
	   
	   public boolean isFull() {
		   return size== capacity;
		   
	   }
	   
	   public void enqueue(int val) {
		   if(isFull()) {
			   throw new RuntimeException("Queue is full");
		   }
		   data[rear]=val;
		   rear=(rear+1)%capacity;
		   size++;
	   }
	   
	   public int dequeue(){
		   if(isEmpty()) {
			   throw new RuntimeException("Queue is empty");
		   }
		   
		   int removed = data[front];
		   front=(front+1)%capacity;
		   size--;
		   return removed;
		   
	   }
	   
	   
	   public int peek() {
		   if(isEmpty()) {
			   throw new RuntimeException("queue is empty");
		   }
		   return data[front];
	   }
	   
	   public void display() {
		   if(isEmpty()) {
			   System.out.println("queue is empty");
			   return;
		   }
		   
		   for(int i=0; i<size; i++) {
			   System.out.println(data[(front+i)%capacity]+" ");
		   }
	   }
	   
	   
	   public void internalOp() {
		   System.out.println("display the array");
		   for(int vals:data) {
			   System.out.println(vals+" ");
		   }
		   
		   System.out.println("------------");
		   System.out.println("rear: "+rear);
		   System.out.println("front: "+front);
		   System.out.println("size: "+size);
		   System.out.println("--------------");
	   }
	   
	   public static void main(String[] args) {
		   CircularqueueDemo cd = new CircularqueueDemo(5);
		   
		   cd.enqueue(56);
		   cd.enqueue(80);
		   cd.enqueue(48);
		   cd.enqueue(78);
		   
		   
		  cd.display();
		  cd.internalOp();
		  
		  cd.dequeue();
		  cd.dequeue();
		  
		  cd.enqueue(89);
		  cd.internalOp();
		  
		  
		  
	   }
	}