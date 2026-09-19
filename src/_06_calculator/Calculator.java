package _06_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener {
	
	JPanel panel;
	JTextField field1;
	JTextField field2;
	
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
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		String f1Text = field1.getText();
		String f2Text = field2.getText();
		int num1 = Integer.parseInt(f1Text);
		int num2 = Integer.parseInt(f2Text);
		field1.setPreferredSize(new Dimension(150, 50));
		field2.setPreferredSize(new Dimension(150, 50));
		field1.setMinimumSize(new Dimension(150, 50));
		field2.setMinimumSize(new Dimension(150, 50));
		b1.setText("+");
		b2.setText("-");
		b3.setText("•");
		b4.setText("÷");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		panel.add(field1);
		panel.add(field2);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
	}	

}
