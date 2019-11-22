package test;

public class StudentSort implements Comparable<StudentSort> {
  private int age;

public StudentSort(int age) {
	super();
	this.age = age;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int compareTo(StudentSort o) {
	// TODO Auto-generated method stub
	return this.age-o.age;
}
  
}
