package edu.ap.eightball;

public class Test {
	public static void main(String[] args) {
	Eightball eightball = Eightball.getInstance(); 
	
		for (int i = 1; i < 8; i++)
		{
			System.out.println("Vraag " + i + ": Ga ik slagen voor mijn examen?");
			eightball.answerQuestion();
		}
	}
}
