package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class BreakoutApp extends JFrame {

  public BreakoutApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      BreakoutApp ex = new BreakoutApp();
      ex.setVisible(true);
    });
  }

  private void initUI() {

    add(new Board());
    setTitle("Breakout");

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    pack();
  }
}

