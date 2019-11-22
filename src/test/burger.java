package test;

public abstract class burger implements Item {

	public abstract String name() ;
	
    
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	public abstract float price() ;

}
