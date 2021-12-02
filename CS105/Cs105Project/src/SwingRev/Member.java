package SwingRev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Member {

	 public JFrame memberframe;
	JTextField textField;
	public JButton add = new JButton("ADD");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member window = new Member();
					window.memberframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Member() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		memberframe = new JFrame();
		memberframe.setTitle("New Member");
		memberframe.setBounds(100, 100, 450, 300);
		memberframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		memberframe.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("Name");
		name.setBounds(23, 31, 52, 29);
		memberframe.getContentPane().add(name);
		
		textField = new JTextField();
		textField.setBounds(103, 35, 86, 20);
		memberframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton back = new JButton("Back");
		back.setBounds(33, 173, 86, 39);
		memberframe.getContentPane().add(back);
		
		JButton exist = new JButton("Exist ");
		exist.setBounds(251, 173, 86, 39);
		memberframe.getContentPane().add(exist);
		
		
		add.setBounds(248, 34, 89, 23);
		memberframe.getContentPane().add(add);
	}
}
