package com.java.task.x_o_game;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * Game, known as "крестики нолики"
 */
public class Solution {
    private final static int ROW_NUMBER = 3;
    private final static int COL_NUMBER = 3;
    private final static int X_WIN_SUM = 3;
    private final static int O_WIN_SUM = -3;
    private final static String EMPTY_FIELD = " ";
    private final static String X_MOVE = "X";
    private final static String O_MOVE = "O";
    private final static Scanner sc = new Scanner(System.in);
    private final static Random random = new Random();

    public static void main(String[] args) {
     boolean continueGame = true;
         while(continueGame){
             System.out.println("хотите начать игру? напечатайте Y для продолжения:");
             String s = sc.nextLine();
             if(s.trim().equals("Y")){
                 startGame();
             } else {
                 continueGame = false;
             }
        }
    }

    public static void startGame(){
        String[][] board = creatEmptyBoard();
        System.out.println("введите ваш ход -> две координаты от 0 до 2: ");
        do {
           String enter = sc.nextLine();
           int[] coordinates = Arrays.stream(enter.trim().split(" "))
                   .map(String::trim)
                   .map(Integer::parseInt)
                   .mapToInt(Integer::intValue).toArray();
           if(coordinates.length != 2 || coordinates[0] < 0 || coordinates[0] > ROW_NUMBER
                                                            || coordinates[1] < 0 || coordinates[1] > COL_NUMBER) {
               System.out.println("введенные координаты неправильны, повторите ввод: ");
               continue;
           }
            GameStatus gameStatusAfterPlayerMove = makePlayerMove(board, coordinates);
            System.out.println("Игрок сделал ход");
            prettyPrintBoard(board);
            GameStatus gameStatusAfterPlayerRound = checkGameStatusAfterRound(gameStatusAfterPlayerMove, board);

            if(gameStatusAfterPlayerRound.equals(GameStatus.END_GAME)){
                return;
            } else if (gameStatusAfterPlayerRound.equals(GameStatus.COORDINATE_OCCUPIED)) {
                System.out.println("введите новые координаты -> две координаты от 0 до 2: ");
            } else if (gameStatusAfterPlayerRound.equals(GameStatus.CONTINUE_GAME)) {
                System.out.println("Бот ходит");
                GameStatus gameStatusAfterBotMove = makeBotMove(board);
                prettyPrintBoard(board);

                GameStatus gameStatusAfterBotRound = checkGameStatusAfterRound(gameStatusAfterBotMove, board);

                if(gameStatusAfterBotRound.equals(GameStatus.END_GAME)){
                    return;
                } else if (gameStatusAfterBotRound.equals(GameStatus.CONTINUE_GAME)) {
                    System.out.println("следующий ход, введите -> две координаты от 0 до 2: ");
                }
            }

        } while (true);
    }
       private static GameStatus checkGameStatusAfterRound(GameStatus gameStatus, String[][] board){
          return switch (gameStatus) {
              case DRAW -> {
                  System.out.println("Игра завершена: Ничья");
                  yield GameStatus.END_GAME;
              }
              case X_WIN -> {
                  System.out.println("Игра завершена: Игрок победил!!!");
                  yield GameStatus.END_GAME;
              }
              case O_WIN -> {
                  System.out.println("Игра завершена: Бот победил!!!");
                  yield GameStatus.END_GAME;
              }
              case COORDINATE_OCCUPIED -> { // только для игрока
                  System.out.println("Введенные координаты заняты сделайте другой ход!");
                  yield GameStatus.COORDINATE_OCCUPIED;
              }
              case MOVE_AVAILABLE -> GameStatus.CONTINUE_GAME;
              default -> {
                  System.out.println("Игра окончена:");
                  yield GameStatus.END_GAME;
              }
          };
    }
    private static String[][] creatEmptyBoard(){
        String[][] board = new String[ROW_NUMBER][COL_NUMBER];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = EMPTY_FIELD;
            }
        }
        return board;
    }
    public static GameStatus makePlayerMove(String[][] board, int[] coordinates){
        if(checkAvailablePlaceToMove(coordinates, board)){
            board[coordinates[0]][coordinates[1]] = X_MOVE;
           return checkRowsStatus(board);
        } else {
            return GameStatus.COORDINATE_OCCUPIED;
        }
    }
    public static GameStatus makeBotMove(String[][] board){
           int row = random.nextInt(ROW_NUMBER);
            int col = random.nextInt(COL_NUMBER);
            int[] coordinates = {row, col};
            boolean status = checkAvailablePlaceToMove(coordinates, board);
            if(status){
                board[row][col] = O_MOVE;
                return checkRowsStatus(board);
            }
           return makeBotMove(board);
    }

    private static GameStatus checkRowsStatus(String[][] board){
        int firstColumnXSum = 0;
        int firstColumnOSum = 0;
        int lastColumnXSum = 0;
        int lastColumnOSum = 0;
        int mediumColumnXSum = 0;
        int mediumColumnOSum = 0;
        int diagonalLeftXSum = 0;
        int diagonalLeftOSum = 0;
        int diagonalRightXSum = 0;
        int diagonalRightOSum = 0;

        for (int row = 0; row < board.length; row++) {
            int resRowX = 0;
            int resRawO = 0;
            //проверка диагонали лево:верх - право:низ на XXХ
            if(Objects.equals(board[row][row], X_MOVE)){
                diagonalLeftXSum = diagonalLeftXSum + 1;
            }
            //проверка диагонали лево:верх - право:низ на OOO
            if(Objects.equals(board[row][row], O_MOVE)){
                diagonalLeftOSum = diagonalLeftOSum - 1;
            }
            //проверка диагонали право:верх - лево:низ на XXХ
            if(Objects.equals(board[row][2 - row], X_MOVE)){
                diagonalRightXSum = diagonalRightXSum + 1;
            }
            //проверка диагонали право:верх - лево:низ на OOO
            if(Objects.equals(board[row][2 - row], O_MOVE)){
                diagonalRightOSum = diagonalRightOSum - 1;
            }
            //проверка левой колонки борды на ХXX
            if(Objects.equals(board[row][0], X_MOVE)){
                firstColumnXSum = firstColumnXSum + 1;
            }
            //проверка левой колонки борды на OOO
            if(Objects.equals(board[row][0], O_MOVE)){
                firstColumnOSum = firstColumnOSum - 1;
            }
            //проверка правой колонки борды на ХXX
            if(Objects.equals(board[row][board.length - 1], X_MOVE)){
                lastColumnXSum = lastColumnXSum + 1;
            }
            //проверка правой колонки борды на OOO
            if(Objects.equals(board[row][board.length - 1], O_MOVE)){
                lastColumnOSum = lastColumnOSum - 1;
            }
            //проверка средней колонки борды на ХXX
            if(Objects.equals(board[row][board.length - 2], X_MOVE)){
                mediumColumnXSum = mediumColumnXSum + 1;
            }
            //проверка средней колонки борды на OOO
            if(Objects.equals(board[row][board.length-2], O_MOVE)){
                mediumColumnOSum = mediumColumnOSum - 1;
            }

                    for (int col = 0; col < board.length; col++) {
                        //проверка ряда борды на ХXX
                        if(Objects.equals(board[row][col], X_MOVE)){
                           resRowX = resRowX + 1;
                        }
                        //проверка ряда борды на OOO
                        if(Objects.equals(board[row][col], O_MOVE)){
                            resRawO = resRawO - 1;
                        }
                    }
                    if(resRowX == X_WIN_SUM){
                       return GameStatus.X_WIN;
                    }
                    if(resRawO == O_WIN_SUM){
                        return GameStatus.O_WIN;
                    }
        }
            if (firstColumnXSum == X_WIN_SUM || lastColumnXSum == X_WIN_SUM || mediumColumnXSum == X_WIN_SUM || diagonalLeftXSum == X_WIN_SUM || diagonalRightXSum == X_WIN_SUM){
                return GameStatus.X_WIN;
            }
            if (firstColumnOSum == O_WIN_SUM || lastColumnOSum == O_WIN_SUM || mediumColumnOSum == O_WIN_SUM || diagonalLeftOSum == O_WIN_SUM || diagonalRightOSum == O_WIN_SUM){
                return GameStatus.O_WIN;
        }
        return checkMoveAvailability(board);
    }

    private static GameStatus checkMoveAvailability(String[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if(Objects.equals(board[row][col], EMPTY_FIELD)){
                    return GameStatus.MOVE_AVAILABLE;
                }
            }
        }
        return GameStatus.DRAW;
    }

    private static boolean checkAvailablePlaceToMove(int[] coordinates, String[][] board){
       return Objects.equals(board[coordinates[0]][coordinates[1]], EMPTY_FIELD);
    }
    private static void prettyPrintBoard(String[][] board){
        System.out.println("---------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

}
