package citbyui.cit360.parallelprocessing;

public class RealSandbox {

	public static void main(String[] args) {

		// (1)happy path- create a new thread and run it
		Thread newThread = new Thread((Runnable) new SimpleRunnable(1));
		newThread.start();

		// (2)happy path- create multiple threads and run them concurrently
		int numToMake = 5;
		Thread[] manyThreads = new Thread[numToMake];
		for (int i = 0; i < numToMake; i++) {
			manyThreads[i] = new Thread((Runnable) new SimpleRunnable(2));
			manyThreads[i].start();
		}

		// (3)nasty path- create a thread but don't start it
		Thread path3Thread = new Thread(new SimpleRunnable(3));

		// (4)- create a thread and start it twice
		try {
			Thread path4Thread = new Thread(new SimpleRunnable(4));
			path4Thread.start();
			path4Thread.start();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		
		//try/catch template
		try {
			
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}
	

}
