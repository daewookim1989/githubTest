package 인터페이스예제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// GameDummy : 임시테스트용
		GameDummy p1 = new GameDummy();
		// PlusGame p1 = new PlusGame();
		
		// 게임 횟수 체크
		// 정답기회 횟수 체크
		// 사용자로부터 값 입력
		// 메시지 출력
		
		// 횟수 확인해줄 변수 만들기
		int gameCnt = 5;
		int answerCnt = 3;
		
				// 문제 출제
				
				// 3번의 기회주고 문제 정답 체크하는 부분
				// while로 다시? // for?
				
				for (int i = 5; i > 0; i--) {
					p1.makeRandom();
					String q = p1.getQuizMsg();
					for (int j = 3; j > 0; j--) {
						System.out.print(q);
						int userAnswer = sc.nextInt();

						if (p1.checkAnswer(userAnswer) == true) {
							System.out.println("정답입니다!");
							break;

						} else if (p1.checkAnswer(userAnswer) == false) {
							answerCnt--;
							if(answerCnt==2) {
								System.out.println("한번 더 생각해보세요");
							}else if(answerCnt == 1) {
								System.out.println("마지막 기회입니다.");
							}
						}

					}


				}
				System.out.println("게임이 종료됐습니다.");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
