package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TenPinBowlingTest {
	
	static TenPinBowling tenPinBowling;
	
	@Before
	public void initialization() {
		tenPinBowling = new TenPinBowling();
	}

	@Ignore
	public void TestOneFrameNoStrikNoSpare() {
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		// testing a strike 
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		// testing a strike 
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		assertEquals(10*10, tenPinBowling.score());
		//assertEquals(88, tenPinBowling.score());
	}
	
	@Ignore
	public void TestOneFrameWithStrikNoSpare() {
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//testing a strike 
		tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//testing a strike 
		tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		assertEquals(10*10 + 10+10, tenPinBowling.score());
		//assertEquals(88, tenPinBowling.score());
	}
	
	@Ignore
	public void TestOneFrameWithStrikAfterStrike() {
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//testing a strike 
		tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//testing a strike 
		tenPinBowling.ball(10);
		tenPinBowling.ball(10);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		assertEquals(139, tenPinBowling.score());
		//assertEquals(88, tenPinBowling.score());
	}
	
	@Test
	public void TestWithLastStrik() {
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//testing a strike 
		tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//testing a strike 
		tenPinBowling.ball(10);
		tenPinBowling.ball(10);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(10); //last frame
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		assertEquals(159, tenPinBowling.score());
		//assertEquals(88, tenPinBowling.score());
	}
	
	@Test
	public void TestWithLastStrikWithBonus10() {
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//testing a strike 
		tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		//testing a strike 
		tenPinBowling.ball(10);
		tenPinBowling.ball(10);
		//tenPinBowling.ball(10);
		tenPinBowling.ball(9);
		tenPinBowling.ball(1);
		tenPinBowling.ball(10); //last frame
		tenPinBowling.ball(10);
		assertEquals(159, tenPinBowling.score());
		//assertEquals(88, tenPinBowling.score());
	}
	
	

}
