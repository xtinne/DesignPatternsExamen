package edu.ap.eightball;

public class BetterNotTellState implements State {
	
	private Eightball ball;
	
	public BetterNotTellState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("Better not tell you now");
	}
}
