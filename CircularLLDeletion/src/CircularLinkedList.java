
public class CircularLinkedList {
private Node head;

public CircularLinkedList() {
	head=null;
}
public Node getHead() {
	return head;
}
public void setHead(Node head) {
	this.head = head;
}
public CircularLinkedList(Node head) {
	this.head = head;
}

public boolean insert(int data) {
	Node newNode=new Node(data);
	if(newNode== null) {
		return false;
	}
	if(head==null) {
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

public boolean deleteByVal(int data) {
	if(head == null) {
		return false;
	}
	if(head.getData()==data) {
		if(head.getNext()==head) {
			head=null;
			return true;
		}
		Node last=head;
		while(last.getNext()!=head) {
			last=last.getNext();
		}
		head=head.getNext();
		last.setNext(head);
		return true;
	}
	Node prev=head,del=head;
	while(del.getData()!=data) {
		prev=del;
		del=del.getNext();
		if(del==head) {
			return false;
		}
	}
	prev.setNext(del.getNext());
	return true;
}


public boolean deleteByPosition(int data,int pos) {
	if(head== null || pos<=0) {
		return false;
	}
	if(pos == 1) {
		if(head.getNext() ==head) {
			head=null;
			return true;
		}
		Node last=head;
		while(last.getNext() !=head) {
			last=last.getNext();
		}
		head=head.getNext();
		last.setNext(head);
		return true;
	}
	
	Node prev=head;
	for(int i=1;i<pos-1;i++) {
		prev=prev.getNext();
		if(prev.getNext()==head) {
		   return false;
		}
		
	}
	Node del=prev.getNext();
	prev.setNext(del.getNext());
	return true;
	
}
}
