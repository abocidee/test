package designpattern.singleton;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;




public class Singleton {
    private static Singleton  singleton=null;
    private Singleton() {}
    
    String[] scrabbleletters = new String[] {
    	"a","a","a",
    	"b","b","b",
    	"c","c","c",
    	"d","d","d",
    	"e","e","e",
    	"e","e","e",
    	"f","f","f",
    	"g","g","g",
    	"h","h","h",
    	"i","i","i",
    	"j","j","j",
    	"k","k","k",
    	"l","l","l",
    };
    
    List<String> letterList = new LinkedList<>(Arrays.asList(scrabbleletters));
    
    static  boolean firstThread = true;
    public static synchronized Singleton getSingleton() {
    	synchronized (Singleton.class) {
    	if(singleton==null) {
    		if(firstThread) {
    			firstThread = false;
    			Thread.currentThread();
    			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    			singleton=new Singleton();
    		
    	}
    	}
    	
    	
    	return singleton;
    }
    
    
    public List<String> getLitterList(){
    	return singleton.letterList;
    }
    
    public List<String> getTiles(int howManyTiles){
    	List<String>  list = new LinkedList<String>();
    	
    	for(int i =0;i<howManyTiles;i++) {
    		list.add(singleton.letterList.remove(0));
    		 
    	}
    	
    	return list;
    }
}
