package com.study.thread.interfacerunnable;

class Interface implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ini angka " + i);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}

public class InterfaceRunnable {
    public static void main(String[] args) {
        Thread  view1 = new Thread(new Interface());
        view1.start();
        Thread view2 = new Thread(new Interface());
        view2.start();


    }
}
