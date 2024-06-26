import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DoubleLinkedList d= new DoubleLinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter choice:  1.insert data by position  2.insert data by val \n"
					+ "3.delete by value   4.delete by position  5.count \n"
					+ "6.remove duplicates  7.sorted in ascending order  8.sorted in descending order \n"
					+ "9.max element   10.min element   11.search element   12.insert at first position\n"
					+ "13.insert at last position   14.insert in middle   15.delete first\n"
					+ "16.delete last  17.delete middle");
			System.out.println("choice : ");
			switch(sc.nextInt()) {
			case 1:
				d.insertByVal(1);
				d.insertByVal(3);
				d.insertByVal(2);
				d.insertByVal(3);
				
		System.out.println("Inserted data by value is : ");
		d.display();
				break;
			case 2:
				d.insert(10, 4);
				d.insert(5, 5);
				d.insert(90, 6);
				System.out.println("Inserted data by position is : ");
				d.display();
			break;
			case 3:
				d.deleteByVal(10);
				System.out.println("deleting value : ");
				d.display();
				break;
			case 4:
				d.deleteByPos(1);
				System.out.println("element deleted by position : ");
				d.display();
				break;
			case 5:
				int count=d.count();
				System.out.println("number of elements are: "+count);			
				break;
			case 6:
				d.removeDuplicates();
				System.out.println("successfully removed duplicates : ");
				d.display();
				break;
			case 7:
				d.sortAsc();
				System.out.println("Elements in ascending order :");
				d.display();
				break;
			case 8:
				d.sortDesc();
				System.out.println("Elements in descending order :"); 
				d.display();
				break;
			case 9:
				d.max();
				break;
			case 10:
				d.min();
				break;
			case 11:
				System.out.println("eneter the value to be search: ");
				int key=sc.nextInt();
				System.out.println("enter the value to be searching  : "+ d.search(key));
				break;
			case 12:
				d.insertFirst(6);
				System.out.println("node added at first position ");
				d.display();
				break;
			case 13:
				d.insertLast(100);
				System.out.println("node added at last position ");
				d.display();
				break;
			case 14:
				d.insertMiddle(5, 2);
				System.out.println("node added at middle position ");
				d.display();
				break;
			case 15:
				d.deleteFirst();
				System.out.println("first element deleted: ");
				d.display();
				break;
			case 16:
				d.deleteLast();
				System.out.println("last element deleted: ");
				d.display();
				break;
			case 17:
				d.deleteMiddle(2);
				System.out.println("delete middle element");
				d.display();
			}		
		}

	}

}
