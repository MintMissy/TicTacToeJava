package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter cells: ");
        String cells = "_________";
//        String cells = scanner.next();
//        printBoard(cells);

        boolean xTurn = true;
        String gameStatus = getGameStatus(cells);
        do {
            printBoard(cells);
            cells = makeMove(cells, xTurn ? 'X' : 'O');
            xTurn = !xTurn;
            gameStatus = getGameStatus(cells);
            printBoard(cells);
            System.out.println(gameStatus);
        } while (gameStatus.equals("Game not finished") || gameStatus.equals("Draw"));

    }

    private static void printBoard(String cells) {
        System.out.println("---------");
        System.out.println(("| " + cells.charAt(0) + " " + cells.charAt(1) + " " + cells.charAt(2) + " |").replace("_", " "));
        System.out.println(("| " + cells.charAt(3) + " " + cells.charAt(4) + " " + cells.charAt(5) + " |").replace("_", " "));
        System.out.println(("| " + cells.charAt(6) + " " + cells.charAt(7) + " " + cells.charAt(8) + " |").replace("_", " "));
        System.out.println("---------");
    }

    private static String makeMove(String cells, char character) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = cells.toCharArray();
        char[][] cellsMap = {
                {charArray[0], charArray[1], charArray[2]},
                {charArray[3], charArray[4], charArray[5]},
                {charArray[6], charArray[7], charArray[8]}
        };

        System.out.print("Enter the coordinates: ");
        int yCoordinate = scanner.nextInt();
        int xCoordinate = scanner.nextInt();

        while ((xCoordinate < 1 || xCoordinate > 3) ||
                (yCoordinate < 1 || yCoordinate > 3) ||
                cellsMap[yCoordinate - 1][xCoordinate - 1] != '_'
        ) {
            printBoard(cells);
            System.out.println(getGameStatus(cells));
            if ((xCoordinate < 1 || xCoordinate > 3) || (yCoordinate < 1 || yCoordinate > 3)) {
                System.out.println("Coordinates should be from 1 to 3 !");
                System.out.print("Enter the coordinates: ");
                yCoordinate = scanner.nextInt();
                xCoordinate = scanner.nextInt();
                continue;
            }

            if (cellsMap[yCoordinate - 1][xCoordinate - 1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.print("Enter the coordinates: ");
                yCoordinate = scanner.nextInt();
                xCoordinate = scanner.nextInt();
            }
        }

        cellsMap[yCoordinate - 1][xCoordinate - 1] = character;

        String newCells = "";
        for (int i = 0; i < cellsMap.length; i++) {
            for (int j = 0; j < cellsMap[i].length; j++) {
                newCells += cellsMap[i][j];
            }
        }

        return newCells;
    }

    private static String getGameStatus(String cells) {
        int amountOfX = 0;
        int amountOfO = 0;

        for (int i = 0; i < cells.length(); i++) {
            if (cells.charAt(i) == 'X') {
                amountOfX++;
            } else if (cells.charAt(i) == 'O') {
                amountOfO++;
            }
        }

        if (Math.abs(amountOfX - amountOfO) > 1) {
            return "Impossible";
        }

        int wins = 0;
        char winner = 'A';

        if ((cells.charAt(0) == cells.charAt(1) &&
                cells.charAt(1) == cells.charAt(2)) &&
                cells.charAt(0) != '_'
        ) {
            wins++;
            System.out.println("test 1");
            winner = cells.charAt(0);
        }
        if ((cells.charAt(3) == cells.charAt(4) &&
                cells.charAt(4) == cells.charAt(5)) &&
                cells.charAt(3) != '_'
        ) {
            wins++;
            System.out.println("test 2");
            winner = cells.charAt(3);
        }
        if ((cells.charAt(6) == cells.charAt(7) &&
                cells.charAt(7) == cells.charAt(8)) &&
                cells.charAt(6) != '_'
        ) {
            wins++;
            System.out.println("test 3");
            winner = cells.charAt(6);
        }
        if ((cells.charAt(0) == cells.charAt(3) &&
                cells.charAt(3) == cells.charAt(6)) &&
                cells.charAt(0) != '_'
        ) {
            wins++;
            System.out.println("test 4");
            winner = cells.charAt(0);
        }
        if ((cells.charAt(1) == cells.charAt(4) &&
                cells.charAt(4) == cells.charAt(7)) &&
                cells.charAt(1) != '_'
        ) {
            wins++;
            System.out.println("test 5");
            winner = cells.charAt(1);
        }
        if ((cells.charAt(2) == cells.charAt(5) &&
                cells.charAt(5) == cells.charAt(8)) &&
                cells.charAt(2) != '_'
        ) {
            wins++;
            System.out.println("test 6");
            winner = cells.charAt(2);
        }
        if ((cells.charAt(0) == cells.charAt(4) &&
                cells.charAt(4) == cells.charAt(8)) &&
                cells.charAt(0) != '_'
        ) {
            wins++;
            System.out.println("test 7");
            winner = cells.charAt(0);
        }
        if ((cells.charAt(2) == cells.charAt(4) &&
                cells.charAt(4) == cells.charAt(6)) &&
                cells.charAt(2) != '_'
        ) {
            wins++;
            System.out.println("test 8");
            winner = cells.charAt(2);
        }

        if (wins > 1) {
            return "Impossible";
        }

        if (wins == 1) {
            return winner + " wins";
        }

        if (!cells.contains("_")) {
            return "Draw";
        }

        return "Game not finished";
    }
}
