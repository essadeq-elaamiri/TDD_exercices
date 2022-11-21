package me.elaamiri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Game {

	
	private List<Integer> ballScores = new ArrayList<>(Collections.nCopies(21, 0));
	private int fillingIndex = 0;
	
	public void ball(int knockedDown) {
		
		ballScores.set(fillingIndex, knockedDown);
		fillingIndex ++;
	}
	
	public int score() {
		System.out.println(ballScores);
		System.out.println(fillingIndex);
		int scoresSum = ballScores.stream().reduce((ballScore, sum)-> sum + ballScore).get();
		for(int index = 0; index < this.fillingIndex-3; index ++) {
			// -3 = -2 -1
			// -2 because the 2 last not as the other have no bonus
			// -1 because of the last added 1 (last incrementation)
			
			// Process spare
			if(ballScores.get(index) == 0 && ballScores.get(index+1) == 10 ) {
				scoresSum = scoresSum + ballScores.get(index+2) ;
				index +=2; // skip the spare 10
			}
			
			// Process strick
			
			else if(ballScores.get(index) == 10) {
				scoresSum = scoresSum + ballScores.get(index+1) + ballScores.get(index+2);
			}
		}
		return scoresSum;
	}
	
	

}
