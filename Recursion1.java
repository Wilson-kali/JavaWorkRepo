import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        printVertical(number);
        scanner.close();
    }

    public static void printVertical(int n) {
        // Base case: when n becomes 0
        if (n == 0) {
            return;
        }
        System.out.println(n % 10);
        // Recursive call to printVertical with n/10 to move to the next digit
        printVertical(n / 10);
        // Print the last digit of n
        
    }
}
