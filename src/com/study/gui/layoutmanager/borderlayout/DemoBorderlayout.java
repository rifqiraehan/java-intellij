package com.study.gui.layoutmanager.borderlayout;
import javax.swing.*;
import java.awt.*;

public class DemoBorderlayout extends JFrame {
    private final JButton tombol[];
    private final String names[] = {
            "Tombol Utara",
            "Tombol Selatan",
            "Tombol Timur",
            "Tombol Barat",
            "Tombol Pusat",
    };

    private final BorderLayout lout;
    public DemoBorderlayout() {
        super("Ini adalah contoh border layout");
        Container c = getContentPane();
        lout = new BorderLayout(10, 10);
        c.setLayout(lout);
        tombol = new JButton[names.length];
        for (int i = 0; i < names.length; i++) {
            tombol[i] = new JButton(names[i]);
        }
        c.add(tombol[0], BorderLayout.NORTH);
        c.add(tombol[1], BorderLayout.SOUTH);
        c.add(tombol[2], BorderLayout.EAST);
        c.add(tombol[3], BorderLayout.WEST);
        c.add(tombol[4], BorderLayout.CENTER);
        setSize(500, 300);
    }

    public static void main(String[] args) {
        DemoBorderlayout dbl = new DemoBorderlayout();
        dbl.setVisible(true);
        dbl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

