package StrategyPattern;

public abstract  class Animal {
private Climb climb;


 
 public Animal(Climb climb) {
	super();
	this.climb = climb;
}



public  void execute(){
     climb.climb();
 }

}
