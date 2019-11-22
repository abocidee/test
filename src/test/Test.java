package test;

import java.io.IOException;
import java.util.HashMap;
public class Test {
   public static void main(String[] args) throws IOException {
	   
	   long  star=System.currentTimeMillis();
	   new Person();
	   Person person =new Person();
       person.notify();
	   long  end =System.currentTimeMillis();
	   System.out.println(end-star);
      }
   }