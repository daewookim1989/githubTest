package �������̽���������;

import java.util.Random;

public class PlusGame implements IGame {
	Random ran = new Random();
	int num1;
	int num2;
	
	@Override
	public void makeRandom() {
		num1 = ran.nextInt(9)+1;
		num2 = ran.nextInt(9)+1;
	}

	@Override
	public String getQuizMsg() {
		return num1+"+"+num2+"=";
	}

	@Override
	public boolean checkAnswer(int answer) {
		if(answer == (num1+num2)) {
			return true;
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
	
}
