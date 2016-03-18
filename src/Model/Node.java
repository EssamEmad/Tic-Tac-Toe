package Model;
/**
	 * Class: Node
	 * 
	 * The class is used to represent the data of each node in the grid
	 * @author essam
	 *
	 */
	public  class Node{
		public static final int PLAYER_A = 1;
		public static final int PLAYER_B = 2;
		
		
		/**
		 * Method: setType
		 * 
		 * Sets the type of this node, either X or O.
		 * 
		 * @param type the type should be one of the 2 constants in Grid
		 */
		public Node setType(int type){
			this.type = type;
			return this;
		}
		/**
		 * Method: setType
		 * 
		 * Sets the player whom this node belong to.
		 * 
		 * @param type the type should be one of the 2 constants in Grid
		 */
		public Node setPlayer(int player){
			this.player = player; 
			return this;
		}
		
		public Node setPosition(int x, int y){
			this.xPosition = x;
			this.yPosition = y;
			return this;
		}
		
		public int getPlayer(){ return player;}
	
		
		//Instance Variables
		private int type;
		private int player;
		private int xPosition;
		private int yPosition;
	}


