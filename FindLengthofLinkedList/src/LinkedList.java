
public class LinkedList {
private Node head;

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

public LinkedList() {
	
}

public boolean insert(int data) {

    Node newNode = new Node(data);
    if (newNode == null) {
        return false;
    }


    if (head == null) {
        head = newNode;
        return true;
    }

    Node temp = head;
    if(head.getData() == data) {
        return false;
    }
    while (temp.getNext() != null) {
        temp = temp.getNext();
        if(temp.getData() == data) {
            return false;
        }
    }

    temp.setNext(newNode);
    return true;
}

public void display() {
	Node temp = head;

    while(temp != null) {
        System.out.print(temp.getData() + " ");
        temp = temp.getNext();
    }
    System.out.println();
}

public int findLength() {
    int size = 0;
    Node c = head;
    while (c != null) {
        c = c.getNext();
        size++;
    }
    return size;
}



}

