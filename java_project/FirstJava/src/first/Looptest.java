package first;

public class Looptest {

	public static void main(String[] args) {
		
// while Loop
		// 반복의 횟수를 체크하기 위한 인덱스
		int i=0;
		
		while (i<5) {
			System.out.println("자바 안녕~!! - "+i);
			i++; // 탈출을 위한 연산식
		}
		// i => 5
		System.out.println("===============");
	/*
		// 0 부터 몇 까지 더했을 때, 합이 100을 넘어가는지 확인하는 프로그램
				sum = 0;
				i = 0;
				
				//몇 번을 반복해야 하는지 모르는 경우 : 무한반복 처리
				while(true) {
					
					// 탈출의 조건
					if(sum>100) {
						break;
					}
					i++; // 더하는 수의 증가
					sum += i; // 합을 구하는 연산
				}
				System.out.println(i + "를 더했을 때, 100이 넘어갑니다. 100이 넘어가는 최초의 값은 "+ sum);
	*/
				System.out.println("===============");
// do while Loop
				// 최소 한 번 실행 후 조건에 맞게 반복 실행 -> 조건에 상관없이 무조건 한 번 실행
		do {
			System.out.println("안녕 자바!! - "+i);
			i++;
		} while (i<5); // 5 출력
		System.out.println("===============");
		
// for Loop
		int sum = 0; // 합을 구하기 위한 변수
		
		for(int j=1; j<11; j++) { // j는 이 for블럭 안에서만 사용가능한 변수
			sum = sum + j;
		}
		System.out.println("1~10까지의 합 : " + sum);
		System.out.println("===============");
		
// continue Loop		
		// 1~10 까지의 수 중 3의 배수를 생략하고 출력하기
		for(i=0; i<11; i++) {
			if(i%3==0) { // 3의 배수
				continue;
			}
			System.out.println(i);
		}
		System.out.println("===============");
		/* 이것도 같은 결과
		 if (!(i%3==0)){
		 System.out.println(i);
		 } */
		
	// continue를 이용한 숫자 찾기
		// 0~99까지의 숫자 중에서 5의 배수이면서 7의 배수인 숫자를 출력하고 총 개수 출력
		int num = 0;
		int count = 0;
		
		while(num<100) {
			num++;
			if(num%5!=0 || num%7!=0) { // !(num%5==0 and num%7==0)랑 같은 조건
				continue;
			}
			count++;
			System.out.println(num);	
		}
		System.out.println("0~99 사이의 숫자 중에 5와 7의 공배수인 숫자는 모두 " + count + "개가 있습니다.");
		System.out.println("===============");
		
// 반복문의 중첩
		// [i,j] i와 j가 짝수면 탈출
		for(i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println("["+i+","+j+"]"); // [1,1] [2,2]
				if(i%2==0 && j%2==0) {
					break;
				}
			}
		}
		/* 밖의 for문도 탈출 
		  outerLoop : for(i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println("["+i+","+j+"]"); // [1,1] [2,2]
				if(i%2==0 && j%2==0){
					break outerLoop;
				}
			} */
					
		
	}

}
