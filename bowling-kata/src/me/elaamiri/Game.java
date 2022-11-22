package me.elaamiri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Game {

	
	private List<Frame> frames = new ArrayList<>();
	private int fillingIndex = 0;
	private Frame frame;
	
	public void ball(int knockedDown) {
		if(fillingIndex % 2 == 0 ) {
			frame = new Frame();
			frame.firstBall = knockedDown;
			if(knockedDown == 10) {
				frame.secondBall = 0;
			}
			frames.add(frame);
		}
		else {
			frames.get(fillingIndex-1).secondBall = knockedDown;
		}
		
		
		
		fillingIndex ++;
		
	}
	
	public int score() {
		System.out.println(frames);
		System.out.println(fillingIndex);
		int totalScore = 0;
		for(Frame frameIteration: frames) {
			totalScore += frameIteration.getScore();
		}
		
		
		
		
		return totalScore;
	}
	
	
	class Frame{
		int firstBall ;
		int secondBall;
		
		public int getScore() {
			return firstBall + secondBall;
		}
		
		public boolean isSpare() {
			return firstBall != 10 && firstBall + secondBall == 10;
		}
		

		@Override
		public String toString() {
			return "F[" + firstBall + ", " + secondBall + ", "+getScore()+"]";
		}
		
	}
	

}
