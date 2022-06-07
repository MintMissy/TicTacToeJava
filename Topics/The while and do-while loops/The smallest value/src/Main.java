import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();

        int n = 0;
        do {
            n += 1;
        } while (getFactorial(n) <= m);
        System.out.println(n);
    }

    private static long getFactorial(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}