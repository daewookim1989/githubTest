package �������̽�����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// GameDummy : �ӽ��׽�Ʈ��
		GameDummy p1 = new GameDummy();
		// PlusGame p1 = new PlusGame();
		
		// ���� Ƚ�� üũ
		// �����ȸ Ƚ�� üũ
		// ����ڷκ��� �� �Է�
		// �޽��� ���
		
		// Ƚ�� Ȯ������ ���� �����
		int gameCnt = 5;
		int answerCnt = 3;
		
				// ���� ����
				
				// 3���� ��ȸ�ְ� ���� ���� üũ�ϴ� �κ�
				// while�� �ٽ�? // for?
				
				for (int i = 5; i > 0; i--) {
					p1.makeRandom();
					String q = p1.getQuizMsg();
					for (int j = 3; j > 0; j--) {
						System.out.print(q);
						int userAnswer = sc.nextInt();

						if (p1.checkAnswer(userAnswer) == true) {
							System.out.println("�����Դϴ�!");
							break;

						} else if (p1.checkAnswer(userAnswer) == false) {
							answerCnt--;
							if(answerCnt==2) {
								System.out.println("�ѹ� �� �����غ�����");
							}else if(answerCnt == 1) {
								System.out.println("������ ��ȸ�Դϴ�.");
							}
						}

					}


				}
				System.out.println("������ ����ƽ��ϴ�.");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
