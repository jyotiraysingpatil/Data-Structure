
public class LinkedList {
private Node head;

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}
public LinkedList() {
	head=null;
}

public boolean insert(Product p) {
	Node newNode=new Node(p);
	if(newNode==null) {
		return false;
	}

if(head == null) {
	head=newNode;
	return true;
}

Node temp=head;
while(temp.getNext() != null)
{
if(temp.getProduct() == p)
{
		return false;
}

}
temp.setNext(newNode);
return true;
}

public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.getProduct()+"");
		temp=temp.getNext();
	}
	System.out.println();
}
}