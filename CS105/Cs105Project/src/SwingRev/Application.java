package SwingRev;

import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Application {
	private static Lib lib;
	private static Borrow borrow;
	private static Member member;
	private static Publication publication;
	private static Return return1 ;
	private static ArrayList<String> arr=new ArrayList<>();
	private static ArrayList<String> arr2=new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					 lib= new Lib();
					 borrow =new Borrow();
					 member= new Member();
					 publication= new Publication();
					 return1 =new Return();
					
					lib.libframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				//new member buttom
				lib.nmember.addActionListener( new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						lib.libframe.setVisible(false);
						member.memberframe.setVisible(true);
						
						member.add.addActionListener( new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								String   s1=  member.textField.getText();
								arr.add(s1);
								
								member.textField.setText("");
								JOptionPane.showMessageDialog(member.add, "Added!");
								}
							
						}); 
						
						}
					
				});
				lib.npubl.addActionListener( new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						lib.libframe.setVisible(false);
						publication.publicationframe.setVisible(true);
						
						publication.add.addActionListener( new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								String   s1=  publication.textField.getText();
								arr2.add(s1);
								
								publication.textField.setText("");
								JOptionPane.showMessageDialog(publication.add, "Added!");
								
								}
						});
					
						}	
				});
				
				lib.borrow.addActionListener( new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						lib.libframe.setVisible(false);
						borrow.borrowframe.setVisible(true);
						
						borrow.take.addActionListener( new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								String   s1=  borrow.textField_1.getText();
								if(arr2.contains(s1)) {
									arr2.remove(s1);
								}else
									System.out.println("that book is not available sorry!!");
								
								borrow.textField_1.setText("");
								JOptionPane.showMessageDialog(borrow.take, "Taken!");
								
								}
						});
					
						}	
				});
				
				
				
			}
		});
	}
	
	 

}
