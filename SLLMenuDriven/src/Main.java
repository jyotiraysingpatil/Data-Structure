import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter choice: 1.insert   2.insert using position   3.insert using value"
				+ "4.delete by position   5.delete by val  6.count of elements   7.remove duplicates"
				+ "8.search element by value   9.sort the List in ascending order   10.sort the List in descending order "
				+ "11.Max element from list   12.Min element from list");
		System.out.println("choice: ");
		switch(sc.nextInt()) {
		case 1:
			l.insert(4);
			l.insert(6);
			l.insert(4);
			l.insertAtFirstPos(2, 3);
			System.out.println("data inserted first position: ");
			l.display();
		case 2:
			l.insertAtSpecificPos(50,2);
			System.out.println("data inserted at specific position: ");
			l.display();
			break;
		case 3:
			l.insertAtSpecificPosByVal(53);
			System.out.println("data inserted by value :");
			l.display();
			break;
			
		case 4:
			l.deleteByPos(0);
			System.out.println("delete element by position : ");
			l.display();
			break;
		case 5:
			l.deleteByVal(4);
			System.out.println("delete element by value: ");
			l.display();
			break;
		case 6:
			int count=l.count();
			System.out.println("No. of elements in list are : "+count);
			break;
		case 7:	
			l.removeDuplicates();
			System.out.println("after removing duplicates : ");
			l.display();
		break;
		case 8:
			
			break;
		case 9:
			l.sort();
			System.out.println("sorted data in ascending order:  ");
			l.display();
			break;
		case 10:
			l.sortDesc();
			System.out.println("sorted data in descending order: ");
			l.display();
			break;
		case 11:
			l.max();
			
			break;
		case 12:
			l.min();
			break;
		}	
	}

	}

}
