package PaintAndListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class L8_7 extends JFrame implements ActionListener
{
    JMenuBar menubar;
    JMenu menu1,menu2;
    JMenuItem menuItem2,menuItem3;    
    JTextArea textarea;	
	
	public static void main(String[] args) 
	{
		L8_7 lx=new L8_7();
	}
	
	L8_7()
	{
		menubar=new JMenuBar();
		menu1=new JMenu("文件(F)");
		menu1.setMnemonic('F');
		menu2=new JMenu("编辑(E)");
		menu2.setMnemonic('E');
				
		
		menuItem2=new JMenuItem("打开",new ImageIcon("image/dk.jpg"));
		menuItem2.addActionListener(this);
		menuItem2.setActionCommand("open");
		
		
		menuItem3=new JMenuItem("保存",new ImageIcon());
		menuItem3.addActionListener(this);
		menuItem3.setActionCommand("save");
		
		
		textarea=new JTextArea();
		
		
				
		menu1.add(menuItem2);  menu1.add(menuItem3);
		menubar.add(menu1);  menubar.add(menu2); 
		
		this.setJMenuBar(menubar);	this.add(textarea);
		
		ImageIcon tp1=new ImageIcon("image/jsb.jpg");
		this.setIconImage(tp1.getImage());
		this.setTitle("记事本");
		this.setSize(400,300);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	
	
	public void actionPerformed(ActionEvent e)
    {
	    	if(e.getActionCommand().equals("open"))
	    	{
	    		//System.out.println("打开");
	    		JFileChooser wjxz=new JFileChooser();
	    		wjxz.setDialogTitle("文件打开");
	    		wjxz.showOpenDialog(null);
	    		wjxz.setVisible(true);
	    		
	    		String wjlj=wjxz.getSelectedFile().getAbsolutePath();
	    		//这行的作用是 得到用户选择的全路径
	    		//System.out.println(wjlj);
	    		FileReader wjl=null;    BufferedReader hcl=null;
	    		try
	    		{
	    			wjl=new FileReader(wjlj);
	    			hcl=new BufferedReader(wjl);
	    			String s="",zfc="";
	    			while((s=hcl.readLine())!=null)
	    			{
	    				zfc+=(s+"\n");
	    			}    	
	    			textarea.setText(zfc);
	    		}
	    		catch(Exception aa){
	    			
	    		}
	    		finally
	    		{
	    			try 
	    			{
						wjl.close();
						hcl.close();
					} 
	    			catch (Exception e1) {}
	    		}
	    	}
	    	else if(e.getActionCommand().equals("save"))
	    	{
	    		//System.out.println("保存");
	    		JFileChooser ljxz=new JFileChooser();
	    		ljxz.setDialogTitle("另存为");
	    		ljxz.showSaveDialog(null);  
	    		ljxz.setVisible(true);
	    		
	    		String bclj=ljxz.getSelectedFile().getAbsolutePath();
	    		try
	    		{
	    			PrintStream pl = new PrintStream(bclj);
	    			System.setOut(pl);
	    			System.out.println(this.textarea.getText());
	    		}
	    		catch(Exception aa){}	    		
	    	}
     }	
}