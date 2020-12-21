package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceInvadersApp extends JFrame {

  public SpaceInvadersApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      SpaceInvadersApp ex = new SpaceInvadersApp();
      ex.setVisible(true);
    });
  }

  private void initUI() {

    add(new Board());

    setTitle("Space Invaders");
    setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
  }
}

