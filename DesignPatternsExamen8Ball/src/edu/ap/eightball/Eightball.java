package edu.ap.eightball;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Eightball {
	State certainState;
	State askAgainState;
	State sourcesNoState;
	State concentrateState;
	State doubtfulState;
	State betterNotTellState;
	State relyState;
	State dontCountState;
	
	Random r = new Random();
	
	Queue<Integer> q = new LinkedList<Integer>();
	
	State state;
	
	private static Eightball eightball;

    public static Eightball getInstance() {
        if (eightball == null) {
            eightball = new Eightball();
        }
        return eightball;
    }

	private Eightball()
	{
		certainState = new CertainState(this);
		askAgainState = new AskAgainState(this);
		sourcesNoState = new SourcesNoState(this);
		concentrateState = new ConcentrateState(this);
		doubtfulState = new DoubtfulState(this);
		betterNotTellState = new BetterNotTellState(this);
		relyState = new RelyState(this);
		dontCountState = new DontCountState(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void answerQuestion() {
		Queue<Integer> randoms = new LinkedList<Integer>();
		int a = r.nextInt(8);
		if (q != null)
		{
			if (randoms.contains(a) && q.contains(a))
			{
				randoms.add(a);
				a = r.nextInt(8);
			}
			else
				q.add(a);
		}
		else
		{
			q.add(a);
		}
		
		switch (a) {
        case 0:  state = certainState;
                 break;
        case 1:  state = askAgainState;
                 break;
        case 2:  state = sourcesNoState;
                 break;
        case 3:  state = concentrateState;
                 break;
        case 4:  state = doubtfulState;
                 break;
        case 5:  state = betterNotTellState;
                 break;
        case 6:  state = relyState;
                 break;
        case 7:  state = dontCountState;
                 break;
        default: System.out.println("Er is geen antwoord.");
                 break;
    }
		
		state.answer();
	}
}
