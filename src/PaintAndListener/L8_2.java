package PaintAndListener;

import java.awt.*;

import javax.swing.*;

public class L8_2 extends JFrame
{
	Wdmb2 mb=null;	
	
	public static void main(String[] args)
	{
		L8_2 lx=new L8_2();
	}
	
	public L8_2()
	{
		mb=new Wdmb2();
		this.add(mb);
		this.setSize(600,550);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setVisible(true);	
	}
}

class Wdmb2 extends JPanel
{
	public void paint(Graphics g)
	{
	//	Image tp=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/javapt.jpg"));
		//g.drawImage(tp,100,80,400,350,this);
		//��ͼ�õ���ͼƬҪ������srcĿ¼��
		g.setColor(Color.red);
		g.setFont(new Font("��Բ",Font.BOLD,50));
		g.drawString("ͬѧ�ǣ���Һ�",200,100);		
	}
}