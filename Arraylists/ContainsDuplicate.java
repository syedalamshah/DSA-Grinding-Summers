import java.util.ArrayList;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                return true; // duplicate found
            }
            list.add(nums[i]); // add number to list
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("Array 1 has duplicate? " + containsDuplicate(nums1));
        System.out.println("Array 2 has duplicate? " + containsDuplicate(nums2));
    }
}
