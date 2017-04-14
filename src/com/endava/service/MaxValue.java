package com.endava.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sbogdanschi on 5/04/2017.
 */
public class MaxValue extends Thread{
    private static int THREAD_COUNT = 4;
    private int[] array;
    private int start, end;
    public static int maxV;

    public MaxValue() {
    }

    public MaxValue(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int max = array[start];
        for(int i = start; i < end; i++)
            if(max < array[i])
                max = array[i];

        if(maxV < max) {
            maxV = max;
        }
    }

    public static int findMax(int[] array) throws InterruptedException{
        assert array.length > 3;
        int length = array.length;

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0; i < THREAD_COUNT; i++) {
            executorService.execute(new MaxValue(array, (i * length) / 4, ((i + 1) * length) / 4));
        }

        sleep(1000);

        executorService.shutdown();
        return  maxV;
    }
}
