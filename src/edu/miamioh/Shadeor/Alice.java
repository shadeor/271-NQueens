package edu.miamioh.Shadeor;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Alice extends JPanel{
	
	JPanel panelA = new JPanel();
	JLabel labelA = new JLabel();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	
	
	
	public Alice(){
		ImageIcon imageIconA = new ImageIcon("Alice.jpg");
		Image imageA = imageIconA.getImage();
		Image newimgA = imageA.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
		imageIconA = new ImageIcon(newimgA);
		labelA.setIcon(new ImageIcon(newimgA));
		panelA.add(labelA);
		
		
		add(panelA);
		add(labelA);
		validate();
		
		add(l);
		add(p);
		validate();
		
	}//End of DrawImage


}
