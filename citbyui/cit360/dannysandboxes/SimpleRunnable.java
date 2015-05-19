
package citbyui.cit360.dannysandboxes;


public class SimpleRunnable implements Runnable{
    int pathNum;
    int delay;
    
    public SimpleRunnable(){
        this(0,0);
    }
    
    public SimpleRunnable(int pathNum){
        this(pathNum,0);
    }
    
    public SimpleRunnable(int pathNum, int delay){
    	this.delay = delay;
    	this.pathNum = pathNum;
    }
    
       
    public void run(){
        try {
			Thread.sleep(delay);
	        System.out.println("I'm a thread from path " + pathNum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
