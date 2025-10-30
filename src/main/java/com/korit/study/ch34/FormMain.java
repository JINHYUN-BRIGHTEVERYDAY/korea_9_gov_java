package com.korit.study.ch34;

import javax.swing.*;

public class FormMain {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("First Form");
        jframe.setContentPane(new FirstForm().getPanel1());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
    }
}
