
public class LinkedList {
private Node head;

public LinkedList(Node head) {

	this.head = head;
}

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
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
	
	while(temp.getNext()!=null) {
		temp=temp.getNext();
	if(temp.getData() == data) {
		return false;
	}
		
	}temp.setNext(newNode);
	return true;
	
}

public void display() {
	Node temp=head;
	while(temp!= null) {
		System.out.println(temp.getData()+"");
		temp=temp.getNext();	
	}
	System.out.println();
}

public void sort() {
    if (head == null || head.getNext() == null) {
        return; // No need to sort if list is empty or has only one node
    }

    Node current = head;
    while (current != null) {
        Node min = current;
        Node next = current.getNext();

        while (next != null) {
            if (next.getData() < min.getData()) {
                min = next;
            }
            next = next.getNext();
        }

        // Swap data between current and min
        int temp = current.getData();
        current.setData(min.getData());
        min.setData(temp);

        current = current.getNext();
    }
}



}
	






