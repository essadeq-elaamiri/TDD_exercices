package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.Before;

/*
 
 Rules
	The rules of the tic tac toe game are the following:
	
	a game is over when all fields are taken
	a game is over when all fields in a column are taken by a player
	a game is over when all fields in a row are taken by a player
	a game is over when all fields in a diagonal are taken by a player
	a player can take a field if not already taken
	players take turns taking fields until the game is over
	there are two player in the game (X and O)
 */

import org.junit.Test;

public class TicTacToeTest {
	
	private TicTacToeGame game;
	
	@Before
	public void initialization() {
		 game = new TicTacToeGame();
	}

	
	@Test
	public void getHWinnerAllCols() {
		game.play('H', 0, 0);
		game.play('H', 1, 0);
		game.play('H', 2, 0);
		assertEquals('H', game.winner());
	}
	
	@Test
	public void getXWinnerAllCols() {
		game.play('X', 0, 0);
		game.play('X', 1, 0);
		game.play('X', 2, 0);
		assertEquals('X', game.winner());
	}
	
	@Test
	public void getXWinnerAllCols2() {
		game.play('X', 0, 1);
		game.play('X', 1, 1);
		game.play('X', 2, 1);
		assertEquals('X', game.winner());
	}
	
	@Test
	public void getWinnerDiagonal() {
		game.play('X', 0, 0);
		game.play('X', 1, 1);
		game.play('X', 2, 2);
		assertEquals('X', game.winner());
	}
	
	@Test
	public void testFullGame() {
		game.play('X', 0, 0);
		game.play('O', 1, 1);
		game.play('X', 0, 1);
		
		game.play('O', 0, 2);
		game.play('X', 2, 0);
		game.play('O', 1, 0);
		
		game.play('X', 2, 1);
		game.play('O', 1, 2);
		//game.play('X', 0, 0);
		
		assertEquals('O', game.winner());
	}
	
	//@Test
	public void canGetHWinner() {
		assertEquals('H', game.winner());
	}

}
