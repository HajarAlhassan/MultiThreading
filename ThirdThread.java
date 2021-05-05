package com.tts;

public class ThirdThread implements Runnable{
    private String name;
    public String getName(){
        return name;
    }
    public ThirdThread(String name){
        this.name=name;
    }
    @Override
    public void run(){
        System.out.println(this.getName()+" Thread is starting");{
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(this.getName()+" Thread is on progress");
                    Thread.sleep(200);
                }
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(this.getName()+" Thread has finished");
        }

    }
}
