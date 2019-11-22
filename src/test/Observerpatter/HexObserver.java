package test.Observerpatter;


public class HexObserver extends Observer {
	
	 public HexObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		 this.subject=subject;
		 this.subject.attach(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
    System.out.println("hex string :"+Integer.toHexString(subject.getState()));
	}

}
