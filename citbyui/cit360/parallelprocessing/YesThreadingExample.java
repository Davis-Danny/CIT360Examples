/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit360.parallelprocessing;

import java.util.Random;

/**
 *
 * @author buzzr
 */
public class YesThreadingExample implements Runnable {

    Random rng;

    public YesThreadingExample() {
        rng = new Random();
    }

    @Override
    public void run() {
        doStuff();
    }

    public static void main(String[] args) {
        //Sandbox3 inst = new Sandbox3();
        for (int i = 0; i < 6; i++) {
            //inst.doStuff();
            newThread();
        }
    }

    private void print(String output) {
        System.out.println("...");
        System.out.println("Thread: " + Thread.currentThread().getName() + "::" + output);
    }

    public static void newThread() {
        Thread thread = new Thread(new YesThreadingExample());
        thread.start();
    }

    private void doStuff() {
        Long startTime = System.currentTimeMillis();
        print("Phase one: " + randSleep() + "ms");
        print("Phase two: " + randSleep() + " ms.");
        Long endTime = System.currentTimeMillis();
        Long totalTime = endTime - startTime;
        print("Complete: " + totalTime + "ms taken.");
    }

    private int randSleep() {
        int randInt = rng.nextInt(5000);
        try {
            Thread.sleep(randInt);
        } catch (InterruptedException e) {
            print("error: " + e);
        }
        return randInt;
    }
}
