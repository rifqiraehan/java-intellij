package com.study.gui.komponen.jmenubar;

import java.awt.*;
import javax.swing.*;

public class ExampleJMenuBar extends JFrame {
    private final JMenuBar menu;
    private final JMenu file, help;
    private final JMenuItem newMenu, openMenu, exitMenu, helpMenu;
    public ExampleJMenuBar() {
        Container b = getContentPane();
        menu = new JMenuBar();
        file = new JMenu("File");
        help = new JMenu("Help");
        newMenu = new JMenuItem("New");
        openMenu = new JMenuItem("Open");
        exitMenu = new JMenuItem("Exit");
        helpMenu = new JMenuItem("Help");
        setJMenuBar(menu);
        menu.add(file);
        menu.add(help);
        file.add(newMenu);
        file.add(openMenu);
        file.addSeparator();
        file.add(exitMenu);
        help.add(helpMenu);
        setLayout(new FlowLayout());
        setSize(300, 200);
        show();
    }

    public static void main(String[] args) {
        ExampleJMenuBar mb = new ExampleJMenuBar();
    }
}
