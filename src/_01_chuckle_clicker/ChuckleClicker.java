package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JOptionPane;

public class ChuckleClicker {

	public static void main(String[] args) {
		makeButtons();
	}
	
	public static void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		button1.setText("joke");
		button2.setText("joke");
		button1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {
			joke(""};
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}});
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();

	}

}
