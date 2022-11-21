package me.elaamiri;

import java.util.Arrays;
import java.util.List;

/*
- Instructions
Write a program to score a game of Ten-Pin Bowling.

This online app can help you: http://www.bowlinggenius.com/

Input: a string (described below) representing a bowling game
Ouput: an integer score

- Rules:
Each game (or "line") of bowling includes ten turns (or "frames") for the bowler.

In each frame, the bowler gets up to two tries to knock down all ten pins.

If the first ball in a frame knocks down all ten pins, this is called a "strike". 
The frame is over. 
The score for the frame is ten plus the total of the pins knocked down in the next two balls.

If the second ball in a frame knocks down all ten pins, this is called a "spare". 
The frame is over. 
The score for the frame is ten plus the number of pins knocked down in the next ball.

If, after both balls, there is still at least one of the ten 
pins standing, the score for that frame is simply the total 
number of pins knocked down in those two balls.

If you get a spare in the last (10th) frame you get one more bonus ball.

If you get a strike in the last (10th) frame you get two more bonus balls.

These bonus throws are taken as part of the same turn

If a bonus ball knocks down all the pins,
the process does not repeat. The bonus balls are only 
used to calculate the score of the final frame.


The game score is the total of all frame scores.

- Symbol meanings
X indicates a strike
/ indicates a spare
- indicates a miss
| indicates a frame boundary
The characters after the || indicate bonus balls

-------------------
1 line (game) => 10 frames (turns)
1 frame => 2 tries (balls) (the second try to complete the remaining pins)
Strike => 1st try 10 pins => Score = 10 + Score of 2 next balls
Spare =>  2nd try 10 pins => Score = 10 +  Score of 1 nest ball

1 bonus ball for last ball if it is spare
2 bonus balls for last ball if it is strike

The bonus balls are only used to calculate the score of the final frame.



 */

public class TenPinBowling {
	
	private int[] framesScore = new int[22]; // initial values are 0 by default
	private int frameIndex = 0;
	

	public void ball(int knockedDown) {
		//System.out.print("Bull: ");
		//System.out.println(Arrays.toString(framesScore));
		
		framesScore[frameIndex] = knockedDown;
		
		// even index are the 1st ball of a frame // Strick
		if(frameIndex % 2 == 0 && knockedDown == 10) {
			this.frameIndex += 1;
			framesScore[frameIndex] = 0;
		}
		
		this.frameIndex += 1;
		
	}
	
	public int score() {
		System.out.println(Arrays.toString(framesScore));

		// Process Strike
		for(int i = 0; i< framesScore.length-2; i++ ) {
			if(i % 2 == 0 && framesScore[i] == 10) {
				if(framesScore[i+2] == 10) {
					framesScore[i+1] = framesScore[i+2]+ framesScore[i+4];
					continue; // should start it from last
				}
				framesScore[i+1] = framesScore[i+2]+ framesScore[i+3]; // + next balls (if next ball == 10)??
			}
		}
		
		System.out.println(Arrays.toString(framesScore));
		
		return Arrays.stream(framesScore).sum();  
	}
	
	

}
