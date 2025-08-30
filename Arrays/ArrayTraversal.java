public class ArrayTraversal {
    public static void main(String[] args) {
        
        // Step 1: Create an array
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("=== Basic Array Traversal ===");
        System.out.println("Array has " + numbers.length + " elements");
        
        // Step 2: Traverse array using for loop
        System.out.println("\nTraversing array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " contains: " + numbers[i]);
        }
        
        // Step 3: Simple print all elements
        System.out.println("\nAll elements in one line:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // New line
        
        // Step 4: Find sum of all elements
        int sum = 0;
        System.out.println("\nCalculating sum:");
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            System.out.println("Step " + (i + 1) + ": sum = " + sum + " (added " + numbers[i] + ")");
        }
        System.out.println("Total sum: " + sum);
        
        // Step 5: Find the largest element
        int largest = numbers[0]; // Start with first element
        System.out.println("\nFinding largest element:");
        System.out.println("Starting with: " + largest);
        
        for (int i = 1; i < numbers.length; i++) {
            System.out.print("Comparing " + largest + " with " + numbers[i] + " -> ");
            if (numbers[i] > largest) {
                largest = numbers[i];
                System.out.println(numbers[i] + " is larger! New largest: " + largest);
            } else {
                System.out.println(largest + " is still largest");
            }
        }
        System.out.println("Largest element: " + largest);
    }
}