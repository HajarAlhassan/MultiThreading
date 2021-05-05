package com.tts;

import java.util.logging.Logger;

public class FirstThread extends Thread{
    public FirstThread(){
        setName("First_Thread");
    }
    @Override
    public void run(){
        System.out.println("The First Thread is starting");
        try{
            for(int i=0; i<10;i++){
                System.out.println("First thread is on progress");
                sleep(200);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("First Thread has finished");
    }
}
