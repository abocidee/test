package designpattern.singleton;

import java.util.List;

public class ScrabbleTest {
  public static void main(String[] args) {
	  Singleton singleton=Singleton.getSingleton();
	  System.out.println(System.identityHashCode(singleton));
	  
	  List<String>  getTiles= singleton.getTiles(7);
	  for(String s:getTiles) {
		  System.out.println(s);
	  }
	  
	  Singleton singleton2=Singleton.getSingleton();
	  List<String>  getTiles2= singleton.getTiles(7);
	  for(String s:getTiles2) {
		  System.out.println(s);
	  }
	  System.out.println(System.identityHashCode(singleton2));
	  
  }
}
