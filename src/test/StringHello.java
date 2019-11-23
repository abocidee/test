package test;


public class StringHello{
	public static void main(String[] args) {
		String s1="hello";
  	  if(s1=="hello") {
  		  System.out.println("s1=\"hello\"");
  	  }else {
  		 System.out.println("s1!=hello"); 
  	  }
  	  
  	  String s[][]= {{"abc","d"},{"","dd"}};
  //	  String s1[][]=new String[2][];
  	  
  	  int t1=2,t3=3;
  	  exchagne(t1, t3);
  	  System.out.println(t1);
  	  
  	  int x=5;
  	  System.out.println((x++)/3);
  	  String str= "1234";
  	  int x1=4;int y=5;
  	  System.out.println(str+(x1+y));
  	  
  	  String foo="blue";
  	  Boolean [] bar= new Boolean[1];
  	  if(bar[0]) {
  		  foo="green";
  	  }
  	  System.out.println(foo);
	}
	public static  void exchagne (int i ,int j) {
		int tmp=0;
		tmp=i;
		i=j;
		j=tmp;
	}
}