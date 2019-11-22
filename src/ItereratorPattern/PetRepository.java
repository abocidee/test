package ItereratorPattern;

public class PetRepository  implements Container{
  private String[] pets= {
		  "facaci","rush","aoli"
  };
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new PetIterator();
	}
	
	class PetIterator implements Iterator{
   int index=0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<pets.length;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return pets[index++];
		}
		
	}

}
