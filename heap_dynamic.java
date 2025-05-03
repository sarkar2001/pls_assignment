import java.util.ArrayList;

public class HeapDynamicExample {

    public static void main(String[] args) {
        // Heap-Dynamic: uses ArrayList, size can grow or shrink
        ArrayList<Integer> dynamicList = new ArrayList<>();

        // Add elements at runtime
        dynamicList.add(10);
        dynamicList.add(20);
        dynamicList.add(30);
        dynamicList.add(40);

        // Modify contents
        dynamicList.remove(1);  // removes value at index 1 (20)
        dynamicList.add(50);

        // Display the dynamic list
        System.out.println("Heap-Dynamic Array:");
        for (Integer value : dynamicList) {
            System.out.print(value + " ");
        }
    }
}
