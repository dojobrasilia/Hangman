package org.dojo;

public class Hangman {
	
	private String word;
	private Integer life;
	
	public Hangman(String word) {
		this.word = word;
		life = 5;
	}

	public Hangman() {
		life = 5;
	}

	public String start(String word) {
		String cypheredWord = word.replaceAll("\\S", ".");
		System.out.println(cypheredWord);
		return cypheredWord;
	}
	
	public Boolean guessFunction(String guess) {
		
		return true;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}
}
