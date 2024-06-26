import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList c=new CircularLinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter choice: 1. insert by pos  2.insert by val   3.delete by pos "
					+ " 4.delete by value   5.count of element  6.Remove Duplicates \n"
					+ "7.sort list in ascending order  8.sort list in descending order \n "
					+ "9.Minimum element from the list   10.Maximum element from the list  11.Search element \n"
					+ "12. delete first node  13.delete last node  14.delete middle node \n"
					+ "15.");
		System.out.println("choice : ");
		switch(sc.nextInt()) {
		case 1:
		c.insertByPos(1, 1);
		c.insertByPos(6, 3);
		c.insertByPos(50, 2);
		System.out.println("after adding element to specific position: ");
		c.display();
	break;
		case 2:
			c.insertByVal(50);
			c.insertByVal(44);
			System.out.println("after adding element by value : ");
			c.display();
	break;
		case 3:
			c.deleteByPos( 3);
			System.out.println("after deleteting by pos : ");
			c.display();
	break;
	case 4:
		c.deleteByVal(60, 3);
		System.out.println("after deleting by value: ");
		c.display();
		break;
	case 5:
		int count=c.count();
		System.out.println(" total elements in list are : "+count);
		break;
	case 6:
		c.removeDuplicates();
		System.out.println("aftter removing duplicate elements from list: ");
		c.display();
		break;
	case 7:
		c.sort();
		System.out.println("list sorted in ascending order :");
		c.display();
		break;
	case 8:
		c.sortDesc();
		System.out.println("list sorted in descending order :");
		c.display();
		break;
	case 9:
		System.out.println("minimum element from list is : ");
		c.min();
	
		break;
	case 10:
		System.out.println("maximum element from list is : ");
		c.max();
		break;
	case 11:
		System.out.println("eneter the value to be search: ");
		int key=sc.nextInt();
		System.out.println("enter the value to be searching  : "+ c.search(key));
		break;
	case 12:
		c.deleteFirst();
		System.out.println("after deleting the first node  : ");
		c.display();
		break;
	case 13:
		c.deleteLast();
		System.out.println("after deleting the last node  : ");
		c.display();
		break;
	case 14:
		c.deleteMiddle();
		System.out.println("after deleting the Middle  node  : ");
		c.display();
		break;
		
		}
	}
	}

}
