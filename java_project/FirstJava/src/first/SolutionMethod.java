package first;

public class SolutionMethod {

	public static void main(String[] args) {
		
		// 문제 1 메서드 호출
		cal(300, 7);
		System.out.println("====================");
		
		// 문제 2 메서드 호출
		abs(-3, -8);
		System.out.println("====================");
		
		// 문제 3 메서드 호출
		// 원 넓이
		System.out.println(cirArea(5));
		// 원 둘레
		System.out.println(circu(5));
		System.out.println("====================");
		
		// 문제 4
		System.out.println(isPrimeNumber(3));
		// 1~100 범위에서 소수 찾기
		for(int i=1; i<101; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
		
	}	
//문제1
	// 두 개의 정수를 전달받아서,
	// 두수의 사칙연산 결과를 출력하는 메서드와
	// 이 메서드를 호출하는 main메서드를 정의해보자.
	// 단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	// return이 없다.
	static void cal(int num1, int num2) {
		// 사칙연산 : +, -, *, /, %
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
	}
//문제2
	// 두 개의 정수를 전달 받아서,
	// 두수의 절대값을 계산하여 출력하는 메서드와
	// 이 메서드를 호출하는 main메서드를 정의해 보자.
	// 단 메서드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다.
	// return이 없다.
	static void abs(int num1, int num2) {
		System.out.println("num1 절대값 : " + (num1>0? num1: num1*-1));
		System.out.println("num2 절대값 : " + (num2>0? num2: num2*-1));
	}
//문제3
	// 원의 반지름 정보를 전달하면,
	// 원의 넓이를 계산해서 반환하는 메서드와	(2*π*r)
	// 원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고		(π*r∧2)
	// 이를 호출하는 main메서드를 정의하자.
	static double cirArea(double radius) {
		return Math.PI*radius*radius;
	}
	static double circu(double radius) {
		return 2 * Math.PI * radius;
	}
//문제4
	// 전달되는 값이 : 1~100
	// 소수(prime number)인지 아닌지를 판단하여,
	// 소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고,
	// 이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
	static boolean isPrimeNumber(int num) {
		boolean result = true;
		
		int cnt = 0;
		// 소수인지 판별 -> 들어오는 숫자를 나눠서
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		return cnt>2? false: true;
	}

}