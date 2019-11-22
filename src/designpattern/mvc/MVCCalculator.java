package designpattern.mvc;

public class MVCCalculator {
 public static void main(String[] args) {
	CalculatorModel model = new CalculatorModel();
	CalculatorView view =new CalculatorView();
	CalculatorController calculatorController = new CalculatorController(model, view);
     
	view.setVisible(true);
 }
}
