package edu.ap.eightball;

public class AskAgainState implements State {
	
	private Eightball ball;
	
	public AskAgainState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("Ask again later!");
	}

}
