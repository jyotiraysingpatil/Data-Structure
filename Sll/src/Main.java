import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter choice:1. insert by val  2.insert by pos  3.display  4.insert at fist pos  \n"
					+ "5.insert at last   6.insert at middle  7.delete by pos  8.delete by val \n"
					+ "9.delete first  10.delete last  11.delete middle");
			System.out.println("choice: ");
			switch(sc.nextInt()) {
			case 1:
				l.insert(1);
				l.insert(3);
				System.out.println("data inserted by val");
				l.display();
				break;
			case 2:
				l.insertByPos(50, 3);
				l.insertByPos(60, 4);
				System.out.println("data insert by pos: ");
				l.display();
				break;
			case 3:
			l.display();
			break;
			case 4:
				l.addFirst(0);
				System.out.println("node added at first position : ");
				l.display();
				break;
			case 5:
				l.addLast(100);
				System.out.println("node added at last position : ");
				l.display();
				break;
			case 6:
				l.addMiddle(50, 5);
			System.out.println("node added at middle : ");
			l.display();
			case 7:
				l.deleteByPos(4);
				System.out.println("after deleting elemnt by pos : ");
				l.display();
				break;
			case 8:
				l.deleteByVal(50);
				System.out.println("after deleting element by val : ");
				l.display();
				break;
			case 9:
				l.deleteFirst();
				System.out.println("after deleting first element : ");
				l.display();
				break;
			case 10: 
				l.deleteLast();
				System.out.println("after deleting last element : ");
				l.display();
				break;
			case 11:
				l.deleteMiddle();
				System.out.println("after deleting middle  element : ");
				l.display();
				break;
			}	
			
		}

	}

}
