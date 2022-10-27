package com.study.thread.cashier;

class Cashier {
    public static void main(String[] args) {
        String namaThreadUtama = Thread.currentThread().getName();
        System.out.println("Nama thread utama : " + namaThreadUtama);

        Thread kasirBaru = new Thread(new KasirBaru());
        kasirBaru.start();

        // kasir lama melayani pembeli nomor 1 sampai 6
        for (int pembeli = 1; pembeli <= 6; pembeli++) {
            System.out.println(namaThreadUtama + " melayani pembeli nomor " + pembeli);
        }
        System.out.println();
    }
}


class KasirBaru implements Runnable {

    @Override
    public void run() {
        String namaThreadBaru = Thread.currentThread().getName();
        System.out.println("Nama thread baru : " + namaThreadBaru);

        // kasir baru melayani pembeli nomor 7 sampai 12
        for (int pembeli = 7; pembeli <= 12; pembeli++) {
            System.out.println(namaThreadBaru + " melayani pembeli nomor " + pembeli);
        }
    }

}