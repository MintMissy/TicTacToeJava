import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayHeight = scanner.nextInt();
        int arrayWidth = scanner.nextInt();

        int[][] array = new int[arrayHeight][arrayWidth];

        // Read array
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Print result
        int[][] rotatedArray = rotateArray(array);
        for (int[] row : rotatedArray) {
            System.out.println(Arrays.toString(row)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        }

    }

    private static int[][] rotateArray(int[][] array) {
        int arrayHeight = array.length;
        int arrayWidth = array[0].length;
        int[][] rotatedArray = new int[arrayWidth][arrayHeight];

        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                rotatedArray[j][i] = array[i][j];
            }
        }

        arrayHeight = rotatedArray.length;
        arrayWidth = rotatedArray[0].length;

        // Reverse rows
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth / 2; j++) {
                int temp = rotatedArray[i][j];
                rotatedArray[i][j] = rotatedArray[i][arrayWidth - 1 - j];
                rotatedArray[i][arrayWidth - 1 - j] = temp;
            }
        }


        return rotatedArray;
    }
}