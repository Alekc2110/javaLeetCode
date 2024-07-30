package com.java.task.x_o_game.swing_tictactoe;

import com.java.task.x_o_game.swing_tictactoe.buttons.GameButton;
import com.java.task.x_o_game.swing_tictactoe.buttons.ResetButton;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import static com.java.task.x_o_game.swing_tictactoe.TicTacToe.*;

@Getter
@Setter
public class GameFrame extends JFrame implements ActionListener {

    private TicTacToe game;
    private final JButton resetButton;
    private final JPanel titlePanel;
    private final JPanel buttonPanel;
    private final JLabel textField;
    private final JButton[] buttons = new JButton[9];

    public GameFrame() throws HeadlessException {
        super("tic-tac-toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(50, 50, 50));
        this.setLayout(new BorderLayout());
        this.resetButton = new ResetButton();
        this.titlePanel = new JPanel();
        this.buttonPanel = new JPanel();
        this.textField = new JLabel();

        configureResetGameButton();
        configureTextField();
        configureTitlePanel();
        configureButtonPanel();


        for (int i = 0; i < 9; i++) {
            buttons[i] = new GameButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        this.setVisible(true);
        this.game = new TicTacToe(this);
        game.firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof ResetButton) {
            resetAllComponents();
            this.game.firstTurn();
        }

        if (game.isGameOver()) {
            return;
        }

        if (e.getSource() instanceof GameButton b) {
            if (b.getText().equals("")) {
                boolean moveAvailable = game.checkMoveAvailability();
                if (moveAvailable) {
                    if (game.isPlayerTurn()) {
                        b.setForeground(new Color(255, 0, 0));
                        b.setText(X_SIGN);
                        AtomicInteger turns = game.getTurns();
                        turns.incrementAndGet();
                        boolean winCombination = game.checkWinCombination(buttons);
                        if(!winCombination){
                            game.setPlayerTurn(false);
                            this.getTextField().setText(O_TURN);
                            ExecutorService executorService = Executors.newSingleThreadExecutor();
                            try {
                                executorService.submit(() -> game.tryToMakeBotMove());
                            } finally {
                                executorService.shutdown();
                            }
                        }
                    }
                }
            }
        }
    }

    @SneakyThrows
    private void resetAllComponents() {
        for (JButton button: buttons) {
            button.setText("");
            button.setBackground(Color.LIGHT_GRAY);
            button.setFocusable(false);
            button.setEnabled(true);
        }
        this.textField.setEnabled(true);
        AtomicInteger turns = game.getTurns();
        turns.set(0);
        game.setPlayerTurn(false);
        game.setGameOver(false);
    }

    private void configureResetGameButton() {
        resetButton.setText("Start game");
        resetButton.setSize(200, 50);
        resetButton.setFont(new Font("Ink Free", Font.ITALIC, 15));
        resetButton.setForeground(Color.BLUE);
        resetButton.setEnabled(true);
        resetButton.setVisible(true);
        resetButton.addActionListener(this);
        this.add(resetButton);
    }

    private void configureTextField() {
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setVerticalAlignment(JLabel.CENTER);
        textField.setEnabled(true);
        textField.setText("TIC TAC TOE");
        textField.setOpaque(true);
    }

    private void configureTitlePanel() {
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);

        titlePanel.add(textField);
        this.add(titlePanel, BorderLayout.NORTH);
    }

    private void configureButtonPanel() {
        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(new Color(50, 50, 50));
        this.add(buttonPanel);
    }

}
