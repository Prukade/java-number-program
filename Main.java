import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept 3 numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest and largest numbers
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Calculate the sum
        int sum = smallest + largest;

        // Display the result
        System.out.println("Sum of the smallest and largest numbers: " + sum);
    }
}
