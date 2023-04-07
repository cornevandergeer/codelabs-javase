public class FiboInArray {
    public static void main(String[] args) {
        long[] testArray = fiboToArray(93);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }

    public static long[] fiboToArray(int n) {

        long a = 0;
        long b = 1;
        long c = 0;
        long[] fiboArr = new long[n];
        for (int i = 0; i < n; i++) {
            c = a + b;
            fiboArr[i] = c;
            a = b;
            b = c;
        }

        return fiboArr;
    }
}
