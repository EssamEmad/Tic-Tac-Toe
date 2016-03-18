package controller;
import java.awt.*;
import view.*;
import javax.swing.*;

import Model.*;

public class MainController {

	public static void main(String[] args){
	setupGUI(new Grid(6,7));

	}
	
	public static void setupGUI(final Model.Grid model){
		final JPanel panel = new JPanel();
		GridLayout layout = new GridLayout(6,7);
		panel.setLayout(layout);
		for(int i = 0; i < 6 ; i ++){
			for(int j = 0; j < 7; j++){
				 GridChild child = new GridChild(new GridChild.ClickListener(){
					@Override
					public void onItemClicked(int x, int y, GridChild child) {
						if(child.hasBeenFilled() || donePlaying)
							return;
						panel.repaint();
						model.updateNode(playerTurn, x, y);
						child.setPlayerType(playerTurn);
						if(model.didPlayerWin(playerTurn)){
							System.out.println("BAAAM");
							donePlaying = true;
						}
						invertPlayerTurn();
					}
				}, i,j);
					panel.add(child);
			}
		}
		panel.setVisible(true);
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setVisible(true);
	}
	
	private static void invertPlayerTurn(){
		if(playerTurn == Grid.PLAYER_A)
			playerTurn = Grid.PLAYER_B;
		else
			playerTurn = Grid.PLAYER_A;
	
	}
	
	private static  int playerTurn = Grid.PLAYER_A;
	private static boolean donePlaying = false;
}
