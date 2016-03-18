package Model;

/**
 *
 * @author essam
 *
 */
public class Grid {

	public static final int PLAYER_A = 1;
	public static final int PLAYER_B = 2;
	
	public Grid(){
		this(3,3);
	}
	
	public Grid(int width, int height){
		this.width = width;
		this.height = height;
		elements = new Node[width][height];
	}
	/**
	 * Method: updateNode
	 * Updates the node at the given position corresponding to the parameters
	 * @param node
	 */
	public synchronized void updateNode(int player, int x, int y){
		Node node = new Node();
		node.setPlayer(player);
		node.setPosition(x,y);
		elements[x][y] = node;
	}
	
	/**
	 * 
	 * @param playerType
	 * @return whether or not the given player has won the game
	 */
	public boolean didPlayerWin(int playerType){
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				Node current = elements[i][j];
				if( isNodeOfPlayer(playerType, current)){
					if (isInMiddleOf2(playerType,current))
						return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * @param x Has to lie within the correct range
	 * @param y same as x
	 * @return the node at this position or null if it doesn't exist
	 */
	public synchronized Node getNodeAt(int x, int y){
		return elements[x][y];
	}
	
	
	//Helper Methods
	/**
	 * The method checks whether or not the given node forms a 3 with other nodes
	 * @param playerType
	 * @return
	 */
	private boolean isInMiddleOf2(int playerType, Node node){
		int x = node.getX() -1;
		//making sure the node can have a node on the left and a node on the right
		
		if(x >= 0 && x + 2 < width && node.getY() - 1 >= 0 && node.getY() + 1 < height){
			for(int i = 0; i < 3; i ++){
				Node adjacent = elements[x][i];
				int oppositeX = x+2;
				int oppositeY = 2* node.getY() - i;
				Node opposite = elements[oppositeX][oppositeY];
				if(isNodeOfPlayer(playerType, adjacent) && isNodeOfPlayer(playerType, opposite))
					return true;
				}
			
		}
		if(node.getY() + 1 < height && node.getY() - 1 >=0){
		Node upperNode = elements[node.getX()][node.getY() +1];
		Node lowerNode = elements[node.getX()][node.getY() -1];
		if(isNodeOfPlayer(playerType, upperNode) && isNodeOfPlayer(playerType, lowerNode))
			return true;
		}
		
	
	return false;
	}
	
	/**
	 * Method: isNodeOfPlayer
	 * Checks whether this node was played by the given player.
	 * returns false if the node did not exist
	 * @param player
	 * @param x
	 * @param y
	 * @return
	 */
	private boolean isNodeOfPlayer(int player,Node node){
		if(node == null) return false;
		return node.getPlayer() == player;
	}
	
	
	//Instance variables
	private Node[][] elements;
	private int width = 3;
	private int height = 3;
	
	
	//Private Helper Classes
	
}
