package PaintAndListener;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class L8_5 extends JFrame
{
    Wdmb5 mb=null;
    
    public static void main(String[] args) 
    {
    	L8_5 lx=new L8_5();
	}
	
	L8_5()
	{
		mb=new Wdmb5();
		
		
		this.add(mb);
		
		
		this.addMouseListener(mb);
		this.addKeyListener(mb);
		this.addMouseMotionListener(mb);
		
		
		this.setSize(400,300);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setVisible(true);	
	}
}
class Wdmb5 extends JPanel implements MouseListener,KeyListener,MouseMotionListener
{
	public void paint(Graphics g)
	{
		super.paint(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		System.out.println("�������λ���ǣ�");
		System.out.println("�����꣺"+e.getX());
		System.out.println("�����꣺"+e.getY());
	}
    public void mousePressed(MouseEvent e)
    {
    	System.out.println("��걻����");
	}
	public void mouseReleased(MouseEvent e)
	{
		System.out.println("��걻�ɿ�");
	}
	public void mouseEntered(MouseEvent e)
	{
		System.out.println("����ƶ���������");
	}
    public void mouseExited(MouseEvent e)
    {
    	System.out.println("����뿪����");
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
			
	}
    public void keyPressed(KeyEvent e)
    {
    	System.out.println(e.getKeyChar()+"������");		
	}
    public void keyReleased(KeyEvent e)
    {
		
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		System.out.println("��굱ǰλ���ǣ�");
		System.out.println("�����꣺"+e.getX());
		System.out.println("�����꣺"+e.getY());
	}
	public void mouseMoved(MouseEvent e) 
	{
//		System.out.println("��굱ǰλ���ǣ�");
//		System.out.println("�����꣺"+e.getX());
//		System.out.println("�����꣺"+e.getY());
	}
}