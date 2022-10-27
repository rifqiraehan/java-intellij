package com.study.gui.layoutmanager.boxlayout;

import javax.swing.*;
import java.awt.*;

public class ContohBoxLayout extends JFrame {
    public ContohBoxLayout() {
        super("Contoh Box Layout dalam satu baris");
        Container c = getContentPane();
        Box box = new Box(BoxLayout.X_AXIS);
        JTextArea t1 = new JTextArea("PBO XI", 10, 15);
        JButton b1 = new JButton("Tombol 1");
        JButton b2 = new JButton("Tombol 2");
        JTextArea t2 = new JTextArea("PBO XII", 10, 15);
        box.add(new JScrollPane(t1));
        box.add(b1);
        box.add(b2);
        box.add(new JScrollPane(t2));
        c.add(box);
    }

    public static void main(String[] args) {
        ContohBoxLayout cbl = new ContohBoxLayout();
        cbl.setSize(300, 300);
        cbl.setVisible(true);
        cbl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
