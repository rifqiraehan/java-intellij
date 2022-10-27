package com.study.gui.form.jframes;
import javax.swing.JFrame;

class iniJFrame {
    private final JFrame contohFrame;
    public iniJFrame() {
        contohFrame = new JFrame("Contoh JFrame");
    }

    public void launchFrame() {
        contohFrame.setSize(400, 300);
        contohFrame.setResizable(false);
        contohFrame.setVisible(true);
    }

    public static void main(String[] args) {
        iniJFrame a = new iniJFrame();
        a.launchFrame();
    }
}

