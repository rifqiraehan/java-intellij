package com.study.gui.form.jdialog;
import javax.swing.JDialog;
import javax.swing.JLabel;

class JDialogDemo extends JDialog {
    public JDialogDemo() {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("Ini adalah JDialog");
        setBounds(100, 100, 359, 174);
        getContentPane().setLayout(null);
        JLabel label = new JLabel("Selamat datang di JDialog");
        label.setBounds(86, 37, 175, 29);
        getContentPane().add(label);
    }

    public static void main(String[] args) {
        JDialogDemo dialog = new JDialogDemo();
        dialog.setVisible(true);
    }
}
