package designpattern.abstractfactory;

public abstract class EnemyShip {
private String name;
private Double damage;
private Double speed;
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return this.name;
}
public void setDamage(Double damage) {
	this.damage=damage;
}
public Double getDamage() {
	return this.damage;
}
public void setSpeed(Double speed) {
	this.speed=speed;
}

public Double getSpeed() {
	return this.speed;
}
}
