public class ArrayDelete {
    public static void main(String[] args) {
        
        // Step 1: Create an array
        int[] numbers = {10, 20, 30, 40, 50};
        int currentSize = 5; // Keep track of how many elements we have
        
        // Step 2: Print original array
        System.out.println("Original array:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Step 3: Delete element at index 2 (which is 30)
        int indexToDelete = 2;
        System.out.println("Deleting element at index " + indexToDelete);
        
        // Step 4: Shift all elements after index 2 to the left
        for (int i = indexToDelete; i < currentSize - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        
        // Step 5: Reduce the size by 1
        currentSize = currentSize - 1;
        
        // Step 6: Print array after deletion
        System.out.println("After deletion:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Step 7: Delete another element (first element, index 0)
        System.out.println("Deleting element at index 0");
        
        // Shift all elements to the left
        for (int i = 0; i < currentSize - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        
        // Reduce size
        currentSize = currentSize - 1;
        
        // Step 8: Print final array
        System.out.println("Final array:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Final size: " + currentSize);
    }
}