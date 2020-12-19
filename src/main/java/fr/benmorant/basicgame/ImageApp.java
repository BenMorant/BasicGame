package fr.benmorant.basicgame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ImageApp extends JFrame {

  public ImageApp() {

    initUI();
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      ImageApp imageApp = new ImageApp();
      imageApp.setVisible(true);
    });
  }

  private void initUI() {

    add(new Board());

    pack();

    setTitle("Manuel Valls");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }
}

