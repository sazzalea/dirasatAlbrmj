package org.zaza.experiment;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SecondGUI {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Percobaan GUI kedua");

		JOptionPane.showMessageDialog(frame, "Hello, welcome to the experiment!");
		
//		String[][] data = {
//				{"1001", "Putih", "B"},
//				{"1002", "Kiky", "A"}
//		};
//		String[] column = {"ID", "NAME", "CLASS"};
//		JTable table = new JTable(data, column);
//		table.setBounds(130, 130, 100, 100);
//		JScrollPane scroll = new JScrollPane(table);
//		frame.add(scroll);

		DefaultListModel<String> foods = new DefaultListModel<>();
		foods.addElement("Bakso");
		foods.addElement("Mie");
		foods.addElement("Ikan Bakar");
		foods.addElement("Ayam Bawang");
		foods.addElement("Bakso");
		foods.addElement("Mie");
		foods.addElement("Ikan Bakar");
		foods.addElement("Ayam Bawang");
		JList<String> list = new JList<>(foods);
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add(list);
		scroll.setBounds(130, 300, 150, 100);
		frame.add(scroll);
		
//		JScrollBar scrollBar = new JScrollBar();
//		scrollBar.setBounds(220, 300, 20, 100);
//		frame.add(scrollBar);

		frame.setSize(400, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
