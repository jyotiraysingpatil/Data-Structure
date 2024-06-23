
public class Main {
	public static void main(String[] args) {
		  Queue<Integer> q = new Queue<>();
	q.insertEnqueue(2);
	q.insertEnqueue(60);
	q.insertEnqueue(6);
	q.insertEnqueue(4);
	System.out.println("the size of queue is: "+q.getSize());
System.out.println("peek element is: "+q.peek());
q.removeDequeue();
q.removeDequeue();



	}

}
