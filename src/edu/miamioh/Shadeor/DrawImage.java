package edu.miamioh.Shadeor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawImage extends JPanel{
	
	JPanel panelQ = new JPanel();
	JLabel labelQ = new JLabel();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	
	
	
	public DrawImage(){
		ImageIcon imageIconB = new ImageIcon("Queen Red.png");
		Image imageB = imageIconB.getImage();
		Image newimgB = imageB.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		imageIconB = new ImageIcon(newimgB);
		labelQ.setIcon(new ImageIcon(newimgB));
		panelQ.add(labelQ);
		
		
		add(panelQ);
		add(labelQ);
		validate();
		
		add(l);
		add(p);
		validate();
		
	}//End of DrawImage

}//End of class
