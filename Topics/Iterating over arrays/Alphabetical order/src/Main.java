import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(" ");
        boolean isAscending = true;

        for (int i = 0; i < stringArray.length - 1; i++) {
            if(stringArray[i].compareTo(stringArray[i+1]) > 0){
                isAscending = false;
                break;
            }
        }
        System.out.println(isAscending);
    }
}