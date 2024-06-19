public class LinkedList {
    private Node head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }

        if (head == null) {
            head = newNode;
            count++;
            return true;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() == data) {
                return false; // If duplicate checking is necessary
            }
            temp = temp.getNext();
        }

        temp.setNext(newNode);
        count++;
        return true;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    //find middle element
    public void findMiddleNode() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        int mid = count / 2;
        for (int i = 0; i < mid; i++) {
            temp = temp.getNext();
        }
        System.out.println("The middle element is: " + temp.getData());
    }
    
    //reverse Linked List
    public void reverse() {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node n1=head;
        Node n2=head.getNext();
        while(n2!=null) {
        	Node n3=n2.getNext();
        	n2.setNext(n1);
        	n1=n2;
        	n2=n3;
        }
        head.setNext(null);
        head=n1;
    }
    
    //duplicate removed from unsorted Linked List
    public void removeDuplicateFromUnsortedList() {
    	Node c=head;
    	while(c!=null) {
    		Node r=c;
    		while(r.getNext()!=null) {
    			if(r.getNext().getData()==c.getData()) {
    				r.setNext(r.getNext().getNext());
    				count--;
    				
    			}else {
    				r=r.getNext();
    			}
    			c=c.getNext();
    		}
    	}
    	
    }
    }
