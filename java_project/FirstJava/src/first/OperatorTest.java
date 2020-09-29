package first;
import java.lang.Math;
import java.util.Scanner;
public class OperatorTest {
	
	public static void main(String[] args) {
		
		/*int num1 = 10;
		int num2 = 8;
		
		System.out.println("10 / 8 = " + num1/num2); // 1
		System.out.println("10 % -8 = " + num1%-num2); // 2
		System.out.println("10/-8 = " + num1/-8); // -1
		System.out.println("10f / 8f = " + 10f / 8f); // 1.25
		System.out.println("10f / 8 = " + 10f / 8); // 1.25
		System.out.println("10 / 8 = " + num1 / (float)num2); // 1.25
		*/
		
		char c1 = 'A';
		char c2 = 'B';
							// 연산자의 우선순위 때문에 () 삽입
		System.out.println("'A' < 'B' => " + (c1 < c2)); // 65 < 66 => true
		System.out.println("'0' == 0 => " +('0' == 0)); // 48 == 0 => false
		System.out.println("10.0d == 10.0f => " + (10.0d == 10.f)); // 10.0d == 10.0f => true
		System.out.println("0.1d == 0.1f => " +(0.1d == 0.1f)); // 0.1d == 0.1f => false
		
		// double d = 0.1f; -> float보다 double이 더 커서 자동으로 형변환
		double d = (double)0.1f;
		System.out.println("d => " + d); // d => 0.10000000149011612
		System.out.println("(float)d == 0.1f => " + ((float)d == 0.1f)); // (float)d == 0.1f => true
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result1 = num1 == 10 && num2 == 20;
						//1)true	3)true	2)true	=> true
		boolean result2 = num1 <= 12 || num2 >= 30;
						//1)true	3)true	2)false	=> true
		System.out.println("num1 == 10 && num2 == 20 => " + result1);
		System.out.println("num1 <= 12 || num2 >= 30 => " + result2);
		
		if( !(num1 == num2)) { // 논리부정 => 같지 않을 때 true, 같을 때 false
			System.out.println("num1과 num2는 같지 않다.");
		} else {
			System.out.println("num1과 num2는 같다.");
		}
		
		
		float pi = 3.141592f;
		float sPi = (int)(pi*100)/100f; // 3.14로 절사, 형변환
		//						/100 이면 3.0
		System.out.println(sPi); // 3.14
		
		int price = 12345;
		// 100단위까지 절사하기
		int price2 = price/1000;
		System.out.println(price2); // 12
		
		price2 = price/1000*1000;
		System.out.println(price2); // 12000
		
		
		
		float sPi2 = Math.round (pi*100)/100f; // pi = 3.141592f
		// Math의 full name은 java.lang.Math
		System.out.println(sPi2); // 3.14
		

		int i = 5;
		int j = 5;
		
		System.out.println(i++); // 출력 : 5, i = 6
		System.out.println(++j); // 출력 : 6, j = 6
		
		System.out.println("i = "+ i + ", j = : " + j); // i = 6, j = : 6
		
		
		// 문자열 처리 : String 클래스 이용 -> 객체 생성 -> 클래스가 가지는 변수와 메서드를 메모리에 로드한다.
		
		// 참조 변수 : 객체의 메모리 주소값을 저장하는 변수
		String str = null; // null -> 참조변수가 객체의 주소값을 저장하고 있지 않는다.
		
		str = "abc"; // "" 공백 문자열을 이용한 객체를 생성하고 주소값을 반환
		
		System.out.println(str.toString()); // abc 출력
		System.out.println(str.equals("abc")); // true 출력
		 // str.euals는 str의 문자열과 ()의 문자열을 비교
		if(str != null && !str.equals("")) {
			System.out.println(str.charAt(1)); // 0~3-1 -> 0, 1, 2
		} // b 출력
		
		
		num1 = 50;
		num2 = 20;
		
		int big = 0; // 큰 수
		int diff = 0; // 두 수의 차이
		
		// 삼항 연산자 이용
		/*
		// num1>num2가 true면 big=num1이고 false면 big=num2
		big = num1>num2 ? num1 : num2; // big = num1
		
		diff = num1>num2 ? num1-num2 : num2-num1; // diff = num1-num2
		
		System.out.println("큰 수 : " + big + ", 큰 수와 작은 수의 차 : " + diff);
		*/
		// if문 이용
		
		if(num1 > num2) {
			big = num1;
			diff = num1 - num2;
		} else {
			big = num2;
			diff = num2 - num1;
		}
		System.out.println("큰 수 : " + big + ", 큰 수와 작은 수의 차 : " + diff);
		
		
		int n = 3;
		/*
		switch(n) {
		
		case 1:
			System.out.println("Simple JAVA");
			break;
		case 2:
			System.out.println("Funny JAVA");
			break;
		case 3:
			System.out.println("Fantastic JAVA");
			break;
		default:
			System.out.println("Best JAVA");
		} // Fantastic JAVA 출력
		*/
		System.out.println("메뉴를 선택하세요 \n 1. 입력 2. 보기 3. 수정 4. 삭제");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		switch(n) {
		
		case 1:
			System.out.println("입력합니다.");
			System.out.println("Simple JAVA");
			break;
		case 2:
			System.out.println("데이터를 열람합니다.");
			System.out.println("Funny JAVA");
			break;
		case 3:
			System.out.println("정보를 수정합니다.");
			System.out.println("Fantastic JAVA");
			break;
		default:
			System.out.println("데이터를 삭제합니다.");
			System.out.println("Best JAVA");
		}
		
		
		
	}

}
