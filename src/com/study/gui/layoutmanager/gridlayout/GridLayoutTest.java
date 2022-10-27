package com.study.gui.layoutmanager.gridlayout;
import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {
    private final JButton tombol[];
    private final String m[] = {
            "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam"
    };
    private final Container c;
    private final GridLayout g;
    public GridLayoutTest() {
        super("Demonstrasi GridLayout");
        g = new GridLayout(2, 3, 5, 5);
        c = getContentPane();
        c.setLayout(g);
        tombol = new JButton[m.length];
        for (int i = 0; i < m.length; i++) {
            tombol [i] = new JButton(m[i]);
            c.add(tombol[i]);
        }
        setSize(300, 300);
        show();
    }

    public static void main(String[] args) {
        GridLayoutTest glt = new GridLayoutTest();
    }
}
