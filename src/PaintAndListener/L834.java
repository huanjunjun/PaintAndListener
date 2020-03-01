package PaintAndListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class L834 extends JFrame {
     
	mb mb1=null;
	JButton button1,button2;
	action act=new action();
	
	public static void main(String [] args)
      {
    	  L834 l8=new L834();
      }
	
	L834(){
		mb1=new mb();
		button1=new JButton("蓝色");
		button2=new JButton("红色");
		button1.setBackground(Color.BLUE);
		button2.setBackground(Color.RED);
		
		this.add(button1, BorderLayout.NORTH);
		this.add(button2, BorderLayout.SOUTH);
		this.add(mb1);
		
		button1.addActionListener(act);
		button2.addActionListener(act);
		button1.setActionCommand("1");
		button2.setActionCommand("2");
		
		this.setSize(500, 500);
		this.setLocation(500,500);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
	}
}



class mb extends JPanel
{
	mb()
	{
		this.setBackground(Color.black);
	}
}

class action implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	try
	{
		
		if(e.getActionCommand().equals("1"))
		{
			System.out.println("蓝色按钮works");
			
		JFrame frame=new JFrame();
		
		frame.setSize(200,500);
		frame.setLocation(600,600);
		frame.setDefaultCloseOperation(2);
		frame.setVisible(true);
		

		}
		else if(e.getActionCommand().equals("2"))
		{
			System.out.println("红色按钮works");
		}
	}catch(Exception e1)
	{
		System.out.println("wrong 1");
	}
  }
	
}