public class Queue<T> {
    private Node<T> front, rear;
    private int size;

    public Queue() {
        front = rear = null;
        this.size = 0;
    }
  
    public Node<T> getFront() {
        return front;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

    public Node<T> getRear() {
        return rear;
    }

    public void setRear(Node<T> rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void insertEnqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + data);
    }

    
    public T removeDequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Dequeued: " + data);
        return data;
    }

    
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.getData();
    }
}