
public class Stack<T> {
	private Node<T> top;

    // Constructor to initialize an empty stack
    public Stack() {
        top = null;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to push an element to the top of the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(top);
        top = newNode;
    }

    // Method to peek at the top element of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // or throw exception
        }
        return top.getData();
    }

    // Method to pop the top element from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // or throw exception
        }
        T popData = top.getData();
        top = top.getNext();
        return popData;
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node<T> temp = top;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}