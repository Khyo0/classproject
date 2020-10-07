package first;

public class SolutionOper2 {

	public static void main(String[] args) {
// 문제 3_1
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);	// 6
		// 3<<33 -> 3<<1 -> 3*2
		// int : 32bit (33번 쉬프트하지 않고 1번만 쉬프트)
		System.out.println(y >= 5 || x < 0 && x > 2);	// true
		// x:2, y:5 -> true || false && false
		System.out.println(y += 10 - x++);	// 13 -> 5+8
		System.out.println(x+=2);	// 5 -> 67-65
		System.out.println( !('A' <= c && c <='Z') );	// false
		System.out.println('C'-c);	// 2
		System.out.println('5'-'0');	// 5
		System.out.println(c+1);	// 66
		System.out.println(++c);	// 증가 후 출력	-> B (C에는 B가 들어있음)
		System.out.println(c++);	// 출력 후 증가 -> B (C에는 C가 들어있음)
		System.out.println(c);		// C

// 문제 3_2
	/* 사과의 수가 123개이고
	  하나의 바구니에는 10개의 사과를 담을 수 있다면,
	 13개의 바구니가 필요할 것이다.	
	 */
		/* 1) 전체 사과를 10으로 나눈 몫 : 바구니 개수
		 * 2) 전체 사과를 10으로 나눈 나머지가 0보다 크면 바누니 +1
		 * 		bucket = numofApple / 10;
		 * 		if(numofApple % 10 > 0) {
		 * 	 		numofBucket ++; }
		 */		
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10;
		// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		
	/*	// 1. 전체 사과의 개수를 10으로 나눈다.
		int numOfBucket - numOfAllpes/10;	// 12
		
		// 2. 전체 사과를 10으로 나눈 나머지를 구하고,
		// 나머지가 10보다 크면 바구니 개수 1 증가
		if(numOfApples%10>0) {
			numOfBucket++;
		}
	*/
		// 위 코드를 한줄로 -> 삼항연산자 이용
		int numOfBucket = numOfApples/10 + (numOfApples%10>0 ? 1 : 0);
		
		// 모든 사과를 담는데 필요한 바구니 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
	
// 문제 3_3
		int num = 10;
		
		System.out.println(num>0 ? "양수" : (num<0 ? "음수" : "0"));
		
// 문제 3_4
		num = 456;
		// 100이하 자리 버리기
		System.out.println(num / 100 * 100);
	
// 문제 3_5
		num = 777;
		
		System.out.println(num / 10 * 10 + 1);
		
// 문제 3_6
		num = 24;
		
		System.out.println(10 - num % 10);
		
// 문제 3_7
		int fahrenheit =100;

		float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5)/100f;
		
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
// 문제 3_8
		// byte, short, char 연산자의 경우 int 자료형으로 변환 후 연산
		byte a = 10;
		byte b = 20;
		byte cc = (byte)(a+b); // byte cc = a + b;
		char ch = 'A';
		ch = (char)(ch + 2);// ch = ch + 2;
		float f = (float)3/2;// float f = 3 / 2;
		long l = (long)3000*3000*3000;// long l = 3000 * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;// boolean result = d==f2;

		System.out.println("cc="+cc); // cc=30
		System.out.println("ch="+ch); // ch=C
		System.out.println("f="+f); // f=1.5
		System.out.println("l="+l); // l=27000000000
		System.out.println("result="+result); // result=true
		
// 문제 3_9
		ch = 'z';
		boolean bb = ('a' <= ch && ch <= 'z')
				|| ('A' <= ch && ch <= 'z')
				|| (ch>='0'&&ch<='9');
		
		System.out.println(bb);
		
// 문제 3_10
		ch = 'A';
		char lowerCase = (ch>='A' && ch<='Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch : " +ch);
		System.out.println("lowerCase : " + lowerCase);
		
	}

}
