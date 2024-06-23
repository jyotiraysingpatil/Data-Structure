
public class Queue {
private Node front,rear;
private int size;
public Queue() {
	front=rear  =null;
	this.size = 0;
}
public Node getFront() {
	return front;
}
public void setFront(Node front) {
	this.front = front;
}
public Node getRear() {
	return rear;
}
public void setRear(Node rear) {
	this.rear = rear;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}

public boolean isEmpty() {
	return front == null;
}

public void insertEnqueue(int data)
{
Node newNode=new Node(data);
if(rear == null) {
	front=rear=newNode;
}
else {
	rear.setNext(newNode);
	rear=newNode;
}
size++;
System.out.println("Enqueued :"+data);

}

public int removeDequeue() {
	if(isEmpty()) {
		System.out.println("Queue is empty");
		return -99;
	}
	int data=front.getData();
	front=front.getNext();
	
	if(front == null) {
		rear=null;
	}
	size--;
	System.out.println("Dequeued"+data);
	return data;
}

public int peek() {
	if(isEmpty()) {
		System.out.println("queue is empty");
		return -99;
	}
	return front.getData();
}
}