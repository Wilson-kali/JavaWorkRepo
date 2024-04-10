import javax.swing.JOptionPane;

public class LinkedList {
    
    // Node class to represent each element in the linked list
    class Node1 {
        String data;
        Node1 nex;
        
        public Node1(String data) {
            this.data = data;
            this.nex = null;
        }
    }
    
    private Node1 head; // Head of the linked list
    
    public LinkedList() {
        this.head = null;
    }
    
    // Method to insert a new node at the end of the linked list
    public void insert(String data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
        } else {
            Node1 temp = head;
            while (temp.nex != null) {
                temp = temp.nex;
            }
            temp.nex = newNode;
        }
    }
    
    // Method to delete a node by value from the linked list
    public void delete(String data) {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.nex;
            return;
        }
        Node1 prev = null;
        Node1 curr = head;
        while (curr != null && !curr.data.equals(data)) {
            prev = curr;
            curr = curr.nex;
        }
        if (curr != null) {
            prev.nex = curr.nex;
        }
    }
    
    // Method to search for a value in the linked list
    public boolean search(String data) {
        Node1 temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.nex;
        }
        return false;
    }
    
    // Method to print the elements of the linked list
    public void print() {
        StringBuilder sb = new StringBuilder();
        Node1 temp = head;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.nex;
        }
        JOptionPane.showMessageDialog(null, "Linked List: " + sb.toString());
    }
    
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        
        while (true) {
            String choice = JOptionPane.showInputDialog(
                    "Choose an operation:\n1. Insert\n2. Delete\n3. Search\n4. Print\n5. Exit");
            if (choice == null || choice.equals("5")) {
                break;
            }
            
            switch (choice) {
                case "1":
                    String insertValue = JOptionPane.showInputDialog("Enter a value to insert:");
                    if (insertValue != null) {
                        myList.insert(insertValue);
                        JOptionPane.showMessageDialog(null, insertValue + " inserted into the list.");
                    }
                    break;
                case "2":
                    String deleteValue = JOptionPane.showInputDialog("Enter a value to delete:");
                    if (deleteValue != null) {
                        myList.delete(deleteValue);
                        JOptionPane.showMessageDialog(null, deleteValue + " deleted from the list.");
                    }
                    break;
                case "3":
                    String searchValue = JOptionPane.showInputDialog("Enter a value to search:");
                    if (searchValue != null) {
                        boolean found = myList.search(searchValue);
                        if (found) {
                            JOptionPane.showMessageDialog(null, searchValue + " found in the list.");
                        } else {
                            JOptionPane.showMessageDialog(null, searchValue + " not found in the list.");
                        }
                    }
                    break;
                case "4":
                    myList.print();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
