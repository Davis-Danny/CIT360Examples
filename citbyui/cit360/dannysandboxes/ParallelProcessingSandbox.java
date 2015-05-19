package citbyui.cit360.dannysandboxes;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ParallelProcessingSandbox {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// (1)happy path- create a new thread and run it
		Thread newThread = new Thread((Runnable) new SimpleRunnable(1));
		newThread.start();

		// (2)happy path- create multiple threads and run them concurrently
		try {
			int numToMake = 5;
			Thread[] manyThreads = new Thread[numToMake];
			for (int i = 0; i < numToMake; i++) {
				manyThreads[i] = new Thread((Runnable) new SimpleRunnable(2));
				manyThreads[i].start();
			}
		} catch (Throwable e) {
		}

		// (3)nasty path- create a thread but don't start it
		Thread path3Thread = new Thread(new SimpleRunnable(3));

		// (4)nasty path- create a thread and start it twice
		try {
			Thread path4Thread = new Thread(new SimpleRunnable(4));
			path4Thread.start();
			path4Thread.start();
		} catch (Throwable e) {
			System.out.println("Exception in path 4: " + e.getMessage());
		}

		// (5)nasty path- start a thread, wait for it to finish, then start it again
		try {
			Thread path5Thread = new Thread(new SimpleRunnable(5));
			path5Thread.start();
			path5Thread.join();
			path5Thread.start();
		} catch (Throwable e) {
			System.out.println("Exception in path 5: " + e.getMessage());
		}
		
		// (6)happy path- assign a new thread to the variable while it's running
		try {
			Thread path5Thread = new Thread(new SimpleRunnable(6,1000));
			path5Thread.start();
			path5Thread = new Thread(new SimpleRunnable(6,100));
			path5Thread.start();
		} catch (Throwable e) {
			System.out.println("Exception in path 6:" +  e.getMessage());
		}
		
		
		// (7)happy path- use an executor to start several threads
		try {
			Executor path7Executor = Executors.newCachedThreadPool();
			for(int i = 0;i<5;i++){
				path7Executor.execute(new SimpleRunnable(7,1000));
			}
		} catch (Throwable e) {
			System.out.println("Exception in path 7:" +  e.getMessage());
		}
		
		//sleep a few seconds to separate the paths
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {}
		
		// (8)happy path- use a fixed executor to run several threads two at a time
		try {
			Executor path8Executor = Executors.newFixedThreadPool(2);
			for(int i = 0;i<5;i++){
				path8Executor.execute(new SimpleRunnable(8,1000));
			}
		} catch (Throwable e) {
			System.out.println("Exception in path 8:" +  e.getMessage());
		}
	}

}
