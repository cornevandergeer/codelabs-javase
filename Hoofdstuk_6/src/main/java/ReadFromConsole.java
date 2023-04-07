import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please give me 10 numbers: ");
        String numbers = scan.nextLine();
        System.out.println("The numbers are: " + numbers);
        String[] numbersArray = numbers.split(" ");
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum += Integer.parseInt(numbersArray[i]);
        }
        System.out.println("the sum is: " + sum);

    }
}
