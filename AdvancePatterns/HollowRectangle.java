
public class HollowRectangle {

    public static void main(String[] args) {
        int rows = 10; // assuming 'a' was meant to represent the number of rows
        int columns = 20; // assuming 'totCol' was meant to represent the number of columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Print '*' for the first or last row, or for the first or last column
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for the inner part of the rectangle
                }
            }
            System.out.println(); // Newline after each row
        }
    }
}
