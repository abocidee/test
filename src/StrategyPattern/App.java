package StrategyPattern;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal animal = new Dog(new CanNotClimb());
    animal.execute();
    Animal animal2 = new Cat(new CanClimb());
    animal2.execute();
	}

}
