package com.tts;

public class SecondThread extends Thread{
    public SecondThread(String name){
        setName(name);
    }
    @Override
    public void run(){
        System.out.println(currentThread().getName()+" Thread is starting");
        try{
            for(int i=0;i<10;i++){
                System.out.println(currentThread().getName()+" Thread is on progress");
                sleep(200);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
