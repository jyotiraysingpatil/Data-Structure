import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.insert(4);
	l.insert(40);
	l.insert(10);
	Scanner sc=new Scanner(System.in);
	
	int length=l.findLength();
	System.out.println("the length of list is:"+length);
//	while(true) {
//		System.out.println("Enter choice: 1.find length of LL  2.");
//		System.out.println("choice: ");
//		switch(sc.nextInt()) {
//		case 1:
//			
//			int length=l.findLength();
//		System.out.println("the length of list is:"+length);
//			break;
//			
//		case 2:
//			
//			break;
//		}
//	}
//	
}
}
