
public class Stack {
	private Node top;
	
	public Stack() {
		top=null;
	}
	
	public boolean isEmpty() {
		return top== null;
	}
	
	public void push(int data) {
	    Node newNode = new Node(data);
	    newNode.setNext(top);
	    top = newNode;
	}

	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty!!!");
		return -999;
		}
		int popData=top.getData();
		top=top.getNext();
		return popData;
			
		}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty!!!");
		return -999;
		}
		return top.getData();
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.getData()+"");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	
	
}