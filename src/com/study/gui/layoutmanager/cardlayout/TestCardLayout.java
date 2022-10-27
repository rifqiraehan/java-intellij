package com.study.gui.layoutmanager.cardlayout;

import javax.swing.*;
import java.awt.*;

public class TestCardLayout extends JFrame {
    JPanel p1;
    JPanel p2;
    JRadioButton pil1, pil2, pil3;
    ButtonGroup radioGroup;
    JTextArea g;

    public TestCardLayout() {
        super("Uji coba Card Layout");
        p1 = new JPanel();
        p2 = new JPanel();
        pil1 = new JRadioButton("Pilihan 1", true);
        pil2 = new JRadioButton("Pilihan 1", false);
        pil3 = new JRadioButton("Pilihan 1", false);
        p1.add(pil1);
        p1.add(pil2);
        p1.add(pil3);
        radioGroup = new ButtonGroup();
        radioGroup.add(pil1);
        radioGroup.add(pil2);
        radioGroup.add(pil3);
        g = new JTextArea("text area");
        p2.add(g);
        JTabbedPane tab = new JTabbedPane();
        tab.add(p1, "Tab dengan Radio Button");
        tab.add(p2, "Tab dengan Text Area");
        Container c = getContentPane();
        c.add(tab, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        TestCardLayout tcl = new TestCardLayout();
        tcl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tcl.setSize(500, 100);
        tcl.setVisible(true);
    }
}
