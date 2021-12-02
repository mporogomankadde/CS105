package SwingRev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lib {
      
	
	public JButton nmember = new JButton("New member");
	public JButton npubl = new JButton("New Publicity");
	public JButton borrow = new JButton("Borrow..");
	JButton bring = new JButton("bringback");
	public JFrame libframe;
    
	
	public Lib() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		libframe = new JFrame();
		libframe.setAlwaysOnTop(true);
		libframe.setTitle("Library");
		libframe.setBounds(100, 100, 450, 300);
		libframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libframe.getContentPane().setLayout(null);
		
		
		nmember.setBounds(50, 56, 121, 44);
		libframe.getContentPane().add(nmember);
		
		
		npubl.setBounds(241, 56, 121, 44);
		libframe.getContentPane().add(npubl);
		
		
		borrow.setBounds(82, 138, 89, 23);
		libframe.getContentPane().add(borrow);
		
		
		bring.setBounds(241, 138, 89, 23);
		libframe.getContentPane().add(bring);
		
		JButton exist = new JButton("EXIST");
		exist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		exist.setBounds(335, 227, 89, 23);
		libframe.getContentPane().add(exist);
	}
}
