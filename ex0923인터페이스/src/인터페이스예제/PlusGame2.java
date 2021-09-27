package 인터페이스예제;

import java.util.Random;

public class PlusGame2 implements IGame {

	private Random ran;
	private int num1;
	private int num2;


	@Override
	public void makeRandom() {
		ran = new Random();
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
	}

	@Override
	public String getQuizMsg() {
		return num1 + " + " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(int answer) {
			return num1 + num2 == answer;
	}

}
