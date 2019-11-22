package designpattern.abstractfactory;

public class EnemyShipFactory {
 public EnemyShip MakeEnemyShip(String type) {
	 if(type.equals("R")) {
		 return new RocketShip();
	 }else if (type.equals("B")) {
		return new BigUFOship();
	}else if(type.equals("U")) {
		return new UFOship();
	}else {
		return null;
	}
 }
}
