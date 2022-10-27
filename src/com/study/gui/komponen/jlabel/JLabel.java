package com.study.gui.komponen.jlabel;
import java.awt.*;
import javax.swing.*;

class ExampleJLabel extends JFrame {
    JLabel label1;
    FlowLayout fl;

    public ExampleJLabel() {
        Container b = getContentPane();
        label1 = new JLabel("Ini isi Label");
        b.add(label1);
        setLayout(new FlowLayout());
        setSize(300, 100);
        show();
    }

    public static void main(String[] args) {
        ExampleJLabel a = new ExampleJLabel();
    }
}

