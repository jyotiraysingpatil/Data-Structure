
public class LinkedList {
private Node head;
public LinkedList() {
	head=null;
}
public Node getHead() {
	return head;
}
public void setHead(Node head) {
	this.head = head;
}

public void display() {
	Node temp=head;
	while(temp!=null) {
		
		System.out.println(temp.getData()+" ");
		temp=temp.getNext();
	}
	System.out.println();
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
while(temp.getNext()!=null) {
	temp=temp.getNext();
	if(temp.getData() ==data) {
		return false;
	}
}
temp.setNext(newNode);
return true;
}

public boolean insertByPos(int data,int pos) {
	if(head == null ) {
		return false;
	}
	Node newNode=new Node(data);
	Node prev=head;
	for(int i=1;i<pos-1;i++) {
		prev=prev.getNext();
	}
	newNode.setNext(prev.getNext());
	prev.setNext(newNode);
	return true;
	
}

public void deleteByPos(int pos) {
	Node temp=head;
	for(int i=1;i<pos-1; i++) {
		temp=temp.getNext();
	}
	temp.setNext(temp.getNext().getNext());
}


public boolean deleteByVal(int val) {
if(head == null) {
	return false;
}
if(head.getData() == val) {
	head=head.getNext();
	return true;
}
Node prev=head;
Node del=head;
while(del.getData() != val) {
	prev=del;
	del=del.getNext();
	if(del == null) {
		return false;
	}
}
prev.setNext(del.getNext());
return true;
}

public void addFirst(int data) {
	Node newNode=new Node(data);
	newNode.setNext(head);
	head=newNode;
}

public boolean addLast(int data) {
	Node newNode=new Node(data);
	Node temp=head;
	while(temp.getNext()!=null) {
		temp=temp.getNext();
	}
	temp.setNext(newNode);
	return true;
}

public boolean addMiddle(int data, int pos) {
    Node newNode = new Node(data);
    Node prev = head;

    if (pos == 1) {
        newNode.setNext(head);
        head = newNode;
        return true;
    }

    for (int i = 1; i < pos - 1; i++) {
        if (prev == null || prev.getNext() == null) {
            return false; 
        }
        prev = prev.getNext();
    }

    newNode.setNext(prev.getNext());
    prev.setNext(newNode);
    return true;
}

//del first
public void deleteFirst() {
	if(head== null) {
		System.out.println("first node deleted ");
	}
	head=head.getNext();
}

//del last
public void deleteLast() {
	if(head == null) {
		System.out.println("list is empty ");
		return;
	}
	Node temp=head;
	Node prev=null;
	while(temp.getNext() !=null) {
		prev=temp;
		temp=temp.getNext();
	}
	if(prev == null) {
		head=null;
	}
	else {
		prev.setNext(null);
	}
}

//delete middle
public void deleteMiddle() {
	if(head == null || head.getNext() == null) {
		return;
	}
	Node slow=head;
	Node fast=head;
	Node prev=null;
	while(fast !=null && fast.getNext() != null) {
		prev=slow;
	
	slow=slow.getNext();
	fast=fast.getNext().getNext();
	}
	if(prev !=null ) {
		prev.setNext(slow.getNext());
	}
	else {
		head=slow.getNext();
	}
}




}