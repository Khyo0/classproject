package first;

public class MyMeth {

	// 변수 선언
	int num = 10;
	
	// 정수 2개를 받아 / 덧셈 연산을 하고 / 그 결과를 반환하는 메서드
	long add(long n1, long n2) {
		
		long result = n1 + n2;
		
		return result;
	} // 메서드가 종료되면 result도 소멸
	
	void sayHello() { //void는 return 없어도 됨.
		System.out.println("안녕하세요~ 여러분!!");
	}

	// 정수 2개를 받아 / 덧셈의 / 결과를 출력하는 메서드
	void plus(int num1, int num2) {
		
		int result = num1 + num2;
		
		System.out.println(result);
	}// return 없음
	
	boolean check() {
		
		boolean result = num < 20; // num=10
		
		return false;
	}
	
	// 정수 2개를 받아 / 나눗셈한 / 결과를 출력하는 메서드
	void div(int num1, int num2){
		
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈의 결과 : " + num1/num2);
		// /의 우선순위가 +보다 높아서 괄호 안해도 됨
		
	}
	
}
