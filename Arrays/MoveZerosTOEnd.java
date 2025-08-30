// Move Zeros - SIMPLE VERSION
// Beginner-friendly explanation

public class MoveZerosTOEnd {
    // Function to move all zeros to the end of the array
    // while maintaining the order of non-zero elements 
    
    public static void moveZeroes(int[] nums) {
        int pos = 0;  // Position where next non-zero should go
        
        // Step 1: Move all non-zeros to front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        
        // Step 2: Fill remaining positions with zeros
        for (int i = pos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        
        System.out.println("Before: [0, 1, 0, 3, 12]");
        moveZeroes(nums);
        System.out.println("After:  [1, 3, 12, 0, 0]");
        
        // Let's do manual dry run
        System.out.println("\n=== DRY RUN ===");
        dryRun();
    }
    
    public static void dryRun() {
        System.out.println("Array: [0, 1, 0, 3, 12]");
        System.out.println("pos = 0 (next position for non-zero)\n");
        
        System.out.println("i=0: nums[0]=0 -> Zero hai, skip karo");
        System.out.println("     pos = 0 (same)");
        System.out.println("     Array: [0, 1, 0, 3, 12]\n");
        
        System.out.println("i=1: nums[1]=1 -> Non-zero hai!");
        System.out.println("     nums[0] = 1 (pos=0 pe rakh do)");
        System.out.println("     pos = 1 (aage badh gaya)");
        System.out.println("     Array: [1, 1, 0, 3, 12]\n");
        
        System.out.println("i=2: nums[2]=0 -> Zero hai, skip karo");
        System.out.println("     pos = 1 (same)");
        System.out.println("     Array: [1, 1, 0, 3, 12]\n");
        
        System.out.println("i=3: nums[3]=3 -> Non-zero hai!");
        System.out.println("     nums[1] = 3 (pos=1 pe rakh do)");
        System.out.println("     pos = 2 (aage badh gaya)");
        System.out.println("     Array: [1, 3, 0, 3, 12]\n");
        
        System.out.println("i=4: nums[4]=12 -> Non-zero hai!");
        System.out.println("     nums[2] = 12 (pos=2 pe rakh do)");
        System.out.println("     pos = 3 (aage badh gaya)");
        System.out.println("     Array: [1, 3, 12, 3, 12]\n");
        
        System.out.println("Step 2: pos=3 se end tak zeros fill karo");
        System.out.println("nums[3] = 0");
        System.out.println("nums[4] = 0");
        System.out.println("Final: [1, 3, 12, 0, 0]");
    }
}