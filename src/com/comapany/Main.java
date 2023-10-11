package com.comapany;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Love Application");
        JButton button = new JButton("Click here to see a surprise message!");

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "I love you Diya");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

