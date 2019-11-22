package test;

public class ExceptionOrder {
 public  static void methodOne(Integer i) {
	 try {
		int c=10/i;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("method");
	}finally {
		System.out.println("finally block");
	}
 }
 
 public static void main(String[] args) {
	
	try {
		methodOne(0);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("main");
	}
	
	System.out.println("finished");
}
}
