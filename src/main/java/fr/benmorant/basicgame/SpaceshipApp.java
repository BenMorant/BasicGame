package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceshipApp extends JFrame {

  public SpaceshipApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      SpaceshipApp app = new SpaceshipApp();
      app.setVisible(true);
    });
  }

  private void initUI() {

    add(new Board());

    setSize(400, 300);
    setResizable(false);

    setTitle("Space War");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}