
public class Main {
public static void main(String[] args) {
	CircularLinkedList c=new CircularLinkedList();
	c.insert(1);
	c.insert(50);
	c.insert(64);
	System.out.println("elements of stack are: ");
	c.display();
	c.deleteByVal(1);
	System.out.println("after deleting: ");
	c.display();
	c.deleteByPosition(1, 2);
	System.out.println("after deleting:");
	c.display();
	
}
}
