package midterm;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Application {
	private static Car car;
	private static CarC carc; 
	private static cardisplay cardisplay;
	private static carentry carentry;
	private static ArrayList<CarC> al=new ArrayList<>();
	
	public static void main(String[] args) { 
		/// file reader
	File f= new File("C:\\Users\\Ronnie..T\\Desktop\\advice\\carobj.text");
	if(f.isFile() && f.canRead()) {
		try {
			FileInputStream fi=new FileInputStream(f);
			ObjectInputStream oi= new ObjectInputStream(fi);
			al=(ArrayList<CarC>) oi.readObject();
			oi.close();
			fi.close();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} 
	}
		
		EventQueue.invokeLater(new Runnable() {

			
			
			
			
			public void run() {
				car= new Car();
				cardisplay=new cardisplay();
				carentry=new carentry();
				try {
					car.carframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
// exist method				
				car.exist.addActionListener(new ActionListener() {
			      @Override
					public void actionPerformed(ActionEvent e) {
						exist();	
					}	
				});
				
				
				
				
				cardisplay.exist.addActionListener(new ActionListener() {
				      @Override
						public void actionPerformed(ActionEvent e) {
							exist();	
						}	
					});
	//// return button 			
				cardisplay.return1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						cardisplay.cardisplayframe.setVisible(false);
						car.carframe.setVisible(true);
					}
				});
		
				
				car.carentry.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						car.carframe.setVisible(false);
						carentry.carentryframe.setVisible(true);
					}
				});
				
				carentry.return1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						carentry.carentryframe.setVisible(false);
						car.carframe.setVisible(true);
					}
				});
				
				carentry.exist.addActionListener(new ActionListener() {
				      @Override
						public void actionPerformed(ActionEvent e) {
							exist();	
						}	
					});
				
				carentry.gas.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						carentry.electric.setSelected(false);
						carentry.textField_6.setEnabled(false);
						carentry.textField_7.setEnabled(false);
						
						carentry.gas.setSelected(true);
						carentry.textField_4.setEnabled(true);
						carentry.textField_5.setEnabled(true);
						
					}
					
				});
			
				carentry.electric.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						carentry.gas.setSelected(false);
						carentry.textField_4.setEnabled(false);
						carentry.textField_5.setEnabled(false);
						carentry.electric.setSelected(true);
						carentry.textField_6.setEnabled(true);
						carentry.textField_7.setEnabled(true);
						
					}
					
				});
			
				
				
				
////////////submit///////////////////////////////////////////////////////////////////////////		
				carentry.submit.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(carentry.textField.getText().isBlank() ||carentry.textField.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Make cant not be Empty");
							return;
						}
						
						if(carentry.textField_1.getText().isBlank() ||carentry.textField_1.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Model cant not be Empty");
							return;
						}
						
						if(carentry.textField_2.getText().isBlank() ||carentry.textField_2.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Year cant not be Empty");
							return;
						}

						if(carentry.textField_3.getText().isBlank() ||carentry.textField_3.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Weight cant not be Empty");
							return;
						}
						
						
						
						int year=0;
						int weight=0;
						int tanksize=0;
						int batterysize=0;
						
						
						try {
							if((Integer.parseInt(carentry.textField_2.getText())>0)){	
							year=Integer.parseInt(carentry.textField_2.getText());
							}else {
								JOptionPane.showMessageDialog(carentry.submit, "Year should be graeter than zero");
								return;
							}
									
								}catch(Exception e1) {
									JOptionPane.showMessageDialog(carentry.submit, "Year should be numerical");
									return;	
								}
							
							
							try {
								if((Integer.parseInt(carentry.textField_3.getText())>0)){	
								weight=Integer.parseInt(carentry.textField_3.getText());
								}else {
									JOptionPane.showMessageDialog(carentry.submit, "Weight should be graeter than zero");
									return;
								}
										
									}catch(Exception e1) {
										JOptionPane.showMessageDialog(carentry.submit, "Weight should be numerical");
										return;	
									}
						
						
						if(carentry.gas.isSelected()) {
							
							
							if(carentry.textField_4.getText().isBlank() ||carentry.textField_4.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "TankSize cant not be Empty");
								return;
							}
							
							if(carentry.textField_5.getText().isBlank() ||carentry.textField_5.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Fuel Type cant not be Empty");
								return;
							}
							
							
							try {
								if((Integer.parseInt(carentry.textField_4.getText())>0)){	
								tanksize=Integer.parseInt(carentry.textField_4.getText());
								}else {
									carentry.textField_4.setText("");
									JOptionPane.showMessageDialog(carentry.submit, "Tanksize should be graeter than zero");
									carentry.textField_4.setText("");
									return;
									
								}
										
									}catch(Exception e1) {
										carentry.textField_4.setText("");
										JOptionPane.showMessageDialog(carentry.submit, "Tanksize should be numerical");
										return;	
									}
							CarC c1= new Gas (carentry.textField.getText(),carentry.textField.getText(),year,weight,carentry.combobox.getSelectedItem().toString(),tanksize,carentry.textField_5.getText());
							al.add(c1);	
							
							
						}
						if(carentry.electric.isSelected()) {
							
							if(carentry.textField_6.getText().isBlank() ||carentry.textField_6.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Battery Size cant not be Empty");
								return;
							}
							
							if(carentry.textField_7.getText().isBlank() ||carentry.textField_7.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Battery Type cant not be Empty");
								return;
							}
							try {
								if((Integer.parseInt(carentry.textField_6.getText())>0)){	
								batterysize=Integer.parseInt(carentry.textField_6.getText());
								}else {
									JOptionPane.showMessageDialog(carentry.submit, "BatterySize should be graeter than zero");
									return;
								}
										
									}catch(Exception e1) {
										JOptionPane.showMessageDialog(carentry.submit, "BatterySize should be numerical");
										return;	
									}
							
						CarC c1= new Electric (carentry.textField.getText(),carentry.textField.getText(),year,weight,carentry.combobox.getSelectedItem().toString(),batterysize,carentry.textField_7.getText());
							al.add(c1);	
						}
						
						
						
						
						carentry.textField.setText("");
						carentry.textField_1.setText("");
						carentry.textField_2.setText("");
						carentry.textField_3.setText("");
						carentry.textField_4.setText("");
						carentry.textField_5.setText("");
						carentry.textField_6.setText("");
						carentry.textField_7.setText("");
						JOptionPane.showMessageDialog(carentry.submit, "Added Successfully!");	
						
					}
					
				 });
				
				car.cardisplay.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
					car.carframe.setVisible(false);
					cardisplay.cardisplayframe.setVisible(true);
					 
					String res="";
					for(CarC i:al){
						res+=i+"\n*****"+"\n";	
					}
					cardisplay.textArea.setText(res); 
					
					}
				});
				
				
				
				
///// stay above******************************				
			}
			void exist() {
				try {
					FileOutputStream fi = new FileOutputStream("C:\\Users\\Ronnie..T\\Desktop\\advice\\carobj.text");
					ObjectOutputStream oi= new ObjectOutputStream(fi);
					
					oi.writeObject(al);
					oi.close();
					fi.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.exit(0);
		}
		
			
		});
		
		 
		
	 }
	////************* out of the main method
	
}
