package fr.benmorant.basicgame;

import javax.swing.ImageIcon;

public class Bomb extends Sprite {

  private boolean destroyed;

  public Bomb(int x, int y) {

    initBomb(x, y);
  }

  private void initBomb(int x, int y) {

    setDestroyed(true);

    this.x = x;
    this.y = y;

    String bombImg = "src/main/resources/bomb.png";
    ImageIcon ii = new ImageIcon(bombImg);
    setImage(ii.getImage());
  }

  public boolean isDestroyed() {

    return destroyed;
  }

  public void setDestroyed(boolean destroyed) {

    this.destroyed = destroyed;
  }
}
