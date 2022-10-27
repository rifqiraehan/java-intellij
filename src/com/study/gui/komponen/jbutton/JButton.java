package com.study.gui.komponen.jbutton;
import java.awt.*;
import javax.swing.*;

class ExampleJButton extends JFrame{
    private final JButton btn1, btn2;
    public ExampleJButton() {
        Container b = getContentPane();

        btn1 = new JButton("Oke");
        btn2 = new JButton("Cancel");
        b.add(btn1);
        b.add(btn2);
        setLayout(new FlowLayout());
        setSize(300, 100);
        show();
    }

    public static void main(String[] args) {
        ExampleJButton a = new ExampleJButton();
    }
}
