package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class resultFrame extends JPanel{
	static JDialog resultFrame;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public resultFrame (int i, ArrayList<String>  selection) {
		
		resultFrame = new JDialog(where2eat.myFrame, "吃这个", true);
		resultFrame.setLayout(new FlowLayout());
		resultFrame.setResizable(false);
		resultFrame.setSize(new Dimension(570, 600));
		
		URL iconUrl = MainFrame.class.getResource("/resource/"+i+".jpg");
		Icon image = new ImageIcon(iconUrl);
		JLabel backgroud = new JLabel(image);
		
		//ImageIcon image = new ImageIcon();
		//backgroud.setIcon( image);
		backgroud.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel result = new JLabel(selection.get(i)); 
		result.setFont(new Font("Dialog", 0, 35));
		result.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		resultFrame.add(result);
		resultFrame.add(backgroud);
		
		
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth=screenSize.width;
		int srceenHeight=screenSize.height;
		resultFrame.setLocation((screenWidth- 550)/2,(srceenHeight-800)/2); 
		resultFrame.setVisible(true);
		
	}

}
