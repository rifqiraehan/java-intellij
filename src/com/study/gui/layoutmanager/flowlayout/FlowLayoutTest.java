package com.study.gui.layoutmanager.flowlayout;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame {
    public FlowLayoutTest() {
        super("Contoh FLow Layout");
        FlowLayout lay = new FlowLayout();
        lay.setAlignment(FlowLayout.RIGHT);
        lay.setVgap(25);
        lay.setHgap(25);
        Container c = getContentPane();
        c.setLayout(lay);
        JButton t1 = new JButton("Tombol 1");
        JButton t2 = new JButton("Tombol 2");
        JButton t3 = new JButton("Tombol 3");
        JButton t4 = new JButton("Tombol terpanjang no-4");
        JButton t5 = new JButton("Tombol 5");
        JButton t6 = new JButton("Tombol 6");
        c.add(t1);
        c.add(t2);
        c.add(t3);
        c.add(t4);
        c.add(t5);
        c.add(t6);
    }

    public static void main(String[] args) {
        FlowLayoutTest flt = new FlowLayoutTest();
        flt.setSize(500, 200);
        flt.setVisible(true);
    }
}

