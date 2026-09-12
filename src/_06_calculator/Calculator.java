package _06_calculator;

import java.awt.Dimension;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		field1.setPreferredSize(new Dimension(50, 50));
		field2.setPreferredSize(new Dimension(50, 50));
		field1.setMinimumSize(new Dimension(50, 50));
		field2.setMinimumSize(new Dimension(50, 50));
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

}
