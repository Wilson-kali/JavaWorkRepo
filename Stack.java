import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    private int top;

    public Stack() {
        stack = new ArrayList<>();
        top = -1; // Initialize top pointer to -1
    }

    // Push an element onto the stack
    public void push(String item) {
        stack.add(item);
        top++;
    }

    // Remove and return the top element from the stack
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String item = stack.remove(top);
        top--;
        return item;
    }

    // Return the top element from the stack without removing it
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(top);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Return the size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        while (true) {
            String choice = JOptionPane.showInputDialog(
                    "Choose an operation:\n" +
                            "1. Push\n" +
                            "2. Pop\n" +
                            "3. Peek\n" +
                            "4. Size\n" +
                            "5. Is Empty\n" +
                            "6. Exit"
            );

            switch (choice) {
                case "1":
                    String valueToPush = JOptionPane.showInputDialog("Enter a string to push onto the stack:");
                    stack.push(valueToPush);
                    break;
                case "2":
                    String poppedValue = stack.pop();
                    if (poppedValue != null) {
                        JOptionPane.showMessageDialog(null, "Popped value: " + poppedValue);
                    } else {
                        JOptionPane.showMessageDialog(null, "Stack is empty. Cannot pop.");
                    }
                    break;
                case "3":
                    String peekedValue = stack.peek();
                    if (peekedValue != null) {
                        JOptionPane.showMessageDialog(null, "Peeked value: " + peekedValue);
                    } else {
                        JOptionPane.showMessageDialog(null, "Stack is empty. Cannot peek.");
                    }
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Size of the stack: " + stack.size());
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Is stack empty? " + stack.isEmpty());
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Exiting program.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please enter a number from 1 to 6.");
            }
        }
    }
}
