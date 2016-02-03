package edu.ap.eightball;

public class Test {
	public static void main(String[] args) {
	Eightball eightball = Eightball.getInstance(); 
	
		for (int i = 0; i < 10; i++)
		{ 
			System.out.println("Vraag " + (i + 1) + ": Ga ik slagen voor mijn examen?");
			eightball.answerQuestion();
		}
	}
}
