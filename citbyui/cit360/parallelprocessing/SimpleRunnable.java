
package citbyui.cit360.parallelprocessing;


public class SimpleRunnable implements Runnable{
    int pathNum;
    int delay;
    
    public SimpleRunnable(){
        pathNum = 0;
        delay = 0;
    }
    
    public SimpleRunnable(int pathNum){
        this.pathNum = pathNum;
        delay = 0;
    }
    
    public SimpleRunnable(int pathNum, int delay){
    	this.delay = delay;
    }
    
       
    public void run(){
        System.out.println("I'm a thread from path " + pathNum);
        try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
