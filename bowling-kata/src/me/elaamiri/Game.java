package me.elaamiri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.security.auth.Refreshable;

public class Game {

	
	private List<Integer> scores = new ArrayList<>();
	private List<Frame> frames = new ArrayList<>();
	private List<Integer> bonus = new ArrayList<Integer>();
	private int fillingIndex = 0;
	
	public void ball(int knockedDown) {
		if(fillingIndex<20) {
			scores.add(knockedDown);
			if (fillingIndex % 2 == 0 && knockedDown == 10) {
				scores.add(0);
				fillingIndex ++;
			}
		}
		else {
			bonus.add(knockedDown);
		}
		
		fillingIndex ++;
		
	}
	
	public int score() {
		System.out.println(scores);
		for(int scoreIndex = 0; scoreIndex < scores.size(); scoreIndex +=2) {
			Frame frame = new Frame(scores.get(scoreIndex), scores.get(scoreIndex+1));
			frames.add(frame);
		}
		
		
		
		
		
		System.out.println("Bonus: "+ bonus);
		System.out.println(frames);
		System.out.println(fillingIndex);
		
		int bonusSum = 0;
		if(!bonus.isEmpty())
				bonusSum = bonus.stream().reduce((sum, bonusScore)-> sum + bonusScore).get();
		// process spares
		
		for(int frameIndex = 0; frameIndex < frames.size(); frameIndex +=1) {
			// the last 2 balls frame should not be processed
			if(frames.get(frameIndex).isSpare()) {
				if(frameIndex < 9) {
					frames.get(frameIndex).updateScore(frames.get(frameIndex+1).getFirstBall());
				}
				else {
					frames.get(frameIndex).updateScore(bonusSum);
				}
				
			}
			if(frames.get(frameIndex).isStrike()) {
				
				if(frameIndex < 8) {
					if(frames.get(frameIndex+1).isStrike()) {
						//frames.get(frameIndex).updateScore(frames.get(frameIndex+1).getScore() + frames.get(frameIndex+2).getScore());
						frames.get(frameIndex).updateScore(frames.get(frameIndex+1).getScore() + frames.get(frameIndex+2).getFirstBall());

					}
					else {
						frames.get(frameIndex).updateScore(frames.get(frameIndex+1).getScore());
					}
				}
				else {
					frames.get(frameIndex).updateScore(bonusSum);
				}

			}
			
		}
		
		int totalScore = 0;
		for(Frame frameIteration: frames) {
			totalScore += frameIteration.getScore();
		}
		
		System.out.println(frames);

		
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
