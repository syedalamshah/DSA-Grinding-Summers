public class RemoveDuplicatesEasy {
    public static int removeDuplicates(int[] nums) {
        // Agar array empty hai
        if (nums.length == 0) return 0;

        int write = 1; // 0 index pe pehla unique element already hai

        // Dusre element se check karna start
        for (int read = 1; read < nums.length; read++) {
            // Agar current element previous se alag hai
            if (nums[read] != nums[read - 1]) {
                nums[write] = nums[read]; // unique element ko write karo
                write++; // next position ke liye aage badho
            }
        }

        return write; // kitne unique elements mile
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(nums);

        System.out.println("Unique elements count: " + k);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
