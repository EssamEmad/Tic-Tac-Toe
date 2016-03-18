package Model;
/**
	 * Class: Node
	 * 
	 * The class is used to represent the data of each node in the grid
	 * @author essam
	 *
	 */
	public  class Node{

		
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
		
		public int getX(){return xPosition;
		
		}
		public int getY(){
			return yPosition;}
		
		public int getPlayer(){ return player;}
	
		@Override
		public String toString(){
			return "Player:" + this.getPlayer() + " at postiion" + getX() + " , " + this.getY();
			
		}
		//Instance Variables
		private int player;
		private int xPosition;
		private int yPosition;
	}


