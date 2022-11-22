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
	
	@Test
	public void testAll() {
		game.ball(2);
		game.ball(0);//2
		
		game.ball(5);
		game.ball(4);//11
		
		game.ball(5);
		game.ball(5);//31
		
		game.ball(10); //50
		
		game.ball(10);
		
		game.ball(1);
		game.ball(2); // 62
		
		game.ball(3);
		game.ball(4); //69
		
		game.ball(5);
		game.ball(4); //78
		
		game.ball(5);
		game.ball(5); //92
		
		game.ball(10); // 114
		//game.ball(6); //103
		
		game.ball(1); // 103
		game.ball(2);
		
		
		assertEquals(117, game.score());
	}
	
	

}
