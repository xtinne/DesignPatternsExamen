package edu.ap.eightball;

public class RelyState implements State {
		
		private Eightball ball;
		
		public RelyState(Eightball e)
		{
			ball = e;
		}
		
		@Override
		public void answer() {
			System.out.println("You may rely on it.");
		}
}
