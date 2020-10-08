package fruit.ver02;

/*
 	파일이름 : FruitSeller.java
 	     설명 : 사과 장수 객체 정의
 	작성일시 : 2020.10.08
 	수정내용 : fruit.FruitSeller.java 기반으로 생성자 추가
 */

public class FruitSeller {

	// 클래스에는 변수와 메서드를 정의
	// 성격이 비슷한 변수 메서드를 정의
	
	// 수정 : 2020.10.08
	//		변수 초기화-생성자에서 처리, 변수 선언시 초기화 코드 삭제함
	// 변수 : 인스턴스 변수, 멤버 변수
	// int applePrice = 1000;		// 사과 가격
	final int APPLE_PRICE;	// 사과 가격, final-변경되지 않도록 상수 선언
	int numOfApple;			// 사과 보유 개수
	int myMoney;				// 수익 금액
	
	// 2020.10.08 생성자 추가
	FruitSeller(){	// 기본 생성자
		this(0, 20, 1000);
	}
	
	FruitSeller(int money, int num, int price){
		APPLE_PRICE = price;
		numOfApple =num;
		myMoney = money;
	}
	
	FruitSeller(FruitSeller seller){
		// APPLE_PRICE = seller.APPLE_PRICE;
		// numOfApple = seller.numOfApple;
		// myMoney = seller.myMoney;
		this(seller.myMoney, seller.numOfApple, seller.APPLE_PRICE);
	}
	
	// 기능 : 판매, 정산 결과 출력
	// 판매 메서드 : 
	//			돈을 받고->
	// 					반환해야 하는 사과 개수,
	//					수익금 증가,
	//					보유 사과 개수 감소->
	// 									사과 개수 반환
	int saleApple(int money) { // 괄호 안의 매개변수는 초기화 안해도 된다.
		
		int num = 0;	// 반환할 사과 개수, 지역변수는 반드시 초기화 해주어야 한다.
		
		// 반환할 사과개수 구하기
		num = money / APPLE_PRICE;	// 받은 돈 / 사과 가격
		// 수익금 증가
		myMoney = myMoney + money;
		// 사과 개수 감소
		numOfApple = numOfApple - num;
		
		return num;
		
	}
	
	// 정산 출력 : 보유한 사과 개수 출력, 보유 금액 출력,
	// 받는 데이터가 없음-매개변수 정의 X
	// 반환하는 데이터 없음X-void 타입으로 메서드 정의
	void showSaleResult() {
		System.out.println("현재 보유한 사과 개수 : " + numOfApple);
		System.out.println("판매 수익 금액 : " + myMoney);
	}
	
}
