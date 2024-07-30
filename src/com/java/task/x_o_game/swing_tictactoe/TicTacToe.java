package com.java.task.x_o_game.swing_tictactoe;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class TicTacToe {
    public final static String X_SIGN = "X";
    public final static String X_TURN = "X turn";
    public final static String O_SIGN = "O";
    public final static String O_TURN = "O turn";
    public final static String O_WINS = "O wins!!!";
    public final static String X_WINS = "X wins!!!";
    private final GameFrame mainFrame;
    private static Random random = new Random();
    private volatile boolean playerTurn;
    private volatile boolean gameOver;
    private volatile AtomicInteger turns = new AtomicInteger(0);



    public TicTacToe(GameFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.playerTurn = false;
        this.gameOver = false;
    }

    public void firstTurn() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        makeRandomTurn();

        if(playerTurn){
            mainFrame.getTextField().setText(X_TURN);
        } else {
            mainFrame.getTextField().setText(O_TURN);
            boolean moved = makeBotMove();
            if(moved){
                this.playerTurn = true;
            }

        }
    }

    private void makeRandomTurn(){
        random = new Random();
        if(random.nextInt(2) == 0){
            this.playerTurn = true;
        } else{
            this.playerTurn = false;
        }
    }

    public void tryToMakeBotMove() {
        if(gameOver){
            checkWinCombination(mainFrame.getButtons());
            return;
        }
        boolean winCombination = checkWinCombination(mainFrame.getButtons());
        boolean botMoved = makeBotMove();

        if(botMoved){
            if(!winCombination && !checkMoveAvailability()){
                setDraw(mainFrame.getButtons());
            }
        }
        else {
            if(!winCombination && !checkMoveAvailability()){
                setDraw(mainFrame.getButtons());
            } else {
                tryToMakeBotMove();
            }
        }
    }

    @SneakyThrows
    public boolean makeBotMove() {
        JButton[] buttons = mainFrame.getButtons();
        int newCoordinate = random.nextInt(9);
        boolean moveAvailable = checkAvailablePlaceToMove(newCoordinate, buttons);

        if(moveAvailable){
            Thread.sleep(2000);
            buttons[newCoordinate].setForeground(new Color(0,0,255));
            buttons[newCoordinate].setText(O_SIGN);
            turns.incrementAndGet();
            this.playerTurn = true;
            checkWinCombination(mainFrame.getButtons());
            if(mainFrame.getTextField().isEnabled()){
                mainFrame.getTextField().setText(X_TURN);
            }
            return true;
        }
        return false;
    }


    private boolean checkAvailablePlaceToMove(int coordinate, JButton[] buttons){
        if(turns.get() >= 9){
            return false;
        }
        return Objects.equals(buttons[coordinate].getText(), "");
    }
    public boolean checkMoveAvailability(){
        return turns.get() < 9;
    }

    public boolean checkWinCombination(JButton[] buttons) {
        boolean Xwin = checkXWinCombinations(buttons);
        boolean Ywin = checkOWinCombinations(buttons);
        return Xwin || Ywin;
    }

    private boolean checkXWinCombinations(JButton[] buttons) {
        if((buttons[0].getText().equals(X_SIGN)) &&
                (buttons[1].getText().equals(X_SIGN)) &&
                (buttons[2].getText().equals(X_SIGN))){
            return xWins(0,1,2, buttons);
        }
        if((buttons[3].getText().equals(X_SIGN)) &&
                (buttons[4].getText().equals(X_SIGN)) &&
                (buttons[5].getText().equals(X_SIGN))){
            return xWins(3,4,5, buttons);
        }
        if((buttons[6].getText().equals(X_SIGN)) &&
                (buttons[7].getText().equals(X_SIGN)) &&
                (buttons[8].getText().equals(X_SIGN))){
            return xWins(6,7,8, buttons);
        }
        if((buttons[0].getText().equals(X_SIGN)) &&
                (buttons[3].getText().equals(X_SIGN)) &&
                (buttons[6].getText().equals(X_SIGN))){
            return xWins(0,3,6, buttons);
        }
        if((buttons[1].getText().equals(X_SIGN)) &&
                (buttons[4].getText().equals(X_SIGN)) &&
                (buttons[7].getText().equals(X_SIGN))){
            return xWins(1,4,7, buttons);
        }
        if((buttons[2].getText().equals(X_SIGN)) &&
                (buttons[5].getText().equals(X_SIGN)) &&
                (buttons[8].getText().equals(X_SIGN))){
            return xWins(2,5,8, buttons);
        }
        if((buttons[2].getText().equals(X_SIGN)) &&
                (buttons[4].getText().equals(X_SIGN)) &&
                (buttons[6].getText().equals(X_SIGN))){
            return xWins(2,4,6, buttons);
        }
        if((buttons[0].getText().equals(X_SIGN)) &&
                (buttons[4].getText().equals(X_SIGN)) &&
                (buttons[8].getText().equals(X_SIGN))){
            return xWins(0,4,8, buttons);
        }

        return false;
    }
    private boolean checkOWinCombinations(JButton[] buttons) {
        if((buttons[0].getText().equals(O_SIGN)) &&
                (buttons[1].getText().equals(O_SIGN)) &&
                (buttons[2].getText().equals(O_SIGN))){
            return oWins(0,1,2, buttons);
        }
        if((buttons[3].getText().equals(O_SIGN)) &&
                (buttons[4].getText().equals(O_SIGN)) &&
                (buttons[5].getText().equals(O_SIGN))){
            return oWins(3,4,5, buttons);
        }
        if((buttons[6].getText().equals(O_SIGN)) &&
                (buttons[7].getText().equals(O_SIGN)) &&
                (buttons[8].getText().equals(O_SIGN))){
            return oWins(6,7,8, buttons);
        }
        if((buttons[0].getText().equals(O_SIGN)) &&
                (buttons[3].getText().equals(O_SIGN)) &&
                (buttons[6].getText().equals(O_SIGN))){
            return oWins(0,3,6, buttons);
        }
        if((buttons[1].getText().equals(O_SIGN)) &&
                (buttons[4].getText().equals(O_SIGN)) &&
                (buttons[7].getText().equals(O_SIGN))){
            return oWins(1,4,7, buttons);
        }
        if((buttons[2].getText().equals(O_SIGN)) &&
                (buttons[5].getText().equals(O_SIGN)) &&
                (buttons[8].getText().equals(O_SIGN))){
            return oWins(2,5,8, buttons);
        }
        if((buttons[2].getText().equals(O_SIGN)) &&
                (buttons[4].getText().equals(O_SIGN)) &&
                (buttons[6].getText().equals(O_SIGN))){
            return oWins(2,4,6, buttons);
        }
        if((buttons[0].getText().equals(O_SIGN)) &&
                (buttons[4].getText().equals(O_SIGN)) &&
                (buttons[8].getText().equals(O_SIGN))){
            return oWins(0,4,8, buttons);
        }

        return false;
    }

    private boolean xWins(int a, int b, int c, JButton[] buttons) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        mainFrame.getTextField().setText(X_WINS);
        mainFrame.getTextField().setEnabled(false);
        this.gameOver = true;
        return true;
    }

    private boolean oWins(int a, int b, int c, JButton[] buttons) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        mainFrame.getTextField().setText(O_WINS);
        mainFrame.getTextField().setEnabled(false);
        this.gameOver = true;
        return true;
    }

    public void setDraw(JButton[] buttons) {
        mainFrame.getTextField().setText("Draw");
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        this.gameOver = true;
    }

}
