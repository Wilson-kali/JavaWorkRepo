import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Queue {
    int front;
    int rear;
    int size;
    int capacity;
    ArrayList<String> array;

    public Queue(int capacity) {
        front = 0;
        rear = -1;
        size = 0;
        array = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object front() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "The Queue is Empty");
            return null;
        }
        return array.get(front);
    }

    public Object rear() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "The Queue is Empty");
            return null;
        }
        return array.get(rear);
    }

    public String dequeue() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "The Queue is Empty, cannot dequeue");
            return null;
        }
        String item = array.remove(front);
        rear = (rear - 1 + capacity) % capacity; // Fixing rear calculation
        size--;
        return item;
    }

    public void enqueue(String item) {
        if (size() == capacity) {
            JOptionPane.showMessageDialog(null, "The Queue is full, cannot add");
            return;
        }
        rear = (rear + 1) % capacity;
        array.add(rear, item); // Inserting at rear index
        size++;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the Capacity of the queue:");
        int capacity = Integer.parseInt(input);
        Queue array = new Queue(capacity);

        while (true) {
            String choice = JOptionPane.showInputDialog("Choose an Option:\n"
                    + "1.Enqueue\n"
                    + "2.Dequeue\n"
                    + "3.Front\n"
                    + "4.Rear\n"
                    + "5.IsEmpty\n"
                    + "6.Size\n"
                    + "7.Exit");

            switch (choice) {
                case "1":
                    String valueEnqueued = JOptionPane.showInputDialog("Enter Object to Enqueue:");
                    array.enqueue(valueEnqueued);
                    JOptionPane.showMessageDialog(null, "Enqueued Successfully: " + valueEnqueued);
                    break;
                case "2":
                    String dequeuedValue = array.dequeue();
                    if (dequeuedValue != null) {
                        JOptionPane.showMessageDialog(null, "Dequeued: " + dequeuedValue);
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "The Front Object is: " + array.front());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "The Rear Object is: " + array.rear());
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Is the queue Empty? " + array.isEmpty());
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "The size of the Queue is: " + array.size());
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Exiting Program...");
                    System.exit(0);
            }
        }
    }
}
