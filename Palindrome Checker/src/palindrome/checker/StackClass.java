package palindrome.checker;

public class StackClass {
    private final char[] stack;
    private int top;

    public StackClass(int capacity) {
        stack = new char[capacity];
        top = -1;
    }

    public void push(char c) {
        if (top == stack.length - 1) {
            
        } else {
            top++;
            stack[top] = c;
        }
    }

    public char pop() {
        if (isEmpty()) {
            
            return '\0'; 
        } else {
            char poppedElement = stack[top];
            top--;
            return poppedElement;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
