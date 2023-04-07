import java.util.Scanner;

public class ElevenProof {
    public static void main(String[] args) {
        // Verkrijgen van een account nummer die precies 9 nummers moet bevatten
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        String accountNumberString = scan.nextLine();
        while (accountNumberString.length() != 9) {
            System.out.println("Invalid number, must be 9 digits: ");
            accountNumberString = scan.nextLine();
        }
        scan.close();

        // omzetten van string naar een array van char's
        char[] accountNumberStringArray = accountNumberString.toCharArray();
        int sum = 0;

        // loopen over de array van chars
        for (int i = 0; i < accountNumberStringArray.length; i++) {
            // char omzetten naar een int
            int a = Integer.parseInt(String.valueOf(accountNumberStringArray[i]));
            // de som uitrekenen
            sum += (a*(accountNumberStringArray.length-i));

        }
        System.out.println("de som is: " + sum);
        System.out.println("de restwaarde bij % 11 is: " + sum % 11);

        if (sum % 11 != 0) {
            throw new IllegalArgumentException("number is not valid");
        }


    }
}
