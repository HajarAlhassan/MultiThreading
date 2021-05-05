package com.tts;

public class SimpleThread {

    static public void runFirstThread() throws InterruptedException {
        FirstThread first=new FirstThread();
        first.start();
        first.join();
    }

    static public void runSecondThread() throws InterruptedException{
       // new SecondThread("Second_Thread").start();
        SecondThread second=new SecondThread("Second_Thread");
        second.start();
        second.join();


    }

  static public void runThirdThread() throws InterruptedException{
        Thread th=new Thread(new ThirdThread("Third_Thread"));
       // new Thread(new ThirdThread("Third_thread")).start();
         th.start();
         th.join();

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is the main Thread");
        System.out.println("******************************************");
        runFirstThread();
        System.out.println("******************************************");
        runSecondThread();
        System.out.println("******************************************");
        runThirdThread();
        System.out.println("******************************************");
        System.out.println("This is the end of the main thread");
    }
}
