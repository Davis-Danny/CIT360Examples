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
public class Sandbox2 implements Runnable {

    Random rng;

    public Sandbox2() {
        rng = new Random();
    }

    @Override
    public void run() {
        doStuff();
    }

    /*public static void main(String[] args) {
        Sandbox2 inst = new Sandbox2();
        for (int i = 0; i < 6; i++) {
            inst.doStuff();
            //newThread();
        }
    }*/

    private void print(String output) {
        System.out.println("...");
        System.out.println("Thread: " + Thread.currentThread().getName() + "::" + output);
    }

    public static void newThread() {
        Thread thread = new Thread(new Sandbox2());
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
