
public class Node {
private int data;
private Node next;
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public Node getnext() {
	return next;
}
public void setnext(Node next) {
	this.next = next;
}
public Node(int data) {
	this.data = data;
	next = null;
}
@Override
public String toString() {
	return "Node [data=" + data + "]";
}











}
