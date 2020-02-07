package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons{
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		addNumbers.addActionListener((ActionEvent e)->{
			if (e.getSource() == addNumbers) {
				System.out.println("2+2=4");
			}
		});

		randNumber.addActionListener((ActionEvent e)->{
			Random rand = new Random();
			if (e.getSource() == randNumber) {
				System.out.println(rand.nextInt(10));
			}
		});
		
		tellAJoke.addActionListener((ActionEvent e)->{
			if (e.getSource() == tellAJoke) {
				System.out.println("Why is 6 afraid of 7, becuase 789");
			}
		});
		
		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.

		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}
}
