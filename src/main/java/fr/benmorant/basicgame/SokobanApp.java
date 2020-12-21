package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SokobanApp extends JFrame {

  private final int OFFSET = 30;

  public SokobanApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      SokobanApp ex = new SokobanApp();
      ex.setVisible(true);
    });
  }

  private void initUI() {

    Board board = new Board();
    add(board);

    setTitle("Sokoban");

    setSize(board.getBoardWidth() + OFFSET,
        board.getBoardHeight() + 2 * OFFSET);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }
}

