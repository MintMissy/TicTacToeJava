import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements = scanner.nextInt();
        int currentElement = 0;
        int maxDivisibleBy4 = 0;

        while (currentElement < elements) {
            int number = scanner.nextInt();
            if (number % 4 == 0 &&
                    number > maxDivisibleBy4) {
                maxDivisibleBy4 = number;
            }
            currentElement++;
        }
        System.out.println(maxDivisibleBy4);
    }
}