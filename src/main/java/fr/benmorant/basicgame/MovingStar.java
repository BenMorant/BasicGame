package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MovingStar extends JFrame {

  public MovingStar() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      JFrame frame = new MovingStar();
      frame.setVisible(true);
    });
  }

  private void initUI() {

    add(new Board());

    setResizable(false);
    pack();

    setTitle("A Star is born");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

