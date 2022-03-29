package edu.miamioh.Shadeor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class BugSubmision extends JFrame{

	public static Object t1;
	public static Object t2;

	public BugSubmision(){
		super("Submit Bug");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		JLayeredPane p = new JLayeredPane();
		p.setPreferredSize(new Dimension(500,500));
		add(p);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		JButton b = new JButton();
		JLabel l = new JLabel("Submit");
		b.add(l);
		p2.setLayout(new BorderLayout());
		p2.add(b, BorderLayout.AFTER_LAST_LINE);
		
		
		JLabel l1 = new JLabel("Title:"); 
		p2.add(l1);
		p2.add(l1, BorderLayout.NORTH);
		
		
		JLabel l2 = new JLabel("Problem:"); 
		p2.add(l2);
		p2.add(l2, BorderLayout.BEFORE_LINE_BEGINS);
		
		
		JTextField t1 = new JTextField("Title: 'NOTE! Backspace out!'");
		//t1.add(l1);
		//t1.
		p2.add(t1);
		p2.add(t1, BorderLayout.PAGE_START);

		JTextArea t2 = new JTextArea();
		//t2.setPreferredSize(new Dimension(20, 500));
		p2.add(t2);
		//p2.setLayout(new BorderLayout());
		p2.add(t2, BorderLayout.CENTER);
		setContentPane(p2);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bugs bugs = new Bugs();
				dispose();
				
				
			}

		});

	}
	/*

	public static void main (String[] args){
		BugSubmision b2 = new BugSubmision();
		b2.setVisible(true);
	}
	*/
}
