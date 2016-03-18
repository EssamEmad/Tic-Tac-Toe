package view;
import Model.*;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class GridChild extends JButton{

	public static final int X = 1;
	public static final int O = 2;

	public GridChild(ActionListener listener){
		addActionListener(listener);
	}
	

	public void updateUI(int playerType){
		if(playerType == Grid.PLAYER_A)
			setText("X");
		else
			setText("O");
	}
	
	private int type = 2;
}
