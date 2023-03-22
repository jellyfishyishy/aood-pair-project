import java.awt.Image;

public class NonogramGrid{
	int gridDimX;
	int gridDimY;
	int[][] grid;
	Image image;
	int[][] playerGrid;
	int mode = 1;

	/*
	 * white - 0
	 * black - 1
	 * eliminate - 2
	 * mark - 3
	 */
	
	NonogramGrid(int gridDimX, int gridDimY, Image image){
		this.gridDimX = gridDimX;
		this.gridDimY = gridDimY;
		this.image = image;
		grid = new int[gridDimX][gridDimY];
		playerGrid = grid;
	}

	NonogramGrid(int[][] grid){
		this.gridDimX = grid.length;
		this.gridDimY = grid[0].length;
		this.grid = grid;
		playerGrid = grid;
	}
	
	NonogramGrid(int x, int y){
		grid = new int[x][y];
	}
	
	public int getGridDimX() {
		return gridDimX;
	}
	
	public int getGridDimY() {
		return gridDimY;
	}
	
	public int[][] getGrid(){
		return grid;
	}
	
	public int[][] getPlayerGrid(){
		return playerGrid;
	}
	
	public void setPlayerGrid(int x, int y) {
		playerGrid[x][y] = mode;
	}
	// NonogramGrid may potentially have image input for grid arrays
	
	public String toString() {
		String s = "";
		for(int[] line: grid) {
			for(int square: line) {
				if(square==0) {
					s = s+". ";
				} else if(square == 1) {
					s = s+"* ";
				} else if(square == 2) {
					s = s+"x ";
				} else if(square == 3) {
					s = s+"| ";
				}
			}
			s = s+"\n";
		}
		return s;
	}
}
	
	
	


