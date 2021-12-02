package midterm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class carentry {

	public JFrame carentryframe;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
    public JComboBox combobox = new JComboBox();
	public JRadioButton gas = new JRadioButton("Gas?");
    public JButton exist = new JButton("EXIST");
    public JButton return1 = new JButton("Return");
    public JButton submit = new JButton("SUBMIT");
    public JRadioButton electric = new JRadioButton("Electric");
    public JTextField textField_7;
    
	public carentry() {
		initialize();
	}

	
	public void initialize() {
		carentryframe = new JFrame();
		carentryframe.setTitle("Car Emporium-Car Entry");
		carentryframe.setBounds(100, 100, 450, 300);
		carentryframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carentryframe.getContentPane().setLayout(null);
		
		JLabel make = new JLabel("Make:");
		make.setBounds(10, 26, 57, 14);
		carentryframe.getContentPane().add(make);
		
		textField = new JTextField();
		textField.setBounds(62, 23, 86, 20);
		carentryframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel model = new JLabel("Model:");
		model.setBounds(158, 26, 46, 14);
		carentryframe.getContentPane().add(model);
		
		textField_1 = new JTextField();
		textField_1.setBounds(194, 23, 86, 20);
		carentryframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel year = new JLabel("Year:");
		year.setBounds(300, 26, 46, 14);
		carentryframe.getContentPane().add(year);
		
		textField_2 = new JTextField();
		textField_2.setBounds(338, 23, 86, 20);
		carentryframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel weight = new JLabel("Weight:");
		weight.setBounds(10, 71, 46, 14);
		carentryframe.getContentPane().add(weight);
		
		textField_3 = new JTextField();
		textField_3.setBounds(62, 68, 86, 20);
		carentryframe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		combobox.setModel(new DefaultComboBoxModel(new String[] {"Red", "Blue", "White", "Green", "Yellow", "Purple", "Black"}));
		combobox.setBounds(200, 67, 46, 22);
		carentryframe.getContentPane().add(combobox);
		
		gas.setBounds(319, 67, 109, 23);
		carentryframe.getContentPane().add(gas);
		
		JLabel tanksize = new JLabel("TankSize:");
		tanksize.setBounds(10, 120, 51, 14);
		carentryframe.getContentPane().add(tanksize);
		
		textField_4 = new JTextField();
		textField_4.setBounds(62, 117, 86, 20);
		carentryframe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel fueltype = new JLabel("Fuel Type:");
		fueltype.setBounds(158, 120, 57, 14);
		carentryframe.getContentPane().add(fueltype);
		
		textField_5 = new JTextField();
		textField_5.setBounds(216, 117, 86, 20);
		carentryframe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		
		electric.setBounds(315, 116, 109, 23);
		carentryframe.getContentPane().add(electric);
		
		JLabel batterysize = new JLabel("Battery Size:");
		batterysize.setBounds(10, 162, 69, 14);
		carentryframe.getContentPane().add(batterysize);
		
		textField_6 = new JTextField();
		textField_6.setBounds(76, 159, 86, 20);
		carentryframe.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel batterytype = new JLabel("Battery Type:");
		batterytype.setBounds(194, 162, 69, 14);
		carentryframe.getContentPane().add(batterytype);
		
		
		submit.setBounds(46, 215, 89, 23);
		carentryframe.getContentPane().add(submit);
		
		
		return1.setBounds(158, 215, 89, 23);
		carentryframe.getContentPane().add(return1);
		
		exist.setBounds(288, 215, 89, 23);
		carentryframe.getContentPane().add(exist);
		
		textField_7 = new JTextField();
		textField_7.setBounds(273, 159, 86, 20);
		carentryframe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
	}
}
