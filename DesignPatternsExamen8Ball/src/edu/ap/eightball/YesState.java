package edu.ap.eightball;

public class YesState implements State {
	
	private Eightball ball;
	
	public YesState(Eightball e)
	{
		ball = e;
	}
	
	@Override
	public void answer() {
		System.out.println("Yes");
	}
}
