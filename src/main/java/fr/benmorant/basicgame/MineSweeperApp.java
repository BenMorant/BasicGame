package fr.benmorant.basicgame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MineSweeperApp extends JFrame {

  private JLabel statusbar;

  public MineSweeperApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      MineSweeperApp ex = new MineSweeperApp();
      ex.setVisible(true);
    });
  }

  private void initUI() {

    statusbar = new JLabel("");
    add(statusbar, BorderLayout.SOUTH);

    add(new Board(statusbar));

    setResizable(false);
    pack();

    setTitle("Minesweeper");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}

