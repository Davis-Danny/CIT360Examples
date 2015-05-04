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
public class Sandbox extends Thread {

    int num;
    public void run() {
        System.out.println("Thread id: " + Thread.currentThread().getName());
        System.out.println("num: "+num);
    }
    
    public Sandbox(int num){
        this.num = num;
    }
    
    public int getNum(){
        return num;
    }

    /*public static void main(String[] args) throws InterruptedException {
        int num = 0;
        for (int i = 0; i < 5; i++) {
            Sandbox test = new Sandbox(i);
            test.start();
            Thread.sleep(5);
        }
    }*/
}
