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
public class BadThreadExample extends Thread {

    int num;

    /*public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                Sandbox test = new Sandbox(i);
                test.start();
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }*/

    public void run() {
        System.out.println("Thread id: " + Thread.currentThread().getName());
        System.out.println("num: " + num);
    }

    public BadThreadExample(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

}
