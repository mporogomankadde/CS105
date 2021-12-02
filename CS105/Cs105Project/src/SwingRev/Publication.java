package SwingRev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Publication {

	public JFrame publicationframe;
	JTextField textField;
	private JTextField textField_2;
	public JButton add = new JButton("ADD");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Publication window = new Publication();
					window.publicationframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Publication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		publicationframe = new JFrame();
		publicationframe.setTitle("Publication");
		publicationframe.setResizable(false);
		publicationframe.setBounds(100, 100, 450, 300);
		publicationframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		publicationframe.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("Name");
		name.setBounds(50, 56, 46, 14);
		publicationframe.getContentPane().add(name);
		
		JLabel price = new JLabel("Price");
		price.setBounds(50, 143, 46, 14);
		publicationframe.getContentPane().add(price);
		
		textField = new JTextField();
		textField.setBounds(123, 53, 86, 20);
		publicationframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(123, 140, 86, 20);
		publicationframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton back = new JButton("BACK");
		back.setBounds(50, 216, 89, 23);
		publicationframe.getContentPane().add(back);
		
		JButton exist = new JButton("EXIST");
		exist.setBounds(255, 216, 89, 23);
		publicationframe.getContentPane().add(exist);
		
		
		add.setBounds(291, 139, 89, 23);
		publicationframe.getContentPane().add(add);
	}

}
