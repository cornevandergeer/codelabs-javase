import java.sql.Array;

public class VragenOpdrachten {
    public static void main(String[] args) {
        long[] row = {1, 2, 3, 4};
        long[] row2 = new long[row.length * 2];

        for (int i = 0; i < row.length; i++) {
            row2[i] = row[i];
        }
        long[] testRow = {4, 5, 10, 20};
        multiply(testRow, 4);
    }

    public static void multiply(long[] input, int multiplier) {
        for (int i = 0; i < input.length; i++) {
            input[i] *= multiplier;
            System.out.println(input[i]);
        }
    }
}
