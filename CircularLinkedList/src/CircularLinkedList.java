
public class CircularLinkedList {
private Node head;



public Node getHead() {
	return head;
}
public CircularLinkedList() {
	head=null;
}
public void setHead(Node head) {
	this.head = head;
}

public CircularLinkedList(Node head) {
	this.head = head;
}

//insert
public boolean insert(int data) {
    Node newNode = new Node(data);
    if (newNode == null) {
        return false;
    }

    if (head == null) {
        head = newNode;
        head.setNext(head);
        return true;
    }

    Node last = head;
    while (last.getNext() != head) {
        last = last.getNext();
    }

    last.setNext(newNode);
    newNode.setNext(head);
    return true;
}
	
//display
	public void display() {
		if(head==null) {
			return;
		}
		Node temp=head;
		do {
			System.out.println(temp.getData()+"");
			temp=temp.getNext();
		}while(temp!=head);
		System.out.println();
	}
	
	//insert at Last position
	public boolean insertLast(int data) {
		Node newNode=new Node(data);
		Node last=head;
		Node prev=head;
		while(last.getNext()!=head) {
			last=last.getNext();
		}
		newNode.setNext(prev);
		last.setNext(newNode);
		return true;
	}
	
	//insert at first position
	public boolean insertFirst(int data) {
		Node newNode=new Node(data);
		if(head == null) {
			newNode.setNext(newNode);
		}
		else {
			Node last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			newNode.setNext(head);
			last.setNext(newNode);
		}
		head=newNode;
		return true;
	}
	
	//insert at specific position
	public boolean insert(int data,int position) {
		if((head==null && position>1)|| position<=0) {
			return false;
		}
		Node newNode=new Node(data);
		if(position == 1) {
			if(head== null) {
				head=newNode;
				head.setNext(head);
				return true;
			}
			Node last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
				
			}
			newNode.setNext(head);
			head=newNode;
			last.setNext(newNode);
			return true;
		}
		Node prev=head;
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev==head) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}
	
}