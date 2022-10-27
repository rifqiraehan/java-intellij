package com.study.thread.sinkronisasi;

class TableX{
    void printTable(int n){//method not synchronized
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class ThreadA extends Thread{
    Table t;
    ThreadA(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class ThreadB extends Thread{
    Table t;
    ThreadB(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class NoSync{
    public static void main(String args[]){
        Table obj = new Table(); //only one object
        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);
        t1.start();
        t2.start();
    }
}