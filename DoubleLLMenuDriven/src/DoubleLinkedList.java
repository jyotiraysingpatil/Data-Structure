
public class DoubleLinkedList {
private Node head;

public DoubleLinkedList() {

	this.head = null;
}

public Node getHead() {
	return head;
}

public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.getData()+"");
		temp=temp.getNext();
		
	}
	System.out.println();
}






public void setHead(Node head) {
	this.head = head;
}

//public boolean insert(int data) {
//    Node newNode = new Node(data);
//    if (newNode == null) {
//        return false; 
//    }
//
//    if (head == null) {
//        head = newNode; 
//        return true;
//    }
//
//    Node last = head;
//    while (last.getNext() != null) {
//        last = last.getNext();
//    }
//
//    last.setNext(newNode);
//    newNode.setPrev(last);
//
//    return true;
//}


public boolean in(int data) {
    Node newNode = new Node(data);
    if (newNode == null) {
        return false; 
    }
    if (head == null) {
        head = newNode; 
    }
    Node last = head;
    while (last.getNext() != null) {
        last = last.getNext();
    }

    last.setNext(newNode);
    newNode.setPrev(last);

    return true;
}









//insert ate perticular position

public boolean insert(int data, int position) {
    if (position <= 0 || (head == null && position > 1)) {
        return false; // Invalid position
    }

    Node newNode = new Node(data);
    if (newNode == null) {
        return false; // Memory allocation failed
    }

    if (position == 1) {
        if (head != null) {
            newNode.setNext(head);
            head.setPrev(newNode);
        }
        head = newNode; // New node becomes head
        return true;
    }

    Node prevNode = head;
    for (int i = 1; i < position - 1; i++) {
        prevNode = prevNode.getNext();
        if (prevNode == null) {
            return false; // Position exceeds list size  prev is set null
        }
    }

    Node nextNode = prevNode.getNext();

    newNode.setPrev(prevNode);
    if (nextNode != null) {
        newNode.setNext(nextNode);
        nextNode.setPrev(newNode);
    }
    prevNode.setNext(newNode);

    return true;
}














}