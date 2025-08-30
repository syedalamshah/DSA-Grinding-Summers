import java.util.Scanner;

public class MatrixBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input: Matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // 2. Declare 2D array
        int[][] matrix = new int[rows][cols];

        // 3. Input: Elements of the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // 4. Print the matrix
        System.out.println("\nThe 2D Array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

        // 5. Calculate sum of all elements
        int totalSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                totalSum += matrix[i][j];
            }
        }
        System.out.println("\nSum of all elements: " + totalSum);

        sc.close();
    }
}
