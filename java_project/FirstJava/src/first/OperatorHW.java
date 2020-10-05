package first;

public class OperatorHW {

	public static void main(String[] args) {

/*문제1.
int 형 변수 num1, num2, num3가 각각 10,20,30 으로 초기화 되어 있다.
다음문장을 실행하면 각각 변수에는 어떠한 값이 저장되겠는가?
num1=num2=num3 ;
확인 하는 코드를 작성하고, 그 결과에 대해 설명.

 */
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		num1=num2=num3;
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		System.out.println("num3 : "+ num3);
		
		// 연산 방향이 <- 이기에 모두 30이 출력된다.
		
/*문제2.
수학식 {{(25x5)+(36-4)}-72}/5 의 계산결과를 출력하는 프로그램 작성.	
 */
	/*	int result  = (((25*5)+(36-4))-72)/5;
		System.out.println(result);	
	*/	
		// 괄호를 {}에서 () 으로 바꾸고 곱하기를 x에서 *로 바꾼다
		
/*문제3.
3+6, 3+6+9, 3+6+9+12 의 연산을 하는 프로그램 작성.
단. 덧셈 연산의 횟수 최소화 		
 */
		int sum = 0;
		for(int i=3; i<=12; i+=3) {
			sum+=i;
			System.out.println(sum);
		}
		
		// for문으로 3씩 증가시키고 sum으로 더한 값을 받는다.
		
/*문제4.
a= {{(25+5)+(36/4)}-72}*5, b= {{(25x5)+(36-4)}-71}/4, c=(128/4)*2 일 때
a>b>c 가 참이면 true 아니면 false를 출력하는 프로그램 작성	
 */
	/*	int a = (((25+5)+(36/4))-72)*5;
		int b = (((25*5)+(36-4))-71)/4;
		int c = (128/4)*2;
		
		if(a>b && b>c) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// if문을 이용해 a<b<c 조건을 a<b && b<c로 하여 true 혹은 false를 출력한다.
*/	
// 추가문제 1번
		
		int x = 2;

		int y = 5;

	//	char c = 'A'; // 'A'의문자코드는 65
		
		/*연산자 우선순위 : 산술 > 비교 > 논리 > 대입
						단항 > 이항 > 삼항
						단항, 대입 연산자만 <-    */
/*
		System.out.println(y+= 10 - x++); // 13

		System.out.println(x+=2); // 5

		System.out.println(!('A' <= c && c <='Z') ); // false

		System.out.println('C'-c); // 2

		System.out.println('5'-'0'); // 5

		System.out.println(c+1); // 66

		System.out.println(++c); // B

		System.out.println(c++); // B

		System.out.println(c); // C
	*/	
/* 추가문제 2
아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
만일 사과의수가 123개이고 하나의 바구니에는10개의 사과를 담을 수 있다면,13개의 바구니가 필요할 것이다.
(1)에 알맞은 코드를 넣으시오.
3항 연산자 : 다음에 풀어도 됩니다.
 */

		int numOfApples =123; // 사과의 개수

		int sizeOfBucket =10;

		 // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)

		int numOfBucket = (numOfApples%sizeOfBucket==0)?numOfApples/sizeOfBucket:(numOfApples/sizeOfBucket)+1;
		

		 // 모든 사과를담는데 필요한 바구니의 수

		System.out.println("필요한바구니의 수 :"+numOfBucket);

		//삼항 연산자로 다시풀기
		
/* 추가문제 3
[3] 아래는 변수num의 값에 따라 ‘양수’,‘음수’,‘0’을 출력하는 코드이다.
삼항 연산자를 이용해서(1)에 알맞은 코드를 넣으시오.
[Hint] 삼항 연산자를 두 번 사용하라.
3항 연산자 : 다음에 풀어도 됩니다.
 */
		int num = 10;

		System.out.println(num>0?"양수":num==0?"0":"음수");
		
/* 추가문제 4
[4] 아래는 변수num의 값 중에서 백의 자리 이하를 버리는 코드이다.
만일 변수 num 의 값이‘456’이라면 ‘400’이 되고,‘111’이라면 ‘100’이 된다.
(1)에 알맞은 코드를 넣으시오.
 */
		
	/*	int num = 456;

		System.out.println(num/100 + "00");
		
/* 추가문제 5
[5] 아래는 변수num의 값 중에서 일의 자리를1로 바꾸는 코드이다.
만일 변수 num의값이 333이라면 331이 되고,777이라면 771이 된다.
(1)에 알맞은 코드를 넣으시오.
 */
	/*	int num = 333;

		System.out.println(num/10 + "1");
		
/* 추가문제 6
[6] 아래는 변수num의 값보다 크면서도 가장 가까운10의 배수에서 변수num의 값을뺀 나머지를 구하는 코드이다.
예를 들어, 24의 크면서도 가장 가까운10의 배수는 30이다.
19의 경우 20이고,81의 경우 90이 된다.
30에서 24를 뺀 나머지는6이기 때문에 변수num의 값이 24라면6을결과로 얻어야 한다.
(1)에 알맞은 코드를 넣으시오.
[Hint] 나머지 연산자를 사용하라.		
 */
		
	/*	int num = 24;

		System.out.println(10-num%10);
		
/* 추가문제 7
[7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
변환공식이 'C =5/9 ×(F - 32)'라고 할 때,(1)에 알맞은 코드를 넣으시오.
단, 변환 결과값은 소수점셋째 자리에서 반올림해야 한다.
(Math.round()를 사용하지 않고 처리할 것)		
 */
		
		int fahrenheit =100;

		float celcius = (float)5/9 * (fahrenheit-32);
		if((celcius*1000)%10>=5) {
			celcius = (int)(celcius*100)+1;
		} celcius = celcius/100f;
		
		System.out.println("Fahrenheit:"+fahrenheit);

		System.out.println("Celcius:"+celcius);
		
/* 추가문제 8
[8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.		
 */
/*
		byte a = 10;

		byte b = 20;

		byte c = (byte)(a+b); // byte c = a + b;

		char ch = 'A';

		ch = (char)(ch + 2);// ch = ch + 2;

		float f = (float)3/2;// float f = 3 / 2;

		long l = (long)3000*3000*3000;// long l = 3000 * 3000 * 3000;

		float f2 = 0.1f;

		double d = 0.1;

		boolean result = (float)d==f2;// boolean result = d==f2;

		System.out.println("c="+c); // c=30

		System.out.println("ch="+ch); // ch=C

		System.out.println("f="+f); // f=1.5

		System.out.println("l="+l); // l=27000000000

		System.out.println("result="+result); // result=true
		
/* 추가문제 9
[9] 다음은 문자형 변수ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수b의 값이true가 되도록 하는 코드이다.
(1)에 알맞은 코드를 넣으시오. 		
 */
	/*	char ch = 'z';

		boolean b = ((ch>='0' && ch<='z')||(ch>='A' && ch<='z')||(ch>='0'&&ch<='9'));

		System.out.println(b);
		
/* 추가문제 10
[10] 다음은 대문자를 소문자로 변경하는 코드인데,문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
문자코드는 소문자가 대문자보다32만큼 더 크다.
예를들어 'A‘의 코드는65이고 ’a'의 코드는97이다.
(1)~(2)에 알맞은 코드를 넣으시오.		
 */
		char ch = 'A';

		char lowerCase = (ch>='A'&&ch<='Z')?(char)((int)ch+32):ch;

		System.out.println("ch:"+ch);

		System.out.println("chto lowerCase:"+lowerCase);

	
	}

}
