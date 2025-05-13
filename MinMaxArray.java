import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input: Elements of the array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize min and max
        int min = array[0];
        int max = array[0];

        // Find min and max
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Output: Minimum and Maximum
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}