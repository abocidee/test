package test;


public class RealImage implements Image {
 
	private String filename;
	
    public RealImage(String filename) {
		// TODO Auto-generated constructor stub
    	this.filename=filename;
    	loadFromDisk(filename);
	}
	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("dispaly realImage"+filename);

	}
	
	public  void loadFromDisk(String filename) {
		System.out.println("loading forjm disk"+filename);
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
    
	
	
}
