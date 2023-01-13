public class Main {

    public static void main(String[] args) {

        Main m = new Main();

        for (int i = 0; i < 20; i++) {
            System.out.println(m.faktorialFor(i) + " : " + m.faktorialRekursi(i));
        }

        System.out.println();

        for (int i = 0; i < 70; i++) {
            System.out.println(m.fibonachiFor(i) + " : " + m.fibonachiRekursia(i));
        }
    }

    public long faktorialFor(int n) {
        if (n <= 0) return 0;

        long x = 1;
        for (int i = 2; i <= n; i++) {
            x *= i;
        }

        return x;
    }

    public long faktorialRekursi(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return n * faktorialRekursi(n - 1);
    }

    public long fibonachiFor(int n) {
        if (n <= 0) return 0;
        long x = 0;
        long y = 1;
        for (int i = 1; i < n; i++) {
            y = x + y;
            x = y - x;
        }

        return y;
    }

    public long fibonachiRekursia(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        long[] arr = new long[n + 1];
        arr[1] = 1;
        arr[2] = 1;

        return fibonachiRekursia(n, arr);
    }

    private long fibonachiRekursia(int n, long[] arr) {

        return (arr[n - 1] != 0 ? arr[n - 1] : (arr[n - 1] = fibonachiRekursia(n - 1, arr))) +
                (arr[n - 2] != 0 ? arr[n - 2] : (arr[n - 2] = fibonachiRekursia(n - 2, arr)));
    }
}