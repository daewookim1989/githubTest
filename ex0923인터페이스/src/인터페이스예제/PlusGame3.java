package 인터페이스예제;

import java.util.Random;

public class PlusGame3 implements IGame {

	private Random ran;

	private int num1;
	private int num2;
	private String[] cals = { "+", "-", "*", "/" };
	private String cal = "";

	@Override
	public void makeRandom() {
		ran = new Random();
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;

		cal = cals[ran.nextInt(cals.length)];

		if (num1 < num2) {
			int temp = 0;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
	}

	@Override
	public String getQuizMsg() {

		return num1 + " " + cal + " " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(int answer) {

		if (cal.equals("+")) {
			return num1 + num2 == answer;
		} else if (cal.equals("-")) {
			return num1 - num2 == answer;
		} else if (cal.equals("*")) {
			return num1 * num2 == answer;
		} else if (cal.equals("/")) {
			return num1 / num2 == answer;
		} else {
			return false;
		}

	}

}
