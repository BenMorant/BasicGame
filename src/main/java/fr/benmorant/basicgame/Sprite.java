package fr.benmorant.basicgame;

import java.awt.Image;

public class Sprite {

  int x;
  int y;
  int dx;
  private boolean visible;
  private Image image;
  private boolean dying;

  public Sprite() {

    visible = true;
  }

  public void die() {

    visible = false;
  }

  public boolean isVisible() {

    return visible;
  }

  protected void setVisible(boolean visible) {

    this.visible = visible;
  }

  public Image getImage() {

    return image;
  }

  public void setImage(Image image) {

    this.image = image;
  }

  public int getY() {

    return y;
  }

  public void setY(int y) {

    this.y = y;
  }

  public int getX() {

    return x;
  }

  public void setX(int x) {

    this.x = x;
  }

  public boolean isDying() {

    return this.dying;
  }

  public void setDying(boolean dying) {

    this.dying = dying;
  }
}
