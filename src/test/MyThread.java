package test;

public class MyThread extends Thread {
	private Integer count=0;
   public void run() {
	   
	  add();
	  
   }
   
   public void add() {
	   for (int i = 0; i < 1000; i++) {
			count=count+1;
			System.out.println(count);
		}
   }
}
