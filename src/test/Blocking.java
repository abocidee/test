package test;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Blocking  {
private static BlockingQueue<Integer>  queue= new ArrayBlockingQueue<Integer>(10);
Object object1 =new Object();
  public static void main(String[] args) {
	 Thread t1 =new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			producer();
		
			
		}
	    });
	 
	 Thread t2 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				consumer();
			}

			
		    });
	 t1.start();
	 t2.start();
	 try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  }
  private  static void producer() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				if (queue.size()==10) {
					
				}
			queue.put(new Random().nextInt());
			Thread.sleep(1000);
			System.out.println("producer"+queue.size() );
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  private static void consumer() {
		// TODO Auto-generated method stub
		try {
			while(true) {
			queue.take();
			Thread.sleep(1000);
			System.out.println("consumer"+queue.size());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
