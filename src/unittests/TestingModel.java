package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Node;

import Model.Grid;

public class TestingModel {

	@Test
	public void easyTest() {
		Grid grid = new Grid(3,3);
		grid.updateNode(Grid.PLAYER_A, 1, 1);
		grid.updateNode(Grid.PLAYER_B, 0, 0);
//		Node node = grid.getNodeAt(0, 1);
//		System.out.println(node.toString());
	}
	
	@Test
	public void testWinningEasy(){
		Grid grid = new Grid(3,3);
		grid.updateNode(Grid.PLAYER_A, 0, 0);
		grid.updateNode(Grid.PLAYER_A, 0, 1);
		grid.updateNode(Grid.PLAYER_A, 2, 2);
		if(grid.didPlayerWin(Grid.PLAYER_A))
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
	
	@Test
	public void testWinningMediumy(){
		Grid grid = new Grid(6,7);
		grid.updateNode(Grid.PLAYER_A, 0, 0);
		grid.updateNode(Grid.PLAYER_A, 0, 1);
		grid.updateNode(Grid.PLAYER_A, 2, 2);
		if(grid.didPlayerWin(Grid.PLAYER_A))
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}
