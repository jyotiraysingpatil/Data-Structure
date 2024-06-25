import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedList d= new DoubleLinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter choice:  1.insert data by position  2.insert data by val \n"
					+ "3.delete by position   4.delete by value  ");
			System.out.println("choice : ");
			switch(sc.nextInt()) {
			case 1:
				//d.insert(1);
				//d.insert(65);
			//	System.out.println("added data using insert : ");
			//d.display();
			d.insert(10,1);	
			d.insert(7, 2);
			d.insert(8, 3);
			d.insert(50, 4);
			d.insert(5, 5);
			System.out.println("data added using postion : ");
			d.display();
			d.in(0);
			d.display();
			
				break;
			
			
			
			
			
			
			}		
		}

	}

}
