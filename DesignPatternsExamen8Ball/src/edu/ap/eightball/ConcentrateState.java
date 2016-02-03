package edu.ap.eightball;

public class ConcentrateState implements State {
	
	private Eightball ball;
	
	public ConcentrateState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("Concentrate and ask again.");
	}
}
