/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit360.parallelprocessing;

/**
 *
 * @author buzzr
 */
public class RealSandbox {

    public static void main(String[] args) {

        //happy path- create a new thread and run it
        Thread newThread = new Thread((Runnable) new SimpleRunnable());
        newThread.start();

        //happy path- create multiple threads and run them concurrently
        int numToMake = 5;
        Thread[] manyThreads = new Thread[numToMake];
        for (int i = 0; i < numToMake; i++) {
           manyThreads[i] = new Thread((Runnable) new SimpleRunnable());
           manyThreads[i].start();
        }
       
    }

}
