import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int amountOfBridges = scanner.nextInt();
        int currentBridge = 0;
        boolean crashed = false;

        while (currentBridge < amountOfBridges) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                crashed = true;
                System.out.println("Will crash on bridge " + (currentBridge+1));
                break;
            }
            currentBridge++;
        }

        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}