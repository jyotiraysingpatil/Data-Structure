
public class Node {
private int data;
private Node next;
private int count;
public int key;



public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public int getKey() {
	return key;
}
public void setKey(int key) {
	this.key = key;
}
public Node(int data) {
	super();
	this.data = data;
}
public Node(int data,int count) {

	this.data = data;
			this.count = count;
	next = null;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}


}
