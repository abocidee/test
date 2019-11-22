package test;

public class Service {
     public  synchronized static void printA() {
    	 for(int i=0;i<10000;i++) {
    	 System.out.println("printAclass");
    	 }
     }
     
     public   synchronized static void printB() {
    	 for(int i=0;i<10000;i++) {
    	 System.out.println("printBclass");
    	 }
     }
     
     public  synchronized void printC() {
    	 System.out.println("print c class");
     }
}
