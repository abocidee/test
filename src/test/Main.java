package test;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Service service= new Service();
   Thread t1 =new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Service.printA();
	}
});
   Thread t2 =new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Service.printB();
		}
	});
   Thread t3 =new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread() +"begin");
			service.printC();
			System.out.println(Thread.currentThread() +"end");
		}
	});
   t1.setName("A");
   t2.setName("B");
   t1.start();
   t2.start();
  // t3.start();
 
}
}