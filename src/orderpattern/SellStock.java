package orderpattern;

public class SellStock implements Order{
private Stock abc;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abc.sell();
	}
	public SellStock(Stock abc) {
		this.abc = abc;
	}
 
	
}
