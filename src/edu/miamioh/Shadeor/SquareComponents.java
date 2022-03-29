package edu.miamioh.Shadeor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;



public class SquareComponents extends JComponent{
	//Create an object for each square storing information
	/* Name: Ex. A1, B1
	 * Image: image
	 * Visible: false
	 * 
	 */
	SquareComponents[][] panels = new SquareComponents[8][8];
	
	
	public void paintComponent(Graphics g){
		drawSquare(g, 100, 100);				
		fillSquare(g, 100, 100);
		validate();
	}//End of paintComponent

	public void drawSquare(Graphics g, int x, int y){
		//g.drawRect(x, y, width, height);
		Graphics2D g2 = (Graphics2D) g; 
		g.setColor(Color.WHITE);
		g2.setStroke(new BasicStroke(2));
		g2.drawRect(19, 19, 802, 802);
	}//End of drawSquare

	public void fillSquare(Graphics g, int x, int y){
		for(int row = 0; row < 8; row++){
			for(int col = 0; col < 8; col++){
				if(row % 2 == 0){
					g.setColor(Color.RED);
					if(col % 2 == 0){ 
						g.setColor(Color.BLACK);
					}//End of if
				}else if(row % 2 != 0){
					g.setColor(Color.BLACK);
					if(col % 2 == 0){
						g.setColor(Color.RED);
					}//End of if
				}//End of else-if
				g.fillRect(col*100+20, row*100+20, 100, 100);
			}//End of for(col)
		}//End of for(row)

	}//End of fillSquare 
	
	

}//End of class
