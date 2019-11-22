package inherit;

public class Main {
   
	public static void main(String[] args) {
		Animal cat= new Cat();
		Animal dog= new Dog();
		cat.setWeight(-1);
		System.out.println(cat.getWeight());
		System.out.println(((Dog) dog).getbark());
	}
}
