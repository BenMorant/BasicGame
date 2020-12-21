package fr.benmorant.basicgame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TetrisApp extends JFrame {

  private JLabel statusbar;

  public TetrisApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      TetrisApp ex = new TetrisApp();
      ex.setVisible(true);
    });
  }

  private void initUI() {

    statusbar = new JLabel(" 0");
    add(statusbar, BorderLayout.SOUTH);

    Board board = new Board(this);
    add(board);
    board.start();

    setTitle("Tetris");
    setSize(200, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  JLabel getStatusBar() {

    return statusbar;
  }
}

