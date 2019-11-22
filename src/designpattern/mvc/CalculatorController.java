package designpattern.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
 private CalculatorView view;
 private CalculatorModel  model;
 
  public CalculatorController(CalculatorModel model,CalculatorView view) {
	  this.view=view;
	  this.model=model;
	  
	  this.view.addCalculationListener(new CalculatorListener());
  }
  
  public class CalculatorListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int firstNumber,secondNumber=0;
		try {
			firstNumber=view.getFirstNumber();
			secondNumber=view.getSecondNumber();
			model.add(firstNumber, secondNumber);
			
			view.setJTextField3(model.getCalculatorValue());
		} catch (NumberFormatException e2) {
			// TODO: handle exception
			view.dispalyErrorMessage("you need to enter two numbers");
		}
	}
	  
  }
}
