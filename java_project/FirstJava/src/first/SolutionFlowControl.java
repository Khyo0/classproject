package first;

import java.util.Scanner;

public class SolutionFlowControl {

	public static void main(String[] args) {

// 문제 1
		// if문 2개 -> if문 1개
		int num = 120;
		
		if(num>0 && num%2==0) {
			System.out.println("양수이면서 짝수");
		}

// 문제 2
		// else if로 표현
		if(num<0) {
			System.out.println("0미만");
		} else if(num<100) {	// num>=0 && num>100
			System.out.println("0이상 100미만");
		} else if(num<200) {
			System.out.println("100이상 200미만");	// num>=100  && num<200
		} else if(num<300) {	//num>=200 && num <300
			System.out.println("200이상 300 미만");
		} else {
			System.out.println("300이상");
		}
		
// 문제 3
		// 3항 연산자 -> if~else
		int num1 = 50, num2 = 100;
		int big, diff;
		
		//big = (num1>num2) ? num1 : num2;
		if(num1>num2) {
			big = num1;
		} else {
			big = num2;
		}
		System.out.println(big);
		
		// diff = (num1>num2) ? num1-num2 : num2-num1;
		if(num1>num2) {
			diff = num1-num2;
		} else {
			diff = num2-num1;
		}
		System.out.println(diff);
		
// 문제 4
		// switch문 -> if~else
		int n=3;

		/*
		switch(n) {

		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The best programming language");
		}
		*/

		if(n==1) {
			System.out.println("Simple Java");
		} else if(n==2) {
			System.out.println("Funny Java");
		} else if(n==3) {
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming language");
		}
		
// 문제 5
		// 문제 2 -> switch문
		if(num<0) {
			System.out.println("0미만");
		} else {
			
			switch(num/100) {	// 120 -> 120/100 -> 1
			case 0:
				System.out.println("0이상 100미만");
				break;
			case 1:
				System.out.println("100이상 200미만");
				break;
			case 2:
				System.out.println("200이상 300미만");
				break;
			default:	// break 없어도 종료
				System.out.println("300이상");	
			}
		}
		
// 문제 6
		// while 문으로 1부터 99까지 합을 구하는 프로그램
		int i = 0;
		int sum = 0;
		
		while(i<100) {
			System.out.println("sum = " + sum + "+ i = " + i);
			sum += i;
			i++;
		}
		
		System.out.println("1~99 까지 합 : " + sum);
		
// 문제 7
		// 1~100 출력 후 -> while
		// 다시 100~1 출력 -> do while
		int cnt = 1;
		
		while(cnt<=100) {
			System.out.println(cnt++);
			// cnt++;
		}
		do {
			// cnt--;
			System.out.println(--cnt);
		} while(cnt>1);
		
// 문제 8
		// 1000 이하 자연수(0보다 큼)중에서
		// 2의 배수&&7의 배수 출력
		// 출력된 숫자들의 합
		// while문으로 작성
		
		i = 1;
		sum = 0;
		int count = 0;	// 개수 구하기
		
		while(i<=1000) {
			if(i%2==0 && i%7==0) {
				System.out.println(i);
				count++;
				sum += i;
			}
			i++;
		}
		System.out.println("1000이하의 자연수 중 14 배수들 개수 : " + count);
		System.out.println("1000이하의 자연수 중 14의 배수들 합 : " + sum);
		
// 문제 9
		// for문 -> 1부터 10까지 곱해서 결과 출력
		
		int result = 1;
		for(i=1; i<=10; i++) {
			result = result * i;	// result *= i;
		}
		System.out.println("1~10까지 곱 : " + result);
		
// 문제 10
		// for문 -> 구구단 중 5단 출력
		Scanner sc = new Scanner(System. in);
		
		System.out.println("원하는 구구단 입력 : ");
		
		int select = sc.nextInt();
		
		for(i=1; i<10; i++) {
			System.out.println(select + " X " + i + " = " + select*i);
		}
		
// 문제 11
		// while문 -> for문
		num = 0;
		count = 0;
		
		/*
		while((num++) < 100) {
			if(num%5 != 0 || num%7 != 0)
				continue;
			count++;
			System.out.println(num);
		}
		*/
		
		for(num=1; num<100; num++) {
			if(num%5 != 0 || num%7 != 0) {
				continue;
			}
			count++;
			System.out.println(num);
		}
		System.out.println("count : " +count);
		
// 문제 12
		// 자연수 1부터 시작해서
		// (모든 홀수)와 (3의 배수인 짝수) 더하기 -> 모든 홀수 || (3의 배수&&짝수)
		// 그리고 1000이 넘어선 값은 얼마인지 계산해서 출력 -> 그리고 = ||
		// while문 무한루프로 작성
		
		num = 1;
		sum = 0;
		
		while(true) {
		
			// (모든 홀수) or(3의 배수인 짝수)
			// 논리연산에서 &&가 ||보다 우선순위이기 때문에 괄호 생략 가능
			// num%2==1 || (num%3==0 && num%2==0)
			if(num%2==1 || num%3==0 && num%2==0) {
				sum += num;
			}
			if(sum>1000) {
				System.out.println(num + "을 더하면 ");
				System.out.println("최초로 합이 넘어가는 합 : " + sum);
				break;
			}
			num++;
			
		}
		
// 문제 13
		// 구구단의
		// 짝수 단(2,4,8)만 출력하는 프로그램
		// 단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8까지 출력
		
		//단
		for(i=2; i<10; i=i*2) {
			System.out.println(i+"단");
			for(int j=1; j<i+1; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		
// 문제 14
		System.out.println("  A B");
		System.out.println("+ B A");
		System.out.println("-------");
		System.out.println("  9 9");
		System.out.println("위의 조건이 성립하는 조합은 아래와 같다.");
		
		for(n=0; n<10; n++) {	// a+b=9, a=9-b
			int a, b;
			a=n;
			b=9-n;
			System.out.println("A = "+a+"일때, B = "+b+"이다.");
		}
		
	}
}