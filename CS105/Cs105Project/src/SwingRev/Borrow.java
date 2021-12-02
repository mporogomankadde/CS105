package SwingRev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class Borrow {

	public JFrame borrowframe;
	JTextField textField_1;
	private JTextField textField_2;
	public JButton take = new JButton("TAKEN");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Borrow window = new Borrow();
					window.borrowframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Borrow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public  void initialize() {
		borrowframe = new JFrame();
		borrowframe.setTitle("borrow");
		borrowframe.setBounds(100, 100, 450, 300);
		borrowframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borrowframe.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("Name");
		name.setBounds(38, 75, 46, 14);
		borrowframe.getContentPane().add(name);
		
		JLabel date = new JLabel("Take date");
		date.setBounds(38, 114, 60, 23);
		borrowframe.getContentPane().add(date);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 72, 86, 20);
		borrowframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 115, 86, 20);
		borrowframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton back = new JButton("BACK");
		back.setBounds(38, 185, 89, 23);
		borrowframe.getContentPane().add(back);
		
		JButton exist = new JButton("EXIST");
		exist.setBounds(275, 185, 89, 23);
		borrowframe.getContentPane().add(exist);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"cd", "book", "magazine"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(1);
		list.setSelectedIndices(new int[] {2});
		list.setBounds(315, 75, 49, -44);
		borrowframe.getContentPane().add(list);
		
		take.setBounds(302, 114, 89, 23);
		borrowframe.getContentPane().add(take);
	}
}
