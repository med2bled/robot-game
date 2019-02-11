package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Robot implements GameObject {
    private int dx;
    private int dy;
    private int x = 40;
    private int y = 60;
    private int w;
    private int h;
    private Image image;
    public Robot(){
        loadImage();
    }

    private void loadImage() {
        ImageIcon imageIcon = new ImageIcon("res/images/roboto.png");

        image = imageIcon.getImage();
        h = image.getHeight(null);
        w = image.getWidth(null);



    }
    @Override
    public void move() {
        x+=dx;
        y+=dy;

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidh() {
        return w;
    }

    @Override
    public int getHeight() {
        return h;
    }



    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }



    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }

    }
}
