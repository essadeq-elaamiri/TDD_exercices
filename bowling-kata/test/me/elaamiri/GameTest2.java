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
	public void test0InAll20Balls() {
		for(int i = 0; i<20; i++) {
			game.ball(0);
		}
		assertEquals(0, game.score());
	}
	
	@Test
	public void test1InAll20Balls() {
		for(int i = 0; i<20; i++) {
			game.ball(1);
		}
		assertEquals(20 * 1, game.score());
	}
	
	@Test
	public void test1Strick() {
		for(int i = 0; i<10; i++) {
			game.ball(1);
		}
		game.ball(10);
		for(int i = 11; i<20; i++) {
			game.ball(1);
		}
		assertEquals(1*10 + 1*9 + (10+1+1), game.score());
	}
	
	@Test
	public void testMultipleStricks() {
		for(int i = 0; i<10; i++) {
			game.ball(1);
		}
		game.ball(10);
		game.ball(10);
		for(int i = 12; i<20; i++) {
			game.ball(1);
		}
		assertEquals(1*10 + 1*8 + (10+10+1) + (10+1+1), game.score());
	}
	
	@Test
	public void testMultipleStricksWithLastStrick() {
		
		for(int i = 1; i<=10; i++) {
			game.ball(10);
		}
		// bonus
		game.ball(10);
		game.ball(10);
		assertEquals(300, game.score());
	}
	
	@Test
	public void testWith1Spare() {
		game.ball(0);
		game.ball(10);
		for(int i = 1; i<=18; i++) {
			game.ball(1);
		}
		// bonus
		
		
		assertEquals(18*1 + 10 + 1, game.score());
	}
	
	@Test
	public void testWithMultipleSpares() {
		game.ball(0);
		game.ball(10);
		for(int i = 1; i<=15; i++) {
			game.ball(1);
		}
		game.ball(0);
		game.ball(10);
		game.ball(3);
		// bonus
		
		
		assertEquals(15*1 + 10+1 + 10+3, game.score());
	}
	

}
