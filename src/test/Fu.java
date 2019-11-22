package test;

public class Fu {
public static void show() {
	System.out.println("fu static");

  
}
public void getup() {
	System.out.println("getup fu");
}

public static void main(String[] args) {
	Fu fu= new zi();
	fu.getup();
	
}
}

class zi extends Fu {
	public static void show() {
		System.out.println("zi static");

	  
	}
	public void getup() {
		System.out.println("zi getup");
	}
	
	
	
}

