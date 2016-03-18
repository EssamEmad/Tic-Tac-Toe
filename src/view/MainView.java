package view;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.*;

import javax.swing.*;

public class MainView extends JFrame{
	public MainView(){
		super();
	}
	public void setUP(){
		JPanel panel = new JPanel();
		GridLayout layout = new GridLayout(3,3);
		panel.setLayout(layout);
		for(int i = 0; i < 20; i ++)
		panel.add(new JButton());
		panel.setVisible(true);
		add(panel);
		setVisible(true);

	}
	
	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
	}
}
