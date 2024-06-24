
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
public boolean insert(int data) {
	Node newNode=new Node(data);
	if(newNode == null) {
		return false;
	}
	if(head ==null) {
		head=newNode;
		return false;
	}
	Node temp=head;
	while(temp.getNext()!=null) {
		temp=temp.getNext();
		if(temp.getData()==data) {
			return false;
		}
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

public void deleteFirst() {
	if(head==null) {
		System.out.println("first node deleted");
	}
	head=head.getNext()	;
}

public void deleteLastElement() {
	
	if(head == null) {
		System.out.println("list is empty");
		return;
	}
	Node temp=head;
	Node prev=null;
	while(temp.getNext()!=null) {
		
	    prev=temp;
	    temp=temp.getNext();
		}
	if(prev == null) {
		head=null;
	}else {
		prev.setNext(null);
	}
}

public void deleteByPosition(int pos) {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    if (pos < 0) {
        System.out.println("Invalid position. Position should be >= 0.");
        return;
    }
    if (pos == 0) {
        head = head.getNext();
        return;
    }
    Node cur = head;
    Node prev = null;
    int curpos = 0;
    while (cur != null && curpos < pos - 1) {
        prev = cur;
        cur = cur.getNext();
        curpos++;
    }
    if (cur == null || cur.getNext() == null) {
        System.out.println("Position exceeds the length of the list.");
        return;
    }
    prev.setNext(cur.getNext());
}


}
