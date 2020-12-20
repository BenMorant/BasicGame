package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeApp extends JFrame {

  public SnakeApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      SnakeApp ex = new SnakeApp();
      ex.setVisible(true);
    });
  }

  private void initUI() {

    add(new Board());

    setResizable(false);
    pack();

    setTitle("Snake");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

