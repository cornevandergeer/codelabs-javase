public class FactorialOpdracht {

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        int returnValue = num * factorial(num - 1);
        return returnValue;
    }
}