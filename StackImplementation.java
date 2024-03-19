import java.util.*;

public class StackImplementation {
    private ArrayList<Integer> stack;

    public StackImplementation() {
        stack = new ArrayList<>();
    }

    // Push operation to add an element to the top of the stack
    public void push(int element) {
        stack.add(element);
    }

    // Pop operation to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek operation to return the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Size operation to return the number of elements in the stack
    public int size() {
        return stack.size();
    }

    // isEmpty operation to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Size of the stack: " + stack.size());

        stack.pop();
        System.out.println("After popping, top element of the stack: " + stack.peek());
        System.out.println("Size of the stack: " + stack.size());
    }
}
