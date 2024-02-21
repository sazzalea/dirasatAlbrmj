package org.zaza.experiment;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;

public class FirstGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("First GUI App");
		
		JButton buttonClick = new JButton("click");
		buttonClick.setBounds(130, 100, 100, 40);
		frame.add(buttonClick);

		JLabel lblID = new JLabel("ID: ");
		JLabel lblName = new JLabel("Nama: ");
		JLabel lblClass = new JLabel("Kelas: ");
		lblID.setBounds(110, 150, 100, 40);
		lblName.setBounds(90, 190, 100, 40);
		lblClass.setBounds(90, 230, 100, 40);
		frame.add(lblID);
		frame.add(lblName);
		frame.add(lblClass);
		
		JTextField textID = new JTextField();
		JTextField textName = new JTextField();
		JTextField textClass = new JTextField();
		textID.setBounds(130, 150, 200, 40);
		textName.setBounds(130, 190, 200, 40);
		textClass.setBounds(130, 230, 200, 40);
		frame.add(textID);
		frame.add(textName);
		frame.add(textClass);
		
		buttonClick.addActionListener(new ActionListener(){
			 
			 public void actionPerformed(ActionEvent e){  
						 textID.setText(" ");  
//			             textName.setText(" ");  
						 JOptionPane.showMessageDialog(frame, "Hello!");
			         }  
			     });  
		
//		JTextArea textArea = new JTextArea("Welcome to Javapoint.");
//		textArea.setBounds(130, 400, 210, 100);
//		frame.add(textArea);
		
		JPasswordField Password = new JPasswordField();
		JLabel labelPassword = new JLabel("PASSWORD:");
		labelPassword.setBounds(51, 270, 200, 40);
		Password.setBounds(130, 270, 200, 40);
		frame.add(labelPassword); frame.add(Password);
		
		JCheckBox checkBox = new JCheckBox("i'm a human");
		checkBox.setBounds(130, 310, 200, 40);
		frame.add(checkBox);
		
		checkBox.addActionListener(new ActionListener(){
			 
			 public void actionPerformed(ActionEvent e){  
				 		if (checkBox.isSelected()) {
				 			JOptionPane.showMessageDialog(frame, "Anda manusia");
				 		}
				 		else {
				 			JOptionPane.showMessageDialog(frame, "Apakah Anda robot?");
				 		}
			         }  
			     });  
		
		JRadioButton male = new JRadioButton("Male");
//		male.setActionCommand("Male");
		JRadioButton female = new JRadioButton("Female");
//		female.setActionCommand("Male");
		male.setBounds(130, 350, 200, 20);
		female.setBounds(130,370, 200, 20);
		ButtonGroup bg = new ButtonGroup();
		bg.add(male); bg.add(female);
		frame.add(male); frame.add(female);
		
		male.addActionListener(new ActionListener(){
			 
			 public void actionPerformed(ActionEvent e){  
						JOptionPane.showMessageDialog(frame, "Kamu adalah laki-laki ");
			         }  
			     });  
		
		female.addActionListener(new ActionListener(){
			 
			 public void actionPerformed(ActionEvent e){  
						JOptionPane.showMessageDialog(frame, "Kamu adalah perempuan ");
			         }  
			     });  
		
		String[] city = {"Tanjung Pinang", "Batam", "Natuna", "Anambas", "Karimun", "Lingga"};
		JComboBox comboBox = new JComboBox(city);
		comboBox.setBounds(130, 390, 150, 20);
		frame.add(comboBox);

		comboBox.addActionListener(new ActionListener(){
			 
			 public void actionPerformed(ActionEvent e){  
				 		String chosen = comboBox.getSelectedItem().toString();
						JOptionPane.showMessageDialog(frame, "Kamu baru saja memilih " + chosen);
			         }  
			     });  
		
		frame.setSize(400, 800);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
