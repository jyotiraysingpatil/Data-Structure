
public class Main {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insert(8);
		l1.insert(4);
		l1.insert(50);
		l1.insert(6);
	
		
		LinkedList l2=new LinkedList();
		l2.insert(60);
		l2.insert(17);
		l2.insert(3);
		System.out.println("List 1: ");
		l1.display();
		System.out.println("List 2: ");
		l2.display();
		System.out.println("after merging: ");
		l1.mergeAlternate(l2);
		l1.display();

	}

}
