package ItereratorPattern;

public class NameRepository implements Container {
public String names[]= {
		"robert","jone","lunongyun","liwanting","zhangsanfeng"
};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{
   
		int index=0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index<names.length)return true;
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
		
	}

}
