package test.Observerpatter;

public class ObserverPatterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Subject subject = new Subject();
  Observer observer=  new HexObserver(subject);
  observer= new OctalObserver(subject);
  observer = new BinaryObserver(subject);
   
   System.out.println("first state chage  15");
   
   subject.setState(15);
   observer.update();
   System.out.println("second state change 10");
   
   subject.setState(10);
   observer.update();
	}

}
