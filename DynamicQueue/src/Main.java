
public class Main {

	public static void main(String[] args) {
		  Queue q = new Queue();

	        q.insertEnqueue(1);
	        q.insertEnqueue(5);
	        q.insertEnqueue(70);
	        q.insertEnqueue(60);
	       
	        System.out.println("Front element is: " + q.peek());
	        q.removeDequeue();
	        q.removeDequeue();

	        
	        System.out.println("Is the queue empty? " + q.isEmpty());

	        // Get the size of the queue
	        System.out.println("Queue size is: " + q.getSize());

	       
	    }

}
