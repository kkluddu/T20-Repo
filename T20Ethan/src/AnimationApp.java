import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnimationApp {
	private int CurrentX = 6;
	private int CurrentY = 14;
	private Avatar avatar = new Avatar(CurrentX, CurrentY);
	//Not yet implemented
	//private ArrayList<Collectible> collectibles = new ArrayList<Collectible>
	//private ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>
	private int[][] board = new int[15][10];
	
	//Prints out board as it is
	private void printCurrentState() {
		 for (int[] row : board) { 
	            System.out.println(Arrays.toString(row));
		 }
	}
	
	private int[][] processAvatarMove(String movement) {
		int[][] newBoard = this.board;
		char direction = movement.charAt(0);
		avatar = avatar.move(direction);
		
		newBoard[CurrentY][CurrentX] = 0;
		System.out.println(avatar.getYCoord());
		System.out.println(avatar.getXCoord());
		newBoard[avatar.getYCoord()][avatar.getXCoord()] = 1;
		CurrentX = avatar.getXCoord();
		CurrentY = avatar.getYCoord();
		
		return(newBoard);
	}
	
	public void initialize() {
		Scanner keyboard = new Scanner(System.in);
		String uInput = "";
		
		System.out.print("Please enter a direction(U,D,L,R): ");
		uInput = keyboard.nextLine();
		
		this.board = processAvatarMove(uInput);
		printCurrentState();
	}
	
	//Not final main
	public static void main(String[] args) {
		AnimationApp Start = new AnimationApp();
		boolean run = true;
		
		while(run) {
			Start.initialize();
		}
	}
}


