
public class LinkedList {
private Node head;

public LinkedList() {

	this.head =null;
}

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}
public boolean insert(int data) {
	Node newNode=new Node(data);
	if(newNode == null ) {
		return false;
	}
	if(head== null) {
		head=newNode;
		return true;
	}
	Node temp=head;
	while(temp.getNext()!=null){
	temp=temp.getNext();
	if(temp.getData() == data) {
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

public void sort() {
	if(head == null || head.getNext()==null){
		return ;
	}
	
	Node cur=head;
	while(cur!=null) {
	Node index=cur.getNext();
	while(index!=null) {
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
	
	
	
}






