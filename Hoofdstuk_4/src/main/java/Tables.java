public class Tables {
    public static void main(String[] args) {
        printTablesTillTableOf(20);
    }

    public static void printTableOf(int n) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + " x " + n + " = " + (n * i));
        }
        System.out.println("-------------");

    }

    public static void printTablesTillTableOf(int tablesTill) {

        for (int i = 1; i <= tablesTill ; i++) {
            printTableOf(i);
        }
    }
}
