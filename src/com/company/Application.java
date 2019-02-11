package com.company;

import javax.swing.*;
import java.awt.*;

public class Application  extends JFrame {
    public Application() {
        initUi();


    }

    private void initUi() {
        add(new Environment());

        setResizable(false);
        pack();
        setTitle("RobotGame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public static void main(String[] args) {
        System.out.println("hey there");
        EventQueue.invokeLater(()->
            new Application().setVisible(true)

        );

    }
}

