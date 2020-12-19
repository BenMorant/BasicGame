package fr.benmorant.basicgame;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {

  private Image manu;

  public Board() {

    initBoard();
  }

  private void initBoard() {

    loadImage();

    int w = manu.getWidth(this);
    int h = manu.getHeight(this);
    setPreferredSize(new Dimension(w, h));
  }

  private void loadImage() {

    ImageIcon imageIcon = new ImageIcon("src/main/resources/valls.jpeg");
    manu = imageIcon.getImage();
  }

  @Override
  public void paintComponent(Graphics graphics) {

    graphics.drawImage(manu, 0, 0, null);
  }
}
