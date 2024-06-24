public class Main {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(1);
        l.insert(60);
        l.insert(8);
        l.insert(45);
        l.insert(17);

        System.out.println("Elements of the list are:");
        l.display();

        Node middleNode = l.findMiddleInOnePass(l.getHead());
        if (middleNode != null) {
            System.out.println("The middle element of the list is: " + middleNode.getData());
        } else {
            System.out.println("The list is empty.");
        }
    }
}
