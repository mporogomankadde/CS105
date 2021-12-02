package SwingRev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Return {

	private JFrame returnframe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Return window = new Return();
					window.returnframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Return() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		returnframe = new JFrame();
		returnframe.setTitle("Return");
		returnframe.setBounds(100, 100, 450, 300);
		returnframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		returnframe.getContentPane().setLayout(null);
		
		JLabel category = new JLabel("Category");
		category.setBounds(27, 25, 73, 24);
		returnframe.getContentPane().add(category);
		
		JLabel name = new JLabel("Name");
		name.setBounds(27, 66, 46, 14);
		returnframe.getContentPane().add(name);
		
		JLabel returndate = new JLabel("ReturnDate");
		returndate.setBounds(27, 104, 46, 14);
		returnframe.getContentPane().add(returndate);
		
		textField = new JTextField();
		textField.setBounds(138, 27, 86, 20);
		returnframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 63, 86, 20);
		returnframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 94, 86, 20);
		returnframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(47, 129, 332, 67);
		returnframe.getContentPane().add(textArea);
		
		JButton back = new JButton("BACK");
		back.setBounds(11, 227, 89, 23);
		returnframe.getContentPane().add(back);
		
		JButton exist = new JButton("EXIST");
		exist.setBounds(290, 227, 89, 23);
		returnframe.getContentPane().add(exist);
	}
}
