
public class DoubleLinkedList {
	private Node head;
private Node prev;



	public Node getPrev() {
	return prev;
}

public void setPrev(Node prev) {
	this.prev = prev;
}

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
		if(head == null || pos<=0) {
			return false;
		}
		if(pos == 1) {
			head=head.getNext();
			if(head !=null) {
				head.setPrev(null);
			}
			return true;
		}
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
			
		}System.out.println(maxVal);
	}

	//min element
	public void min() {
		if(head==null) {
			System.out.println("list is empty ");
			return;
		}
		Node cur=head;
		int minVal=head.getData();
		while(cur!=null) {
			if(cur.getData() < minVal) {
				minVal=cur.getData();
			}
			cur=cur.getNext();
		}
		System.out.println(minVal);
	}
	
	//search elem
	public boolean search(int key) {
		Node temp=head;
		if(temp.getData() == key) {
			return true;
		}
		temp=temp.getNext();
		return false;
	}
	
	//insert at first pos
	public void insertFirst(int data) {
		Node newNode=new Node(data);
		newNode.setNext(head);
		head.setPrev(newNode);
		head=newNode;
	}
	
	//insert at last pos
	public void insertLast(int data) {
		Node newNode=new Node(data);
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
	}
	
	//insert at middle
	public void insertMiddle(int data, int pos) {
	    Node newNode = new Node(data);
	    if (pos == 1) {
	        if (head != null) {
	            newNode.setNext(head);
	            head.setPrev(newNode);
	        }
	        head = newNode;
	        return;
	    }
	    
	    Node current = head;
	    int count = 1;
	   
	    while (current != null && count < pos - 1) {
	        current = current.getNext();
	        count++;
	    }
	    
	    if (current == null) {
	        System.out.println("Invalid position");
	        return;
	    }
	    newNode.setNext(current.getNext());
	    newNode.setPrev(current);
	    if (current.getNext() != null) {
	        current.getNext().setPrev(newNode);
	    }
	    current.setNext(newNode);
	}

	//delete first node
	public void deleteFirst() {
		Node tail=head;
	    if (head == null) {
	        return; 
	    }
	    
	    head = head.getNext(); 
	    
	    if (head != null) {
	        head.setPrev(null);
	    } else {
	        tail = null; 
	    }
	}
	
	//delete last node
	public void deleteLast() {
		if (head == null) {
	        return; 
	    }
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		if(last.getPrev()!=null) {
			last.getPrev().setNext(null);
		}
		else {
			head=null;
		}
	}
	
	//delete middle element
	public void deleteMiddle(int pos) {
		 if (head == null) {
		        return; 
		    }
		 Node temp=head;
		 int count=1;
		 while(temp!=null && count<pos) {
			 temp=temp.getNext();
			 count ++;
			 if(temp.getPrev()!=null) {
				 temp.getPrev().setNext(temp.getNext());
			 }
			 else {
				 head=temp.getNext();
			 }
			 if(temp.getNext()!=null) {
				 temp.getNext().setPrev(temp.getPrev());
			 }
			
		 }
	}
	

}
