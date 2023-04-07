public class Fibo {
    public static void main(String[] args) {

        System.out.print("the golden ratio is: ");
        System.out.println(goldenratio(10));

        System.out.println(run(10));
        System.out.println(run(4, 6));
        System.out.println(run(4, 5, 6));
    }

    private static double goldenratio(int i) {
        double a = run(i);
        double b = run(i - 1);
        return a / b;
    }

    static int fiboAlgoritme(int a, int b, int n) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print((a + b) + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
        System.out.print("return value is: ");
        return c;
    }

    static int run(int n) {
        int a = 0;
        int b = 1;
        n--;
        System.out.print(b + " ");
        return fiboAlgoritme(a, b, n);

    }

    static int run(int start, int n) {
        int a = 0;
        n--;
        System.out.print(start + " ");
        return fiboAlgoritme(a, start, n);
    }

    static int run(int f1, int f2, int n) {
        n = n - 2;
        System.out.print(f1 + " " + f2 + " ");
        return fiboAlgoritme(f1, f2, n);
    }
}
