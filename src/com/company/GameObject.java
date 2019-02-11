package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;

public interface GameObject {

    void move();
    int getX();
    int getY();
    int getWidh();
    int getHeight();

    Image getImage();
    void keyPressed(KeyEvent e);
    void keyReleased(KeyEvent e);


}
