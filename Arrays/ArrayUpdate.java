public class ArrayUpdate {
    public static void main(String[] args) {
        
        // Step 1: Create an array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Step 2: Print original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Step 3: Update element at index 2 (change 30 to 99)
        numbers[2] = 99;
        
        // Step 4: Print updated array
        System.out.println("After update:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Step 5: Update another element (change first element to 5)
        numbers[0] = 5;
        
        // Step 6: Print final array
        System.out.println("Final array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}