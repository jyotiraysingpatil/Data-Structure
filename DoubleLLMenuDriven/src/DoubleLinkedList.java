
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

//insert by value
public boolean insertByVal(int data) {
	Node newNode=new Node(data) ;
		if(newNode== null) {
			return false;
		}
		if(head==null) {
			head=newNode;
			return true;
		}
		Node last=head;
		while(last.getNext() !=null) {
			last=last.getNext();
			if(last.getData()==data) {
				return false;
			}
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;	
}

//insert by position
public boolean insert(int data, int position) {
    if(position <= 0 || (head == null && position > 1)) {
        return false;
    }

    Node newNode = new Node(data);
    if(newNode == null) {
        return false;
    }

    if(position == 1) {
        if(head != null) {
            newNode.setNext(head);
            head.setPrev(newNode);
        }
        head = newNode;
        return true;
    }

    Node prevNode = head;
    for(int i = 1; i < position - 1; i++) {
        prevNode = prevNode.getNext();
        if(prevNode == null) {
            return false;
        }
    }

    Node nextNode = prevNode.getNext();

    newNode.setPrev(prevNode);
    if(nextNode != null) {
        newNode.setNext(nextNode);
        nextNode.setPrev(newNode);
    }
    prevNode.setNext(newNode);

    return true;
}

//delete by val
public boolean deleteByVal(int data) {
    if (head == null) {
        return false; // List is empty, nothing to delete
    }
    if (head.getData() == data) {
        head = head.getNext(); // Move head to the next node
        if (head != null) {
            head.setPrev(null); 
        }
        return true;
    }
    Node del = head;
    while (del != null && del.getData() != data) {
        del = del.getNext(); 
    }
    if (del == null) {
        return false; 
    }
   
    Node prevNode = del.getPrev();
    Node nextNode = del.getNext();
    prevNode.setNext(nextNode); 
    if (nextNode != null) {
        nextNode.setPrev(prevNode); 
    }
    return true;
}

//delete by position
public boolean deleteByPos(int pos) {
	
	Node del=head;
	for(int i=1 ;i<pos ;i++) {
		del=del.getNext();
		if(del == null) {
			return false;
		}
		Node preNode= del.getPrev();
		Node nextNode= del.getNext();
	preNode.setNext(nextNode);
	if(nextNode != null) {
		nextNode.setPrev(preNode);
	}
	}
	return true;
}

//count
public int count() {
    Node temp = head;
    int count = 0;
    while (temp != null) {
        count++; 
        temp = temp.getNext(); 
    }
    return count;
}

//remove duplicates
public void removeDuplicates() {
	if(head == null) {
		return ;
	}
	Node c=head;
	while(c!=null) {
		Node r=c.getNext();
		while(r!=null) {
			if(r.getData() == c.getData()) {
				Node nextNode=r.getNext();
				if(nextNode !=null) {
					nextNode.setPrev(r.getPrev());
				}
				r.getPrev().setNext(nextNode);
				r=nextNode;
			}
			else {
				r=r.getNext();
			}
		}
		c=c.getNext();
	}
}

//sort asc
public void sortAsc() {
	if(head == null || head.getNext() ==null) {
		return ;
	}
	Node cur=head;
	while(cur!=null) {
	Node index=cur.getNext();
		while(index !=null) {
			if(cur.getData()> index.getData()) {
				int temp=cur.getData();
				cur.setData(index.getData());
				index.setData(temp);
			}
			index=index.getNext();
		}
		cur=cur.getNext();
	}
}

//desc sort
public void sortDesc() {
	if(head== null ||head.getNext() == null) {
		return ;
	}
	Node cur=head;
	while(cur!=null) {
		Node index=cur.getNext();
		while(index!=null) {
			if(cur.getData() < index.getData()) {
				int temp=cur.getData();
				cur.setData(index.getData());
				index.setData(temp);
			}
			index=index.getNext();
		}
		cur=cur.getNext();
	}
}

//max element
public void max() {
	if(head == null) {
		System.out.println("list is empty ");
		return;
	}
	Node cur=head;
	int maxVal=head.getData();
	while(cur!=null) {
		if(cur.getData() > maxVal) {
			maxVal=cur.getData();
		}
		cur=cur.getNext();
		System.out.println(maxVal);
	}
}


public void reverse() {
    Node prev = null;
    Node current = head;
    Node next = null;
    while (current != null) {
        next = current.getNext(); // Store the next node
        current.setNext(prev);    // Reverse the link
        prev = current;           // Move prev to this node
        current = next;           // Move to the next node
    }
    head = prev; // Update the head to the new first node
}

}