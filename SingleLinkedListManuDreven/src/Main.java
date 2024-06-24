import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter Choice:  1.Insert   2.delete the First element   3.delete the last element "
					+ " 4.delete the specific element by postion");
System.out.println("choice: ");	
switch(sc.nextInt()) {
case 1:
	l.insert(5);
	l.insert(1);
	l.insert(60);
	l.insert(40);
	l.insert(67);
	l.insert(70);
	l.insert(8);
	System.out.println("elements are: ");
	l.display();
	break;
case 2:
	l.deleteFirst();
	System.out.println("after deleting first element: ");
	l.display();
	break;
case 3:
	l.deleteLastElement();
	System.out.println("after deleting last element: ");
	l.display();
	break;
case 4:
	l.deleteByPosition(2);
	System.out.println("after deleting :");
	l.display();
	break;
}
			
			
			
			
			
			
		}

	}

}
