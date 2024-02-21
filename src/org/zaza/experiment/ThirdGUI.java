package org.zaza.experiment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class ThirdGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenu menuView = new JMenu("View");
		JMenu menuAddData = new JMenu("Add Data");
		JMenu menuHelp = new JMenu("Help");
		menuBar.add(menuFile);
		menuBar.add(menuAddData);
		menuBar.add(menuView);
		menuBar.add(menuHelp);

		JMenuItem menuViewPelajar = new JMenuItem("Data Pelajar"); 
		JMenuItem menuViewPelajaran = new JMenuItem("Data Pelajaran"); 
		JMenuItem menuViewNilai = new JMenuItem("Daftar Nilai"); 
		JMenuItem menuAddDataPelajar = new JMenuItem("Penambahan Data Pelajar"); 
		JMenuItem menuAddDataPelajaran = new JMenuItem("Penambahan Data Pelajaran"); 
		JMenuItem menuAddDataNilai = new JMenuItem("Penambahan Daftar Nilai");
		JMenuItem menuFileExit = new JMenuItem("Exit");
		JMenuItem menuHelpAbout = new JMenuItem("About");
		menuView.add(menuViewPelajar); 
		menuView.add(menuViewPelajaran); 
		menuView.add(menuViewNilai);
		menuAddData.add(menuAddDataPelajar);
		menuAddData.add(menuAddDataPelajaran);
		menuAddData.add(menuAddDataNilai);
		menuFile.add(menuFileExit);
		menuHelp.add(menuHelpAbout);
		frame.setJMenuBar(menuBar);
		
		frame.setSize(400, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
