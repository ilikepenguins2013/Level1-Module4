package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	 void makeButtons() {
		button1.setText("joke");
		button2.setText("punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();

	}
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				JOptionPane.showMessageDialog(null, "I told my doctor that I broke my arm in two places,");
			}
			else if(e.getSource() == button2) {
				JOptionPane.showMessageDialog(null, "He told me not to go to those places.");
			}
		}

}
