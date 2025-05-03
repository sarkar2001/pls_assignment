public class FixedHeapDynamicExample {

    public static void main(String[] args) {
        // Fixed-size array allocated on the heap
        Integer[] fixedHeapArray = new Integer[4]; // allocated with 'new'

        // Assign values
        for (int i = 0; i < fixedHeapArray.length; i++) {
            fixedHeapArray[i] = (i + 1) * 100;
        }

        // Display the array
        System.out.println("Fixed Heap-Dynamic Array:");
        for (Integer value : fixedHeapArray) {
            System.out.print(value + " ");
        }
    }
}
