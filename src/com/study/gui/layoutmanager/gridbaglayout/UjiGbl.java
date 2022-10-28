package com.study.gui.layoutmanager.gridbaglayout;

import javax.swing.*;
import java.awt.*;

public class UjiGbl {
    JFrame f;
    GridBagLayout gbl;
    GridBagConstraints c;

    public UjiGbl() {
        f = new JFrame("Contoh GridBagLayout");
        gbl = new GridBagLayout();
        c = new GridBagConstraints();
        f.getContentPane().setLayout(gbl);
        c.fill = GridBagConstraints.HORIZONTAL;

        JButton j1 = new JButton("1");
        c.weightx = 2;
        c.gridx = 0;
        c.gridy = 0;

        gbl.setConstraints(j1, c);
        f.getContentPane().add(j1);

        JButton j2 = new JButton("2");
        c.gridx = 1;
        c.gridy = 0;
        gbl.setConstraints(j2, c);
        f.getContentPane().add(j2);

        JButton j3 = new JButton("3");
        c.ipadx = 30;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        gbl.setConstraints(j3, c);
        f.getContentPane().add(j3);

        JButton j4 = new JButton("4");
        c.ipady = 50;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        gbl.setConstraints(j4, c);
        f.getContentPane().add(j4);

        JButton j5 = new JButton("5");
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        c.anchor = GridBagConstraints.SOUTH;
        gbl.setConstraints(j5, c);
        f.getContentPane().add(j5);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        UjiGbl ugbl = new UjiGbl();
    }
}
