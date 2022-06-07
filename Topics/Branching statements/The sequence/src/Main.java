import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= number; i++) {

            for (int j = 0; j < i; j++) {
                if (counter == number - 1){
                    System.out.print(i);
                }else{
                    System.out.print(i + " ");
                }

                counter += 1;
                if (counter >= number){
                    break;
                }
            }

            if (counter >= number){
                break;
            }
        }
    }
}