package edu.ap.eightball;

public class DoubtfulState implements State {
	
	private Eightball ball;
	
	public DoubtfulState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("Very doubtful.");
	}
}
