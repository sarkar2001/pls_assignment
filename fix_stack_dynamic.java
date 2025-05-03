public class FixedStackDynamicExample {

    public static void main(String[] args) {
        // Fixed Stack-Dynamic Array
        int[] numbers = new int[5];  // size is fixed at runtime

        // Assign values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;
        }

        // Display the array
        System.out.println("Fixed Stack-Dynamic Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}