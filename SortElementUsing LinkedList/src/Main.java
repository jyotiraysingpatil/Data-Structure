
public class Main {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.insert(60);
		l.insert(4);
		l.insert(6);
        l.insert(1);
        System.out.println("Before sorting :");
        l.display();
        l.sort();
        System.out.println("After Sorting :");
        l.display();
	}

}
