
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

//display
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

	//insert by position
	public boolean insertByPos(int data,int pos) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			head=newNode;
			head.setNext(head);
			return true;
		}
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}
	
	//insert by val
	public boolean insertByVal(int val) {
	    Node newNode = new Node(val);
	    if (newNode == null) {
	        return false;
	    }
	    if (head == null || head.getData() >= newNode.getData()) {
	        newNode.setNext(head);
	        head = newNode;
	        return true;
	    }
	    Node prev = head;
	    while (prev.getNext() != null && prev.getNext().getData() < newNode.getData()) {
	        prev = prev.getNext();
	    }
	    newNode.setNext(prev.getNext());
	    prev.setNext(newNode);
	    return true;
	}

	//delete by position
	public boolean deleteByPos(int pos) {
	    if (head == null || pos <= 0) {
	        return false;
	    }

	    // Deleting the head node (position 1)
	    if (pos == 1) {
	        if (head.getNext() == head) {
	            head = null; // Only one node in the list
	            return true;
	        }
	        Node last = head;
	        while (last.getNext() != head) {
	            last = last.getNext();
	        }
	        head = head.getNext();
	        last.setNext(head);
	        return true;
	    }

	    Node prev = head;
	    for (int i = 1; i < pos - 1; i++) {
	        prev = prev.getNext();
	        if (prev.getNext() == head) {
	            return false; // Position is out of bounds
	        }
	    }
	    Node del = prev.getNext();
	    prev.setNext(del.getNext());
	    return true;
	}

	//delete by value
	public boolean deleteByVal(int data, int pos) {
	    if (head == null || pos <= 0) {
	        return false;
	    }
	    
	    Node current = head;
	    Node prev = null;

	    if (pos == 1) {
	        if (head.getNext() == head) {
	            head = null;
	            return true;
	        }
	        Node last = head;
	        while (last.getNext() != head) {
	            last = last.getNext();
	        }

	        last.setNext(head.getNext());
	        head = head.getNext();
	        return true;
	    }
	    for (int i = 1; i < pos - 1; i++) {
	        current = current.getNext();
	        if (current == head) {
	            return false; 
	        }
	    }
	    
	    Node del = current.getNext();
	    if (del == head) {
	        return false; 
	    }  
	    current.setNext(del.getNext());
	    return true;
	}

	//count of elements
	public int count() {
	    if (head == null) {
	        return 0;
	    }
	    int count = 0;
	    Node c = head;
	    do {
	        count++;
	        c = c.getNext();
	    } while (c != head);
	    return count;
	}

	//remove duplicates
	public void removeDuplicates() {
		if(head == null) {
			return ;
		}
		Node c=head;
do {
	Node r=c;
	while(r.getNext()!=head) {
		if(r.getNext().getData() == c.getData()) {
			r.setNext(r.getNext().getNext());
		}
		else {
			r=r.getNext();
		}
	}
	c=c.getNext();
}while(c!=head);
}	

	//sort in asc.
	public void sort() {
		if(head == null || head.getNext() == head) {
			return;
		}
		Node cur=head;
		Node index;
		int temp;
		do {
			index=cur.getNext();
			while(index!=head) {
				if(cur.getData() >index.getData()) {
					temp=cur.getData();
					cur.setData(index.getData());
					index.setData(temp);
				
				}
				index=index.getNext();
			}
			cur=cur.getNext();
			
		}while(cur!=head);
	}
	
	//sort list in desc.
	public void sortDesc() {
		if(head==null || head.getNext()== head) {
			return;
		}
		Node cur=head;
		Node index;
		int temp;
		do {
			index=cur.getNext();
			while(index!=head) {
				if(cur.getData() < index.getData()) {
					temp=cur.getData();
					cur.setData(index.getData());
					index.setData(temp);			
				}
				index=index.getNext();
			}
			cur=cur.getNext();
		}while(cur !=head);
	}
	
	//min ele.
	public void min() {
		if(head == null) {
			System.out.println("list is empty ");
			return;
		}
		Node cur=head;
		int minval=head.getData();
		do {
			if(cur.getData() < minval) {
				minval=cur.getData();
			}
			cur=cur.getNext();		
		}while(cur !=head);
		System.out.println(minval);
	}
	
	//max ele.
	public void max() {
		if(head==null) {
			System.out.println("list is empty ");
			return;
		}
		Node cur=head;
		int maxval=head.getData();
		do {
			if(cur.getData()> maxval) {
				maxval=cur.getData();
			}
			cur=cur.getNext();
		}while(cur!=head);
		System.out.println(maxval);
	}
	
	public boolean search(int key) {
	    if (head == null) {
	        return false; 
	    }
	    Node temp = head;

	    do {
	        if (temp.getData() == key) {
	            return true; 
	        }
	        temp = temp.getNext();
	    } while (temp != head);

	    return false; 
	}

	//delete at first pos
	public void deleteFirst() {
		if(head == null) {
			return;
		}
		if(head.getNext() == head) {
			head =null;
		}
		else {
			Node last=head;
			while(last.getNext() !=head) {
				last=last.getNext();
			}
			last.setNext(head.getNext());
			head=head.getNext();
		}
	}
	
	//delete last node
	public void deleteLast() {
		if(head==null) {
			return;
		}
		if(head.getNext() == null) {
			head =null;
		}
		else {
			Node last=head;
			Node prev=null;
			while(last.getNext() !=head) {
				prev=last;
				last=last.getNext();
			}
			prev.setNext(head);	
		}
	}
	
	//delete middle ele
	public void deleteMiddle() {
		if(head == null || head.getNext() == head) {
			return;
		}
		Node slow=head;
		Node fast=head;
		Node prev=null;
		while(fast.getNext() != head && fast.getNext().getNext() !=head) {
			prev=slow;
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			
		}
		if(prev == null) {
			head=head.getNext();
		}
		else {
			prev.setNext(slow.getNext());
		}
	}
	
	
	public void reverse() {
	    Node prev = null;
	    Node current = head;
	    Node next = null;
	 do {
	        next = current.getNext(); // Store the next node
	        current.setNext(prev);    // Reverse the link
	        prev = current;           // Move prev to this node
	        current = next;           // Move to the next node
	    }while(current!=head);
	    head = prev; // Update the head to the new first node
	}
	
	
	
	}
