package fruit.ver02;

/*
	파일이름 : FruitBuyer.java
	     설명 : 구매자 객체 정의
	작성일시 : 2020.10.08
	수정내용 : fruit.FruitBuyer.java 기반으로 생성자 추가
*/

public class FruitBuyer {

	// 변수와 메서드 정의
	
	// 수정 : 2020.10.08
	//		변수 초기화-생성자에서 처리, 변수 선언시 초기화 코드 삭제함
	// 구매자의 소유 금액, 소유 사과 개수
	int myMoney;
	int numOfapple;
	
	// 기능 : 사과 구매, 현재 상태(금액, 사과 개수) 값 출력
	// 사과 구매
	// 		판매자 정보(객체)와 금액을 받아
	// 		판매자의 판매 메서드 호출 -> 사과 구매 개수 얻기
	//		나의 사과 개수 증가
	//		나의 보유 금액 감소
	
	// 2020.10.08 : 생성자 정의, 변수 초기화 목적
	/*
	public FruitBuyer() {
		this(5000, 0);
	}
	*/
	
	public FruitBuyer(int myMoney, int numOfapple) {
		this.myMoney = myMoney;		// this : 자신을 가리키는 참조변수
		this.numOfapple = numOfapple;
	}

	// 참조변수는 객체의 주소를 저장하고 있다. -> 셀러의 참조값을 받도록 참조변수를 매개변수로 정의
	// FruitSeller seller -> FruitSeller 클래스로 만든 객체의 주소를 저장하는 변수
	void buyApple(FruitSeller seller, int money) {
		
		// 구매 사과 개수 구하기
		int num = seller.saleApple(money);
		// 나의 사과 개수 증가
		numOfapple += num;
		// 나의 보유 금액 감소
		myMoney -= money;
	}

	// 현재 상태(금액, 사과 개수) 값 출력
	void showBuyResult() {
		System.out.println("보유 금액 : " + myMoney);
		System.out.println("보유 사과 개수 : " + numOfapple);
	}

}