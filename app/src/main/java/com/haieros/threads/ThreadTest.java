package com.haieros.threads;

/**
 * Created by Kang on 2018/4/27.
 */

public class ThreadTest extends Thread{
    public ThreadTest(String threadName){
        this.setName(threadName);
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "  " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        // 启动子线程
        //new ThreadTest("new thread").start();
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                ThreadTest th = new ThreadTest("joined thread");
                th.start();
                th.join();
            }
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}
