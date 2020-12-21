package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class PacmanApp extends JFrame {

  public PacmanApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      PacmanApp ex = new PacmanApp();
      ex.setVisible(true);
    });
  }

  private void initUI() {

    add(new Board());

    setTitle("Pacman");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(380, 420);
    setLocationRelativeTo(null);
  }
}

