public class Main{
public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(20);
        l.insert(1);
        l.insert(60);
        l.insert(5);
        l.display(); // Output: 20 1 60 5 
        l.addFirst(0);
        l.display(); // Output: 0 20 1 60 5 
        l.addLast(100);
        l.display(); // Output: 0 20 1 60 5 100 
        l.insert(60, 1);
        l.display(); // Output: 60 0 20 1 60 5 100 
        l.insert(70, 4);
        l.display(); // Output: 60 0 20 70 1 60 5 100 
        boolean isInserted = l.insert(30, 2);
        System.out.println(isInserted); // Output: true 
        l.display(); // Output: 60 30 0 20 70 1 60 5 100 
        l.displayReverse(l.getHead());
        System.out.println(); // Output: 100 5 60 1 70 20 0 30 60 
    }
}
