package designpattern.abstractfactory;

import java.util.Scanner;





public class EnemyShipTesting {
	public static void main(String[] args) {
		  EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		   EnemyShip enemyShip=null;
		  System.out.println("enter the ship type");
		   Scanner scanner = new Scanner(System.in);
		   
		   if(scanner.hasNextLine()) {
			   String type=scanner.nextLine();
			   enemyShip=enemyShipFactory.MakeEnemyShip(type);
			   if(enemyShip!=null) {
			   doStuffEnemy(enemyShip);
			   }
		   }else {
			   System.out.println("please enter R /B  /U next time");
		   }
	}

	private static void doStuffEnemy(EnemyShip enemyShip) {
		// TODO Auto-generated method stub
		System.out.println(enemyShip.getName());
		System.out.println(enemyShip.getDamage());
		System.out.println(enemyShip.getSpeed());
	}
 
}
