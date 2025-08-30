public class BasicBinarySearch {
    public static void main(String[] args) {
        
        // Step 1: Create a SORTED array (very important!)
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 50;  // What we're looking for
        
        System.out.println("=== Binary Search ===");
        System.out.println("Sorted Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Looking for: " + target);
        System.out.println();
        
        // Step 2: Set up pointers
        int left = 0;                    // Start of search range
        int right = numbers.length - 1;  // End of search range
        int step = 1;
        
        // Step 3: Binary search loop
        while (left <= right) {
            // Calculate middle position
            int mid = (left + right) / 2;
            
            System.out.println("Step " + step + ":");
            System.out.println("  Range: left=" + left + ", right=" + right);
            System.out.println("  Middle index: " + mid);
            System.out.println("  Middle value: " + numbers[mid]);
            
            // Check if we found the target
            if (numbers[mid] == target) {
                System.out.println("  ✅ FOUND! Target " + target + " is at index " + mid);
                return; // Exit the program
            }
            
            // If target is smaller, search left half
            else if (target < numbers[mid]) {
                System.out.println("  Target " + target + " < " + numbers[mid] + " → Search LEFT half");
                right = mid - 1;  // Move right pointer left
            }
            
            // If target is larger, search right half  
            else {
                System.out.println("  Target " + target + " > " + numbers[mid] + " → Search RIGHT half");
                left = mid + 1;   // Move left pointer right
            }
            
            System.out.println("  New range: [" + left + " to " + right + "]");
            System.out.println();
            step++;
        }
        
        // If we get here, target was not found
        System.out.println("❌ Target " + target + " not found in array");
    }
}