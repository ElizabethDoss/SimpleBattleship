package ch1;

import java.util.Scanner;

public class SimpleBattleship {

	private int numOfHits = 0;
	private int shipLength;
	private int [] shipLocation;
	private int guess;
	
	public int getLength () {
		return shipLength;
	}
	
	public void setLength (int newShipLength) {
		this.shipLength=newShipLength;
	}
	

	public void setLocationShip() {
			int location = (int) Math.random();
			int j=0;
		    for (int i=location; i<shipLength; i++) {
		    	shipLocation[j]=i;
		    	j= j+1;
		    }
		  }
	
	public int getGuess (){
		Scanner userInput= new Scanner(System.in);
		System.out.print("Enter guess:");
		guess=userInput.nextInt();
		return guess;
	}

	public String runGame(int guess) {
		String result = "miss";
		    for (int cell: shipLocation) {
		      if (guess == cell) {
		        result = "hit";
		        numOfHits++;
		        break;
		      }
		    }
		    if (numOfHits == shipLocation.length) {
		      result = "kill";
		    }
		    System.out.println(result);
		    return result;
		  }
	
}
