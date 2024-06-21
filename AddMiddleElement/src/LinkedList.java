
public class LinkedList {
private Node head;

public LinkedList() {
	head=null;
}

public LinkedList(Node head) {
	super();
	this.head = head;
}

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}

public boolean insert(int data) {
	Node newNode=new Node(data);
	if(newNode == null) {
		return false;
	}
	
	if(head== null) {
		head=newNode;
		return true;
	}
	Node temp=head;
	if(head.getData() == data) {
		return false;
	}
	
	while(temp.getNext() != null) {
		temp=temp.getNext();
		if(temp.getData() == data) {
			return false;
		}	
	}temp.setNext(newNode);
	  return true;
	  
}

public void display() {
	Node temp= head;
	while(temp!=null) {
		System.out.println(temp.getData()+"");
		temp=temp.getNext();
	}
	System.out.println();
}

public void insertMiddle(int data) {
	Node newNode =new Node(data);
	if(head == null) {
		head=newNode;
		return;
	}
		Node slow=head;
		Node fast=head;
		Node prev=null;
		
		while(fast!=null && fast.getNext() !=null) {
			prev=slow;
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			
			newNode.setNext(slow);
			if(prev!=null) {
				prev.setNext(newNode);
			}
			else {
				head=newNode;
			}
	}
}





}
