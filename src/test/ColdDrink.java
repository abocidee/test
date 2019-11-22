package test;

public abstract class ColdDrink implements Item {
public abstract String name() ;
	
    
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	public abstract float price() ;
}
