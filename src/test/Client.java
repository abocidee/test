package test;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NongHuShanQuan nongHuShanQuan = new NongHuShanQuan("3");
    try {
		NongHuShanQuan n2 =  (NongHuShanQuan) nongHuShanQuan.clone();
		System.out.println(nongHuShanQuan);
		System.out.println(n2.getSize());
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
