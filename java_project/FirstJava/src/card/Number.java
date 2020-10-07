package card;

public class Number {

	int num;
	
	Number(int number){
		num = number;	// num에 100
		System.out.println("생성자가 실행되었습니다.");
	}
	
	Number(){	// 오버로딩(동일한 이름) 가능
		num = 10;
		System.out.println("생성자가 실행되었습니다.");
	}
	
	int getNumber() {
		return num;
	}
	
}