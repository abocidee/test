package designpattern.mvc;

public class CalculatorModel {
private int calculatorValue;

 public void add(int first,int second) {
	 this.calculatorValue=first+second;
 }
 
 public int getCalculatorValue() {
	 return this.calculatorValue;
 }
}
