public class Linearsearch {
    public static void main(String[] args) {
        
        // Array (doesn't need to be sorted)
        int[] arr = {25, 10, 80, 30, 50, 90, 15};
        int target = 50;
        
        System.out.println("Array: [25, 10, 80, 30, 50, 90, 15]");
        System.out.println("Looking for: " + target);
        System.out.println();
        
        // Linear Search - check each element one by one
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Step " + (i+1) + ": Check arr[" + i + "] = " + arr[i]);
            
            if (arr[i] == target) {
                System.out.println("✅ FOUND at index " + i);
                return;
            }
            System.out.println("   Not found, continue...");
        }
        
        System.out.println("❌ Not found in array");
    }
}

/*
DRY RUN:
Array: [25, 10, 80, 30, 50, 90, 15]
Target: 50

Step 1: Check arr[0] = 25 → 25 != 50 → Continue
Step 2: Check arr[1] = 10 → 10 != 50 → Continue  
Step 3: Check arr[2] = 80 → 80 != 50 → Continue
Step 4: Check arr[3] = 30 → 30 != 50 → Continue
Step 5: Check arr[4] = 50 → 50 == 50 → FOUND! 

Result: Found at index 4

ALGORITHM:
1. Start from first element
2. Compare with target
3. If match → return index
4. If no match → check next element
5. Repeat until found or end of array

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/