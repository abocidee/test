package ItereratorPattern;

public class IteratorpatternDemo {
  public static void main(String[] args) {
	Container nameRepository= new PetRepository();
	Iterator iterator =nameRepository.getIterator();
	while(iterator.hasNext()) {
		 System.out.println(iterator.next());
	}
	 

}
}
 