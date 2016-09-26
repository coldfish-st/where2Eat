package main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		
		this.setLayout(new FlowLayout());
		this.setSize(425, 500);
		this.setBackground(Color.white);
		
		final JLabel choose = new JLabel("Choose");
		choose.setFont(new Font("Dialog", 0, 35));
		choose.setForeground(Color.gray);
		choose.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		choose.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<String>  selection = new ArrayList<String> ();
				selection.add("食堂");
				selection.add("面包");
				selection.add("麦片");
				selection.add("粥");
				selection.add("肠粉");
				selection.add("饺子");
				selection.add("猪脚饭");
				selection.add("炸鸡");
				selection.add("韩料");
				selection.add("意粉");
				selection.add("爱你呢(づ￣ 3￣)づ");
				
				Random random = new Random();
				int i = random.nextInt(11);
				new resultFrame(i, selection);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				choose.setForeground(Color.blue);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				choose.setForeground(Color.gray);
				
			}

			
			
		});
		
		 
		  //Toolkit tk = this.getToolkit();
		  //someimgicon = tk.getImage(iconUrl);
		
          // ImageIcon icon = new ImageIcon(url);
		URL iconUrl = MainFrame.class.getResource("/resource/background.jpg");
		Icon image = new ImageIcon(iconUrl);
		JLabel backgroud = new JLabel(image);
		//backgroud.setIcon(image);
		this.add(backgroud);
		this.add(choose);
	}
	
	
}
