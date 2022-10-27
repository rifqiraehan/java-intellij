package com.study.gui.komponen.jcombobox;
import java.awt.*;
import javax.swing.*;

public class ExampleJComboBox extends JFrame {
    private final JComboBox cbx;
    public ExampleJComboBox() {
        Container a = getContentPane();
        String[] items = {
                "method",
                "class",
                "package",
                "attribute"
        };
        cbx = new JComboBox(items);

        a.setLayout(new FlowLayout());
        a.add(cbx);
        a.add(new JScrollPane(cbx));
        setSize(300, 190);
        show();
    }

    public static void main(String[] args) {
        ExampleJComboBox x = new ExampleJComboBox();
    }
}
