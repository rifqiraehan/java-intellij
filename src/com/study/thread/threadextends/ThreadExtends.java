package com.study.thread.threadextends;

class Interface extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ini angka " + i);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExtends {
    public static void main(String[] args) {
        Thread view1 = new Interface();
        view1.start();
        Thread view2 = new Interface();
        view2.start();

    }
}
