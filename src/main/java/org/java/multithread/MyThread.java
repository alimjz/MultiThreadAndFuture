package org.java.multithread;

class MyThread extends Thread {
    public void run() {
        System.out.println("This is " + Thread.currentThread().getName() + " Thread.");
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        System.out.println("This is Main Thread named: " + Thread.currentThread().getName());
    }
}
