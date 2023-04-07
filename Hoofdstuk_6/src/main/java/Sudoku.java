import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudokuGrid = new int[3][3];
        int[] allRandomNumbers = new int[9];

        for (int i = 0; i < allRandomNumbers.length; i++) {
            if (i == 0) {
                allRandomNumbers[i] = randomNumber();
                continue;
            }
            allRandomNumbers[i] = randomNumber();

            for (int j = 0; j < allRandomNumbers.length; j++) {
                if (allRandomNumbers[i] == allRandomNumbers[j] && i != j) {
                    allRandomNumbers[i] = randomNumber();
                    i--;
                    break;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < sudokuGrid.length; i++) {
            for (int j = 0; j < sudokuGrid.length; j++) {
                sudokuGrid[i][j] = allRandomNumbers[counter];
                counter++;
            }
        }

        for (int i = 0; i < sudokuGrid.length; i++) {
            System.out.println(Arrays.toString(sudokuGrid[i]));
        }
    }

    public static int randomNumber() {
        return (int) Math.floor(Math.random() * 9) + 1;
    }
}
