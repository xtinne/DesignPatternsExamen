package edu.ap.eightball;

public class DontCountState implements State {
	
	private Eightball ball;
	
	public DontCountState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("Don't count on it");
	}
}
