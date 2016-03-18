package view;
import Model.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class GridChild extends JButton{

	public interface ClickListener{
		public void onItemClicked(int x, int y, GridChild child);
	}
	public static final int X = 1;
	public static final int O = 2;

	public GridChild(ClickListener listener, int x, int y){
		this.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				delegate.onItemClicked(x, y,GridChild.this);
			}
		});
		this.delegate = listener;
		this.x = x;
		this.y = y;
	}
	

	public void setPlayerType(int playerType){
		this.playerType = playerType;
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		if(playerType == -1)
			return;
	else if(playerType == Grid.PLAYER_A)
			setText("X");
		else
			setText("O");
	}
	
	public boolean hasBeenFilled(){
		return playerType != -1;
	}



	
	private int x;
	private int y;
	private ClickListener delegate;
	private int playerType = -1;
	
}
