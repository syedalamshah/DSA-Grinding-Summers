
public class FindLargest {
    
    // Method to find largest element
    public static int findLargest(int[] nums) {
        int largest = nums[0];              // Start with first element
        for (int i = 1; i < nums.length; i++) {  // Check rest
            if (nums[i] > largest) {        // If bigger found
                largest = nums[i];          // Update largest
            }
        }
        return largest;                     // Return result
    }
    
    // Test it
    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 9, 2};
        System.out.println("Largest: " + findLargest(nums));  // Output: 9
    }
}