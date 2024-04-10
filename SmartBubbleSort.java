import javax.swing.JOptionPane;

public class SmartBubbleSort {
    public static void main(String[] args) {
        // Get array size from user input
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));

        // Initialize array
        int[] arr = new int[size];

        // Get array elements from user input
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter element " + (i + 1) + ":"));
        }

        // Print original array
        JOptionPane.showMessageDialog(null, "Original array:\n" + arrayToString(arr));

        // Sort array using smart bubble sort
        smartBubbleSort(arr);

        // Print sorted array
        JOptionPane.showMessageDialog(null, "Sorted array:\n" + arrayToString(arr));
    }

    // Method to perform smart bubble sort
    public static void smartBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = true;

        for (int i = 0; i < n - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    // Method to convert array to string for printing
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}
