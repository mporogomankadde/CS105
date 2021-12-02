package midterm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Car {

	public JFrame carframe;
	public JButton carentry = new JButton("Car Entry");
    public JButton cardisplay = new JButton("Car Display");
    public JButton exist = new JButton("EXIST");
    
	public Car() {
		initialize();
	}

	
	public void initialize() {
		carframe = new JFrame();
		carframe.setTitle("Car Emporium");
		carframe.setBounds(100, 100, 450, 300);
		carframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carframe.getContentPane().setLayout(null);
		
		
		carentry.setBounds(41, 49, 89, 35);
		carframe.getContentPane().add(carentry);
		
		
		cardisplay.setBounds(234, 49, 89, 29);
		carframe.getContentPane().add(cardisplay);
		
		
		exist.setBounds(272, 180, 89, 23);
		carframe.getContentPane().add(exist);
	}
}
