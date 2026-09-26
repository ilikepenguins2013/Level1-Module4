package _06_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener {
	
	JPanel panel;
	JTextField field1;
	JTextField field2;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JLabel label;
	String f1Text;
	String f2Text;
	double num1;
	double num2;
	double num3;
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.showUI();
	}
	
	void showUI() {
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(350, 150));
		frame.setMinimumSize(new Dimension(350, 150));
		panel = new JPanel();
		field1 = new JTextField();
		field2 = new JTextField();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		label = new JLabel();
		field1.setPreferredSize(new Dimension(150, 50));
		field2.setPreferredSize(new Dimension(150, 50));
		field1.setMinimumSize(new Dimension(150, 50));
		field2.setMinimumSize(new Dimension(150, 50));
		label.setMinimumSize(new Dimension(70, 30));
		label.setMinimumSize(new Dimension(70, 30));
		b1.setText("+");
		b2.setText("-");
		b3.setText("•");
		b4.setText("÷");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		label.setText("" + num3);
		panel.add(field1);
		panel.add(field2);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		try {
			f1Text = field1.getText();
			f2Text = field2.getText();
			num1 = Double.parseDouble(f1Text);
		} catch(Exception x) {
			num1 = 0;
		}
		try {
			f1Text = field1.getText();
			f2Text = field2.getText();
			num2 = Double.parseDouble(f2Text);
		} catch (Exception x) {
			num2 = 0;
		}
		if(buttonPressed == b1) {
			num3 = num1 + num2;
			label.setText("" + num3);
		}
		if(buttonPressed == b2) {
			num3 = num1 - num2;
			label.setText("" + num3);
		}
		if(buttonPressed == b3) {
			num3 = num1 * num2;
			label.setText("" + num3);
		}
		if(buttonPressed == b4) {
			num3 = num1 / num2;
			label.setText("" + num3);
		}
		
	}
}
