import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oddNumber;
        int tries = 0;
        do {
        System.out.println("Please give me an odd number: ");
        oddNumber = scan.nextInt();
        tries ++;

        if (tries == 3) {
            System.out.println("Game over!");
            System.exit(1);
        }

        }
        while (oddNumber % 2 == 0);

        printHourglass(oddNumber);
    }
    static void printHourglass(int n) {
        String star = "*";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                String line = "";
                if (i == 1 || i == n) {
                    line += star;
                    System.out.print(line);
                }
                else {
                    if (i == j || n - (i - 1) == j) {
                        line += star;
                    } else {
                        line += " ";
                    }
                    System.out.print(line);
                }
            }
            System.out.println();
        }
    }
}
