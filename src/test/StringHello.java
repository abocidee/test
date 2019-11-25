package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class StringHello{
	private String point;
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
  	  if(bar[0]=true) {
  		  foo="green";
  	  }
  	  System.out.println(foo);
      File file = new File("/Users/abocide/Documents/卢俊杰.txt");
      FileInputStream fileInputStream;
	try {
		fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	  	BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
	  	String strr=null;
	  	try {
			while((strr=bufferedReader.readLine())!=null) {
				System.out.println(strr);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	
	 }
	public static  void exchagne (int i ,int j) {
		int tmp=0;
		tmp=i;
		i=j;
		j=tmp;
	}
}