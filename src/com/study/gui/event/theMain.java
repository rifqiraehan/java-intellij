package com.study.gui.event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class theMain extends JFrame implements ActionListener {
    theMain() {
        setLayout(null);
        setSize(300, 200);
        setVisible(true);
        JButton b = new JButton("Klik di sini!");
        b.setBounds(25, 25, 100, 25);
        b.setVisible(true);
        add(b);
        b.addActionListener(this);
    }

    public static void main(String[] args) {
        new theMain();
    }
    @Override
    public void actionPerformed(ActionEvent args) {
        this.setTitle("Lihat judul form berubah");
    }
}
