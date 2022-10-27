package com.study.gui.layoutmanager.springlayout;
import javax.swing.*;
import java.awt.*;

public class ContohSpring {
    JFrame f;
    Container c;
    SpringLayout l;
    JLabel label;
    JTextField t;

    public ContohSpring() {
        f = new JFrame("Demo SpringLayout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c  = f.getContentPane();
        l = new SpringLayout();
        c.setLayout(l);
        label = new JLabel("Ini label");
        t = new JTextField("Tuliskan Teks", 20);
        c.add(label);
        c.add(t);
        l.putConstraint(SpringLayout.WEST, label, 20,SpringLayout.WEST, c);
        l.putConstraint(SpringLayout.NORTH, label, 10,SpringLayout.NORTH, c);
        l.putConstraint(SpringLayout.WEST, t, 10,SpringLayout.EAST, label);
        l.putConstraint(SpringLayout.NORTH, t, 10,SpringLayout.NORTH, c);
        l.putConstraint(SpringLayout.EAST, c, 5,SpringLayout.EAST, t);
        l.putConstraint(SpringLayout.SOUTH, c, 5,SpringLayout.SOUTH, t);
        f.pack();
        f.show();
    }

    public static void main(String[] args) {
        ContohSpring cd = new ContohSpring();
    }
}
