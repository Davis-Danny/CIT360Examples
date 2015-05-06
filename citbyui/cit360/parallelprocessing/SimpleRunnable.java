
package citbyui.cit360.parallelprocessing;


public class SimpleRunnable implements Runnable{
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
