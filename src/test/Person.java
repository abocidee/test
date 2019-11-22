package test;

public class Person {
    private int i = 2;
    public Person(){
	    System.out.println("执行了构造器......");
	    System.out.println("构造器执行完的当前时间："+System.currentTimeMillis());
}/*
    public static void main(String[] args) throws IOException {
	    System.out.println(new Person().i);
	    System.out.println("创建完对象的当前时间："+System.currentTimeMillis());

}*/
}
