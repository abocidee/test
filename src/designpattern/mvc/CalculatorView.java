package designpattern.mvc;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView  extends JFrame{
 private JTextField  jTextField =new JTextField(10);
 private JLabel jLabel = new JLabel("+");
 private JTextField jTextField2= new JTextField(10);
 private JButton jButton = new JButton("calculate");
 private JTextField jTextField3 = new  JTextField(10);
 
 public CalculatorView() {
	 JPanel jPanel =new JPanel();
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setSize(600, 200);
	 
	 jPanel.add(jTextField);
	 jPanel.add(jLabel);
	 jPanel.add(jTextField2);
	 jPanel.add(jButton);
	 jPanel.add(jTextField3);

	 this.add(jPanel);
 }
 
 public Integer getFirstNumber() {
	 return Integer.parseInt(jTextField.getText());
 }
 
 public Integer getSecondNumber() {
	 return Integer.parseInt(jTextField2.getText());
	
 }
 public Integer getResult() {
	 return Integer.parseInt(jTextField3.getText());
	 
 }
 
 public void setJTextField3(int result) {
	 jTextField3.setText(Integer.toString(result));
 }
 
 public void addCalculationListener(ActionListener listenerForCalculatorButton) {
	 jButton.addActionListener(listenerForCalculatorButton);
	 jTextField2.addActionListener(listenerForCalculatorButton);
	 jTextField.addActionListener(listenerForCalculatorButton);
 }
 
 public void dispalyErrorMessage(String errorMessage) {
	 JOptionPane.showMessageDialog(this, errorMessage);
 }
}
