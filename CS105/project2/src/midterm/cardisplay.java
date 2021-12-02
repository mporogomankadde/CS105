package midterm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class cardisplay {

	public JFrame cardisplayframe;
	public JButton exist = new JButton("Exist");
    public JButton return1 = new JButton("Return");
    public JTextArea textArea = new JTextArea();
	
	public cardisplay() {
		initialize();
	}

	
	public void initialize() {
		cardisplayframe = new JFrame();
		cardisplayframe.setTitle("Car Emporium-Car Display");
		cardisplayframe.setBounds(100, 100, 450, 300);
		cardisplayframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardisplayframe.getContentPane().setLayout(null);
		
		JLabel cars = new JLabel("Cars:");
		cars.setBounds(25, 24, 46, 14);
		cardisplayframe.getContentPane().add(cars);
		
		
		textArea.setEditable(false);
		textArea.setBounds(10, 43, 414, 154);
		cardisplayframe.getContentPane().add(textArea);
		
		
		return1.setBounds(10, 227, 89, 23);
		cardisplayframe.getContentPane().add(return1);
		
		
		exist.setBounds(271, 227, 89, 23);
		cardisplayframe.getContentPane().add(exist);
	}
}
