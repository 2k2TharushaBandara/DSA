package palindrome.checker;

public class QueueClass {
    private final char[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueClass(int capacity) {
        queue = new char[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(char c) {
        if (size == queue.length) {
            
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = c;
            size++;
        }
    }

    public char dequeue() {
        if (isEmpty()) {
            
            System.out.println("Queue is empty");
            return '\0'; 
        } else {
            char dequeuedElement = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return dequeuedElement;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
