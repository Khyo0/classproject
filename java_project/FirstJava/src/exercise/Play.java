package exercise;

public class Play {
	// 구슬치기, 딱지치기
	// 두 게임으로 개수 변환
	// 어린이1 구슬 15개, 어린이2 구슬 9개
	// 아이가 소유하고 있는 구슬의 개수 정보 출력
	
	// 변수 : 어린이1 구슬, 어린이2 구슬
	int kid1_ball = 15;
	int kid2_ball = 9;
	
	// 1차 게임 구슬치기
	void play_ball(int b) { // b : 어린이1 구슬 수 변화
		kid1_ball += b;
		kid2_ball -= b;
	}
	
	// 2차 게임 딱지치기
	void play_ticket(int t) { // t : 어린이1 구슬 수 변화
		kid1_ball += t;
		kid2_ball -= t;
	}
	
	public static void main(String[] args) {

		Play p = new Play ();
		
		p.play_ball(2);	// 1차 게임에서 어린이1이 구슬 2개 획득
		p.play_ticket(-7);	// 2차 게임에서 어린이2가 구슬 7개 획득 -> 어린이1 구슬 수 -7
		
		int kid1 = p.kid1_ball;
		int kid2 = p.kid2_ball;
		
		// 구슬 개수 출력
		System.out.println("어린이1의 구슬 개수 : " + kid1);
		System.out.println("어린이2의 구슬 개수 : " + kid2);
		
	}

}
