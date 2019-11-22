package designpattern.singleton;


public class GetTheTiles implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
			 Singleton singleton = Singleton.getSingleton();
		     singleton.getLitterList();
		     System.out.println("hash "+System.identityHashCode(singleton));
    
     
	}

}
