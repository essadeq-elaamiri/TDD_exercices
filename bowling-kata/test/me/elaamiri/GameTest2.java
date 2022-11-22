package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GameTest2 {


	private Game game;
	
	@Before
	public void initialization() {
		game = new Game();
	}
	
	@Test
	public void testIfScoreFunctionExists() {
		assertEquals(0, game.score());
	}
	
	@Test
	public void testAllFrames0() {
		for(int i=0; i< 20; i++) {
			game.ball(0);
		}
		assertEquals(0, game.score());
	}
	
	@Test
	public void testAllBalls1() {
		for(int i=0; i< 20; i++) {
			game.ball(1);
		}
		assertEquals(20, game.score());
	}
	
	
	@Test
	public void test1Spare() {
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		
		game.ball(2);
		game.ball(8); //spare
		game.ball(0);
		game.ball(0);
		
		assertEquals(10, game.score());
	}
	
	@Test
	public void test2Spare() {
		game.ball(0);
		game.ball(10);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		
		game.ball(2);
		game.ball(8); //spare
		game.ball(0);
		game.ball(0);
		
		assertEquals(20, game.score());
	}
	
	@Test
	public void test1Strike2Spares() {
		game.ball(0);
		game.ball(10);
		
		game.ball(10);
		//game.ball(0);
		
		game.ball(0);
		game.ball(0);
		game.ball(0);
		game.ball(0);
		
		game.ball(2);
		game.ball(8); //spare
		game.ball(0);
		game.ball(0);
		
		assertEquals(40, game.score());
	}
	
	// To be tested (Last strick and last spare)

	@Test
	public void testAllStricks() {
		game.ball(10);
		game.ball(10);
		
		game.ball(10);
		
		game.ball(10);
		game.ball(10);
		game.ball(10);
		game.ball(10);
		
		game.ball(10);
		game.ball(10); 
		game.ball(10);
		
		// bonus 
		game.ball(10);
		game.ball(10);
		
		assertEquals(300, game.score());
	}
	
	

}
