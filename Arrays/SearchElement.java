public class SearchElement {
    
    // Method to search for an element in array
    public static boolean searchElement(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {    // Check each element
            if (nums[i] == target) {               // Found it?
                return true;                       // Yes, return true
            }
        }
        return false;                             // Not found, return false
    }
    
    // Alternative: Return index instead of boolean
    public static int searchIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {    // Check each element
            if (nums[i] == target) {               // Found it?
                return i;                          // Return the index
            }
        }
        return -1;                                // Not found, return -1
    }
    
    // Test it
    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 9, 2};
        int target = 9;
        
        System.out.println("Array: " + java.util.Arrays.toString(nums));
        System.out.println("Searching for: " + target);
        System.out.println("Found? " + searchElement(nums, target));    // true
        System.out.println("At index: " + searchIndex(nums, target));   // 3
        
        // Test not found case
        target = 5;
        System.out.println("\nSearching for: " + target);
        System.out.println("Found? " + searchElement(nums, target));    // false
        System.out.println("At index: " + searchIndex(nums, target));   // -1
    }
}