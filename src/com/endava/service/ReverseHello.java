package com.endava.service;

/**
 * Created by sbogdanschi on 5/04/2017.
 */
public class ReverseHello extends Thread{
    private int orderNumber;
    private Thread previous;
    private static int counter = 0;

    public ReverseHello(){
        //empty constructor
    }

    public ReverseHello(int currentThreadNum, Thread other){
        this.orderNumber = currentThreadNum;
        this.previous = other;
    }

    @Override
    public void run() {
       // assert counter != 51;
        orderNumber = counter;
        counter++;
        if (counter < 50) {
            new ReverseHello(orderNumber, Thread.currentThread()).start();
            while(true){
                synchronized (this){
                    try{
                        wait();
                        break;
                    } catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
            }
        }
        System.out.println("Hello from Thread " + orderNumber + "       " + Thread.currentThread());

        if(previous != null){
            synchronized (previous){
                previous.notify();
            }
        }
    }
}
