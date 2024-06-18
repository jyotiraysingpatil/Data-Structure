
public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			head=newNode;
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
			if(temp.getData()== data) {
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
	 
	 public void mergeAlternate(LinkedList l2) {
	        if (l2.getHead() == null) {
	            return; // nothing to merge if l2 is empty
	        }

	        Node c1 = head;
	        Node c2 = l2.head;

	        while (c1 != null && c2 != null) {
	            Node n1 = c1.getNext();
	            Node n2 = c2.getNext();

	            // Make c2's node the next node of c1's current node
	            c1.setNext(c2);
	            c2.setNext(n1);

	            // Move c1 and c2 to their next nodes
	            c1 = n1;
	            c2 = n2;
	        }
	    }

}
