package inherit;


public abstract class Animal {
private Integer weight;
private String name;
private Double height;
private Double speed;
private String sound;

//检测封装性 ，保证安全
public void setWeight(int weight) {
	if(weight<0) {
		System.out.println("重量不能小于零");
		return;
	}
	this.weight=weight;
}

 public Integer getWeight() {
	 return this.weight;
 }
 
 public abstract void  run(); 
 
}
