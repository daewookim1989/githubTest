package �������̽�����;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// GameDummy p1 = new GameDummy(); // --> �ӽ� �׽�Ʈ�뵵!
		PlusGame2 p1 = new PlusGame2();


		System.out.println("=====��Ģ�������=====");

		int count = 0;
		int answer = 0;
		int chance = 3;
		int correct = 0;

		while (count < 5) {
			System.out.println((count + 1) + "��° ����");
			p1.makeRandom();
			while (chance > 0) {
				System.out.println("������ȸ : " + chance + " / 3");
				System.out.print(p1.getQuizMsg());
				answer = sc.nextInt();
				if (p1.checkAnswer(answer)) {
					System.out.println("�����Դϴ�!");
					correct++;
					break;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�!");
					chance--;
				}
			}
			count++;
			chance = 3;
		}
		System.out.println("�� 5���� ���� �� " + correct + "�� �����Դϴ�.");
		System.out.println("������ �����մϴ�.");

	}

}
