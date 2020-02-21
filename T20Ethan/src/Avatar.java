public class Avatar {
	private String name = "DEF";
	private int health = 3;
	private int score = 0;
	private int xCoord;
	private int yCoord;
	
	public Avatar(int xCoord, int yCoord, String name) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.name = name;
	}
	
	public Avatar(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	//REQUIREMENT : char direction must be capitalized.
	//EDIT: I just realized try/catch doesn't do anything here since
	//It's just integers and not actually moving anywhere on the array.
	//Removed.
	private void move(char direction) {
		int movement = direction;
		switch(movement) {
		//Direction = 'U'
		case 85:
			//x,y
			yCoord -= 1;
			//If out of bounds, reverse the change.
			if (yCoord <= -1 || yCoord >= 14) {
				yCoord += 1;
			}
			break;
		//Direction = 'D'
		case 68:
			//x,y
			yCoord += 1;
			if (yCoord <= -1 || yCoord >= 14) {
					yCoord -= 1;
			}
			break;
		//Direction = 'R'
		case 76:
			xCoord -= 1;
			if (xCoord <= -1 || xCoord >= 14) {
					xCoord += 1;
			}
			break;
		//Direction = 'L'
		case 82:
			xCoord += 1;
			if (xCoord <= -1 || xCoord >= 14) {
					xCoord -= 1;
			}
			break;
		}
	}
	
	//getLocation() --> X and Y
	private int getXCoord() {
		return(xCoord);
	}
	
	private int getYCoord() {
		return(yCoord);
	}
	
	//Update Score: 'change' will have to be positive
	//when moving forwards, and negative when moving back.
	private void updateScore(int change) {
		score += change;
	}
	
	//Update Health: 'change' should be a positive integer.
	//Subtracts from the total amount of health (3)
	private void updateHealth(int change) {
		health -= change;
	}
	
	private int getHealth() {
		return(health);
	}
	
}