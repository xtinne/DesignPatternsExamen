package edu.ap.eightball;

public class SourcesNoState implements State {
	
	private Eightball ball;
	
	public SourcesNoState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("My sources say no.");
	}
}
