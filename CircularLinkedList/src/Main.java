
public class Main {
public static void main(String[] args) {
CircularLinkedList q= new CircularLinkedList();	
	
	q.insert(5);
	q.insert(90);
	q.insert(6);	
	q.insert(6);
	System.out.println("elemets are: ");
	q.display();
	q.insertLast(1);
	System.out.println("After adding node at last position: ");
	q.display();
	q.insertFirst(100);
	System.out.println("After adding node at first position: ");
	q.display();
	q.insert(30, 3);
	System.out.println("after adding element at position 3");
	q.display();
}
}
