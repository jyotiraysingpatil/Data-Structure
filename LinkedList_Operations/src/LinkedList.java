
public class LinkedList {
private Node head;

public LinkedList(Node head) {
	this.head = head;
}

public Node getHead() {
	return head;
}

public LinkedList() {
	head=null;
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
	
	while(temp.getnext() != null) {
		temp=temp.getnext();
		if(temp.getData() == data) {
			return false;
		}
	}
	temp.setnext(newNode);
	return true;
}

public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.getData()+"");
		temp=temp.getnext();
	}
	System.out.println();
}

public void addFirst(int data) {
Node newNode=new Node(data);
head=newNode.getnext();
head=newNode;	
}

public boolean addLast(int data) {
	Node newNode=new Node(data);
	if(newNode == null) {
		return false;
	}
	
	if(head== null) {
		head=newNode;
		return true;
	}
	
	Node temp=head;
	while(temp.getnext()!=null ) {
		temp=temp.getnext();
	}
	temp.setnext(newNode);
	return true;
}

public boolean insert(int data,int position)
{
	if(position <= 0) {
		return false;
	}
	
	Node newNode=new Node(data);
	if(newNode == null) {
		return false;
	}
	
	if(position == 1) {
		newNode.setnext(head);
		head=newNode;
		return true;
	}
	
	Node prev =head;
	for(int i=1;i<position-1 ;i++) {
		prev=prev.getnext();
		if(prev == null) {
			return false;
		}
	}
	newNode.setnext(prev.getnext());;
	prev.setnext(newNode);
	return true;
}

public void displayReverse(Node temp) {
	if(temp == null) {
		return;
	}
	displayReverse(temp.getnext());
	System.out.println(temp.getnext());
}
}
