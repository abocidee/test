package test.Observerpatter;

public class BinaryObserver  extends  Observer{
	

	public BinaryObserver(Subject subject) {

		this.subject=subject;
		this.subject.attach(this);// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
   System.out.println("binary String:" +Integer.toBinaryString(subject.getState()));		
	}

}
