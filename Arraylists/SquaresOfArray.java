import java.util.ArrayList;

public class SquaresOfArray {
    public static void main(String[] args) {
        // Input array
        int[] nums = {2, 3, 4, 5};

        // Create an ArrayList to store squares
        ArrayList<Integer> squares = new ArrayList<>();

        // Loop through each element of the array
        for (int i = 0; i < nums.length; i++) {
            int square = nums[i] * nums[i];  // find square
            squares.add(square);             // add to ArrayList
        }

        // Print the ArrayList
        System.out.println("Squares of elements: " + squares);
    }
}
