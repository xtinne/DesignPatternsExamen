package edu.ap.eightball;

public class DecidedlyState implements State {
	
	private Eightball ball;
	
	public DecidedlyState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("It is decidedly so");
	}
}
