package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class where2eat implements Runnable {
	
	static JFrame myFrame;
	
	public where2eat () {
		SwingUtilities.invokeLater(this);	
	}

	public static void main(String[] args) {
		new where2eat();

	}

	@Override
	public void run() {
		
		myFrame = new JFrame("Where2Eat");
		myFrame.setSize(600, 510);
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth=screenSize.width;
		int srceenHeight=screenSize.height;
		
		myFrame.setLocation((screenWidth- 600)/2,(srceenHeight-500)/2); // set the location of the origin
		myFrame.setResizable(false); //size cannot be changed 
		
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// myFrame.setJMenuBar(mbr);
		myFrame.setVisible(true);
		myFrame.getContentPane().setBackground(Color.gray);
		myFrame.getContentPane().add(new MainFrame());
	}

}
