package edu.miamioh.Shadeor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Run extends JFrame{
	
	
	private static int nextClick = 0;
	private static int click = 0;
	private static int click2 = 0;
	private static int noMoreThan8 = 0;
	private DrawImage queen = new DrawImage();

	private boolean is = true;
	private boolean isNot = false;
	
	int num;
	
	JFrame frame = new JFrame();
	
	private static String[][] nqueenBoard = new String[][]{
		{"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"},
		{"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
		{"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
		{"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
		{"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
		{"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
		{"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
		{"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"}};
		
		private static ArrayList<String> activeQueensList = new ArrayList<String>();
		private static Object[] activeQueens = new Object[8];
		
		

	
	public static void main (String[] args){

		Run nQueens = new Run();
		nQueens.setVisible(true);
		
		// System.out.println(activeQueens);
		System.out.println(Arrays.toString(activeQueens));
		
		
	}//End of main


	public Run() {

		super("Red Queen's Revenge");
		setSize(1500, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		//JLabel notice = new JLabel("Notice, Game is still in the Alpha stages of development.");
		//notice.setFont(new Font("Times New Romans", Font.PLAIN, 30));
		//JOptionPane.showMessageDialog(frame, notice);

		JLayeredPane lp = getLayeredPane();
		lp.setPreferredSize(new Dimension(1000,1000));

		JComponent component = new SquareComponents();
		component.setBounds(0,0,1000,1000);

		lp.add(component, lp.DEFAULT_LAYER);

		JPanel p = new JPanel();
		JLabel title = new JLabel("RED QUEEN'S REVENGE");
		title.setForeground(Color.RED);
		title.setFont(new Font("Algerian", Font.PLAIN, 45));
		p.add(title);
		p.setOpaque(false);
		p.setBounds(755, 10, 800, 150);

		lp.add(p, lp.PALETTE_LAYER);

		JPanel background = new JPanel();
		background.setBackground(Color.BLACK);
		add(background);

		JButton check = new JButton("Check Solution");
		check.setBackground(Color.RED);
		check.setFont(new Font("Bookman Old Style", Font.PLAIN, 45));
		check.setBounds(900, 100, 500, 100);
		lp.add(check, lp.PALETTE_LAYER );

		JButton tip = new JButton("Ask For Help");
		tip.setBackground(Color.CYAN);
		tip.setFont(new Font("Bookman Old Style", Font.PLAIN, 45));
		tip.setBounds(900, 250, 500, 100);
		lp.add(tip, lp.PALETTE_LAYER );

		JPanel panelA = new JPanel();
		panelA.add(new Alice());
		panelA.setBounds(750,400,1000,1000);
		lp.add(panelA, lp.MODAL_LAYER);
		panelA.setOpaque(false);

		JButton tip2 = new JButton("Ask For Help");
		tip2.setBackground(Color.WHITE);
		tip2.setFont(new Font("Bookman Old Style", Font.PLAIN, 45));
		tip2.setBounds(900, 400, 500, 100);
		lp.add(tip2, lp.PALETTE_LAYER );

		JButton submit = new JButton("Submit Bug");
		submit.setBackground(Color.CYAN);
		submit.setFont(new Font("Arial", Font.PLAIN, 20));
		submit.setBounds(20, 850, 150, 50);
		lp.add(submit, lp.PALETTE_LAYER);


		tip2.setVisible(false);
		panelA.setVisible(false);

		tip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click++;
				panelA.setVisible(true);
				nextClick++;
					panelA.setVisible(false);
				if(nextClick == 1){
					nextClick = 0;
				}
				if(click == 3){
					tip2.setVisible(true);
				}
				if(click > 3){
					click = 1;

				}
			}

		});

		tip2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click2++;
				if(click2 == 1){
					tip2.setVisible(false);

				}
				if(click2 == 1){
					click2 = 0;
				}

			}

		});
		
		submit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			BugSubmision b1 = new BugSubmision();
			b1.setVisible(true);
				
				}
			
		
	});

		check.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkSolution();

			}

		});
		
		//ArrayList<JPanel> panelist = new ArrayList <JPanel>();
		
		
		
			for(int row = 0; row < 8; row++){
				for(int col = 0; col < 8; col++){
					JPanel panel = new JPanel();
					//JPanel cover = new JPanel();
					JToggleButton cover = new JToggleButton();
					
					panel.add(new DrawImage());
					panel.setBounds(col*100+20, row*100+20, 100, 100);
					
					cover.setBounds(col*100+20, row*100+20, 100, 100);
					lp.add(panel, lp.PALETTE_LAYER);
					lp.add(cover, lp.PALETTE_LAYER);
					
					 panel.setVisible(false);
					 cover.setOpaque(false);
					 cover.setContentAreaFilled(false);
					 cover.setBorderPainted(false);
					
					 
					cover.setName(nqueenBoard[row][col]);
					
								
					
					cover.addItemListener(new ItemListener() {
						 
			          
			            public void itemStateChanged(ItemEvent itemEvent)
			            {
			 
			                // event is generated in button
			                int state = itemEvent.getStateChange();
			 
			                // if selected print selected in console
			                if (state == ItemEvent.SELECTED) {
			                	if((activeQueensList.size() <= 7)) {
			                    System.out.println("Selected " + cover.getName());
			                    panel.setVisible(true);
								panel.revalidate();
								
								activeQueensList.add(cover.getName());
								num = Character.getNumericValue(cover.getName().charAt(1));
								System.out.println("number " + num);
								activeQueens[num - 1] = cover.getName();
					
								System.out.println(Arrays.toString(activeQueens));
			                	}else {
			                		JOptionPane.showMessageDialog(null, "Error!, No more than 8 Queens can be placed.");
			                	}
								//checkVisibility();
			                }
			                else {
			 
			                    // else print deselected in console
			                    System.out.println("Deselected " + cover.getName());
			                    panel.setVisible(false);
								panel.revalidate();
								num = Character.getNumericValue(cover.getName().charAt(1));
								activeQueens[num - 1] = null;
								activeQueensList.remove(cover.getName());
								System.out.println(Arrays.toString(activeQueens));
			                }
			            }
			        });
			 
				
			    
					
				}//End of for(col)
			}//End of for(row)

			
		
	}//End of N_Queens

	public boolean checkSolution(){
		JLabel notice1;
		
		if(activeQueensList.size() < 8 ) {
		notice1 = new JLabel("You must first place 8 Queens on the board.");
		}else {
		notice1 = new JLabel("Solution is incorrect, Please Try again.");
		}
		
		notice1.setFont(new Font("Times New Romans", Font.PLAIN, 30));
		JOptionPane.showMessageDialog(frame, notice1);
		
	
		return false;
	}//end of checkVisibility
	

}//end of class
