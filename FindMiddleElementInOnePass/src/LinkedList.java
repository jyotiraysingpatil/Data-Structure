
public class LinkedList {
private Node head;

public LinkedList() {
	head = null;
}

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}

public boolean insert(int data) {
Node newNode =new Node(data);
if(newNode == null) {
	return false;
}
if(head== null) {
	head=newNode;
	return true;
}
	Node temp=head;
	while(temp.getNext()!=null) {
		if(temp.getData() == data) {
			return false;
		}
		temp=temp.getNext();		
	}
	temp.setNext(newNode);
	return true;
}

public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.getData()+"");
	temp=temp.getNext();
	}
	System.out.println();
}

public Node findMiddleInOnePass(Node head) {
	if(head==null) {
		return null;
	}
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.getNext()!=null) {
		slow=slow.getNext();
		fast=fast.getNext().getNext();
	}
	return slow;
}

}
