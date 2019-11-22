package test;

public class ProxyImage implements Image {
 private String filename;
 private RealImage realImage;
 
 
	public ProxyImage(String filename) {
	super();
	this.filename=filename;
	
}


	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		if(realImage==null)
			realImage=new RealImage(filename);
		realImage.dispaly();
	}

}
