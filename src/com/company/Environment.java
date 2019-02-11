package com.company;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Environment extends JPanel implements ActionListener {


    private final int B_WIDTH = 600;
    private final int B_HEIGHT = 600;

    private final int DELAY = 10;
    GameObject robot;
    private Timer timer;


    public Environment() {
        initEnv();
    }

    private void initEnv() {
        addKeyListener(new MkeyAdapter());
        setFocusable(true);

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        robot = new Robot();
        timer = new Timer(DELAY,this);
        timer.start();



    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();

    }

    private void doDrawing(Graphics g) {
        System.out.println("drawing");

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(robot.getImage(), robot.getX(), robot.getY()
                , this);


    }
    public void actionPerformed(ActionEvent e) {
        step();
    }

    private void step() {
        robot.move();
        repaint(robot.getX(),robot.getY(),robot.getWidh(),robot.getHeight());
    }
    private  class MkeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

            robot.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            robot.keyReleased(e);
        }
    }
}
