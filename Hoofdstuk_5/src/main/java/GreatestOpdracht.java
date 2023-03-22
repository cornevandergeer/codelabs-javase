public class GreatestOpdracht {
    public static void main(String[] args) {

        System.out.println(greatest(10,20));
        System.out.println(greatest("hallo", "wereld"));
        System.out.println(greatest(9,2,10,4,5));

    }

    static int greatest(int a, int b) {
        return (a > b) ? a : b;
    }
    static int greatest(String a, String b) {
        return (a.length() > b.length()) ? a.length() : b.length();
    }
    static int greatest(int... a) {
        int greatestNumber = 0;

        for (int i = 0; i < a.length; i++) {
            greatestNumber = (greatestNumber > a[i]) ? greatestNumber : a[i];
        }

        return greatestNumber;
    }
}

