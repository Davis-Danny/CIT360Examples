/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit360.parallelprocessing;

public class SillyThreadExample extends Thread{
	public void run(){
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread id: "
                               +Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(100);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*public static void main(String[] args){
        	for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
           		 SillyThreadExample aSillyThread =  new SillyThreadExample();
           		 aSillyThread.start();
       		 }
	}*/
}