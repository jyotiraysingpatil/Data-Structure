import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Scanner sc = new Scanner(System.in); 
        l.insert(6);
        l.insert(4);
        l.insert(80);
        l.insert(1);
        l.insert(1);
        l.insert(6);
        while (true) {
            System.out.println("Enter Choice: 1.Find Middle element  2.Reverse a Linked List  3.duplicate remove from list");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    l.display();
                    l.findMiddleNode();
                    break;

                case 2:
                    l.reverse();
                    System.out.println("Reversed List:");
                    l.display();
                    break;

                case 3:
                   l.removeDuplicateFromUnsortedList();
                   System.out.println("List after removing duplicates: ");
                   l.display();
                break;
               
                case 4:
                	break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
