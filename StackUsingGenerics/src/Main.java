
public class Main {
public static void main(String[] args) {
	
	  Stack<Integer> intStack = new Stack<>();
      intStack.push(10);
      intStack.push(20);
      intStack.push(30);

      System.out.println("Integer Stack elements:");
      intStack.display();

      System.out.println("Top element is: " + intStack.peek());

      System.out.println("Popped element is: " + intStack.pop());
      System.out.println("Stack elements after pop:");
      intStack.display();

      Stack<String> stringStack = new Stack<>();
      stringStack.push("Hello");
      stringStack.push("World");

      System.out.println("String Stack elements:");
      stringStack.display();

      System.out.println("Top element is: " + stringStack.peek());
      System.out.println("Popped element is: " + stringStack.pop());
      System.out.println("Stack elements after pop:");
      stringStack.display();
  }
}
