package StrategyPattern;
public interface Climb{
  void climb();
}

class CanClimb implements  Climb{
 
  public void climb(){
  
  System.out.println("can climb");
  }

}

class CanNotClimb implements Climb{

 public void climb()	{
 System.out.println("cant climb");
}
 

}
