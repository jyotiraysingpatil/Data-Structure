
public class Main {

	public static void main(String[] args) {
	    LinkedList list = new LinkedList();

	    // Insert some elements
	    list.insert(1);
	    list.insert(2);
	    list.insert(4);
	    list.insert(5);

	    // Display current list
	    System.out.println("Current List:");
	    list.display();

	    // Insert in the middle
	    list.insertMiddle(3);

	    // Display updated list
	    System.out.println("List after inserting 3 in the middle:");
	    list.display();
	}

}
