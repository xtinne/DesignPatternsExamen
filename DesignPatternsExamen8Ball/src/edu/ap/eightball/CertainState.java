package edu.ap.eightball;

public class CertainState implements State {
	
	private Eightball ball;
	
	public CertainState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("It is certain");
	}

}
