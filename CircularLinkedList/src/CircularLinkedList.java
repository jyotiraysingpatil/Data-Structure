
public class CircularLinkedList {
private Node head;

public CircularLinkedList() {
head = null;
}

public boolean insert(int data) {
	Node newNode=new Node(data);
	if(newNode == null) {
		return false;
	}
	
	if(head == null) {
		head=newNode;
		head.setNext(head);
  return true;
}

	Node last=head;
	while(last.getNext()!=head) {
		last=last.getNext();
	}
	last.setNext(newNode);
	newNode.setNext(head);
	return true;
}

public void display() {
	if(head == null) {
		return;
	}
	Node temp=head;
	do {
		System.out.println(temp.getData()+"");
		temp=temp.getNext();
	}while(temp!=head);
	System.out.println();
	
}
}
