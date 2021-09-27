package 인터페이스예제;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// GameDummy p1 = new GameDummy(); // --> 임시 테스트용도!
		PlusGame2 p1 = new PlusGame2();


		System.out.println("=====사칙연산게임=====");

		int count = 0;
		int answer = 0;
		int chance = 3;
		int correct = 0;

		while (count < 5) {
			System.out.println((count + 1) + "번째 게임");
			p1.makeRandom();
			while (chance > 0) {
				System.out.println("남은기회 : " + chance + " / 3");
				System.out.print(p1.getQuizMsg());
				answer = sc.nextInt();
				if (p1.checkAnswer(answer)) {
					System.out.println("정답입니다!");
					correct++;
					break;
				} else {
					System.out.println("틀렸습니다!");
					chance--;
				}
			}
			count++;
			chance = 3;
		}
		System.out.println("총 5개의 문제 중 " + correct + "개 정답입니다.");
		System.out.println("게임을 종료합니다.");

	}

}
