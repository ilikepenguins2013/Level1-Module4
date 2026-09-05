package _03_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.*;

public class Typer implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;

	void setup(){
		frame.addKeyListener(this);
		currentLetter = generateRandomLetter();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setFont(label.getFont().deriveFont(500.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("" + currentLetter);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() == currentLetter) {
			panel.setBackground(Color.GREEN);
		}
		else {
			panel.setBackground(Color.RED);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("you typed: " + e.getKeyChar());
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}
}
