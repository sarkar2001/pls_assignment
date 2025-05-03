import java.util.Scanner;

public class StackDynamicExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Size is determined at runtime (from user input)
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();

        // Array declared in method (stack), size set dynamically at runtime
        int[] dynamicArray = new int[size];

        // Fill array with values
        for (int i = 0; i < size; i++) {
            dynamicArray[i] = (i + 1) * 2;
        }

        // Display the array
        System.out.println("Stack-Dynamic Array:");
        for (int value : dynamicArray) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}