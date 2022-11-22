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
		for(int i=0; i< 10; i++) {
			game.ball(1);
		}
		assertEquals(20, game.score());
	}
	
	@Test
	public void testSpare() {
		for(int i=0; i< 10; i++) {
			game.ball(1);
		}
		assertEquals(20, game.score());
	}
	

}
