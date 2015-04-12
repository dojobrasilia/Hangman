package org.dojo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HangmanTest {
	
	private Hangman game ;
	
	@Before
	public void init(){
		game = new Hangman();
	}
	
	
	@Test
	public void placeholderForSimpleWordTest(){
		String output = game.start("hello");
		assertEquals(".....", output);	
	}

	@Test
	public void placeholderForSpaceWorldTest(){
		String solution = "Hello World";
		
		Hangman game = new Hangman(solution);
		String output = game.start(solution);
		assertEquals("..... .....", output);		
	}
	
	@Test
	public void correctGuessTest() {
		String character = "l";
		String target = "hello";
		
		Hangman game = new Hangman(target);
		Boolean result = game.guessFunction(character);
		assertTrue(result);
	}
	

}
