package first;

public class LoopHW {

	public static void main(String[] args) {

/* 문제1.
아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.
 */
	/*	int num=120;

		if(num>0 && (num%2)==0) {

		System.out.println("양수이면서 짝수");

		}
		
/* 문제2.
다음과 같이 출력이 이루어지도록 작성해보자.	
 */
		int num = 100;
		
		if(num < 0) {
			System.out.println("0미만");
		}
		else if(0 <= num && num < 100) {
			System.out.println("100이상 200미만");
		}
		else if(100 <= num && num < 200) {
			System.out.println("100이상 200미만");
		}
		else if(200 <= num && num < 300) {
			System.out.println("200이상 300미만");
		}
		else {
			System.out.println("300 이상");
		}

/*문제3.
CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고,
if~else를 사용하는 형태로 변경해 보자. 
 */
		int num1=50, num2=100;

		int big, diff;
		
		if(num1>num2){
			big=num1;
		}
		else
			big=num2;
		System.out.println(big);
		
		if(num1>num2) {
		 diff = num1-num2;
		}
		else
			diff = num2-num1;
		
		//*****다시!!!
		
		
		
		System.out.println(diff);
		
		
	}

}
