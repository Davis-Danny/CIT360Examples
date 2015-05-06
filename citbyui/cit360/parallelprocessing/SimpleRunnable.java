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
public class SimpleRunnable {
    int pathNum;
    
    public SimpleRunnable(){
        pathNum = 0;
    }
    
    public SimpleRunnable(int pathNum){
        this.pathNum = pathNum;
    }
    
       
    public void run(){
        System.out.println("I'm a thread from path " + pathNum);
    }
}
