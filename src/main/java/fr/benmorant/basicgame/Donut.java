package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Donut extends JFrame {

  public Donut() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      Donut donut = new Donut();
      donut.setVisible(true);
    });
  }

  private void initUI() {

    add(new Board());

    setSize(330, 330);

    setTitle("Donut");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }
}

