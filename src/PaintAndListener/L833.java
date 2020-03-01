package PaintAndListener;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class L833 extends JFrame implements ActionListener{
      
	wdmb panel=null;
	JButton  button1,button2;
	
	
	public static void main(String args [])
	{
		L833 l8=new L833();
	}
	
	L833()
	{
		// init  contents
		panel=new wdmb();
		button1=new JButton("blue");
		button2=new JButton("red");   		
		 
		//add contents
		this.add(button1, BorderLayout.NORTH);
		this.add(button2, BorderLayout.SOUTH);
		this.add(panel);   
		
		// add actionlistener
		button1.addActionListener(this);
		button1.setActionCommand("1");
		button2.addActionListener(this);
		button2.setActionCommand("2");
		
		//set windows information
		this.setSize(500, 200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("1"))
		{
			panel.setBackground(Color.BLUE);
		}
		else if (e.getActionCommand().equals("2"))
		{
			panel.setBackground(Color.red);
		}
		
	}
	
}


class wdmb extends JPanel {
	
	wdmb(){
		this.setBackground(Color.white);
	}
	
	
}