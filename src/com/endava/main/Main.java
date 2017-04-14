package com.endava.main;

import com.endava.service.ReverseHello;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

/**
 * Created by sbogdanschi on 5/04/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++)
//            array[i] = (int)(20 + Math.random() * 1000);
//
//        int maxValue = MaxValue.findMax(array);
//
//
//        System.out.println("MaxValue: " + maxValue);
//       // Arrays.sort(array);
//        Arrays.stream(array).forEach(System.out::println);

        ReverseHello reverseHello = new ReverseHello();
        reverseHello.start();


        AtomicInteger atomicInteger = new AtomicInteger(0);
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 4000; i++){
                atomicInteger.incrementAndGet();
            }
        });
        thread.start();

        sleep(1000);
        System.out.println(atomicInteger);
    }
}
