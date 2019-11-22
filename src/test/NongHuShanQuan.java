package test;

public class NongHuShanQuan implements Cloneable {
   private String size;

public NongHuShanQuan(String size) {
	super();
	this.size = size;
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}
   

}
