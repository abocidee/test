package test;


public class FoodFactory {
  public FoodFactory() {
	  
  }
  
  public static Food getA() {
	  return new A();
  }
  public static Food getB() {
	  return new B();
  }
  public static Food getC() {
	  return new C();
  }
  
  public static Food get(String name) {
	  if(name.equals("A")) {
		  return FoodFactory.getA();
	  }else if(name.equals("B")) {
		  return FoodFactory.getB();
	  }else if(name.equals("C")) {
		return FoodFactory.getC();
	}else {
		return null;
	}
  }
  
}
