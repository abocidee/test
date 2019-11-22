package orderpattern;

public class BuyStock implements Order{
private Stock abc;

public BuyStock(Stock abc) {
	this.abc = abc;
}

public void execute() {
	abc.buy();
}
}
