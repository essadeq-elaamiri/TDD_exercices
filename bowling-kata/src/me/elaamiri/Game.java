package me.elaamiri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Game {

	
	private List<Integer> scores = new ArrayList<>();
	private List<Frame> frames = new ArrayList<>();
	private int fillingIndex = 0;
	
	public void ball(int knockedDown) {
		scores.add(knockedDown);
		if (fillingIndex % 2 == 0 && knockedDown == 10) scores.add(0);
		
		fillingIndex ++;
		
	}
	
	public int score() {
		System.out.println(scores);
		for(int scoreIndex = 0; scoreIndex < scores.size(); scoreIndex +=2) {
			Frame frame = new Frame(scores.get(scoreIndex), scores.get(scoreIndex+1));
			frames.add(frame);
		}
		
		
		
		
		
		
		System.out.println(frames);
		System.out.println(fillingIndex);
		
		
		
		// process spares
		
		for(int frameIndex = 0; frameIndex < frames.size(); frameIndex +=1) {
			if(frames.get(frameIndex).isSpare()) {
						
				frames.get(frameIndex).updateScore(frames.get(frameIndex+1).getFirstBall());

			}
			if(frames.get(frameIndex).isStrike()) {
				
				frames.get(frameIndex).updateScore(frames.get(frameIndex+1).getScore());

			}
			
		}
		
		int totalScore = 0;
		for(Frame frameIteration: frames) {
			totalScore += frameIteration.getScore();
		}
		
		return totalScore;
	}
	
	
	class Frame{
		private int firstBall = 0;
		private int secondBall = 0;
		private int score = 0;
		
		public Frame(int firstBall, int secondBall) {
			
			this.firstBall = firstBall;
			this.secondBall = secondBall;
			
			this.score = this.firstBall + this.secondBall;
		}
		
		

		protected int getFirstBall() {
			return firstBall;
		}



		protected void setFirstBall(int firstBall) {
			this.firstBall = firstBall;
		}



		protected int getSecondBall() {
			return secondBall;
		}



		protected void setSecondBall(int secondBall) {
			this.secondBall = secondBall;
		}



		public int getScore() {
			return this.score;
		}
		
		public void setScore(int score) {
			this.score = score;
		}
		
		public void updateScore(int score) {
			this.score += score;
		}
		
		public boolean isSpare() {
			return firstBall != 10 && firstBall + secondBall == 10;
		}
		
		public boolean isStrike() {
			return firstBall == 10 ;
		}
		

		@Override
		public String toString() {
			return "F[" + firstBall + ", " + secondBall + ", "+getScore()+"]";
		}
		
	}
	

}
