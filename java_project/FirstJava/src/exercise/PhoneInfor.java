package exercise;

import java.util.Scanner;

class PhoneInfor{
	String name;	// 이름
	String phoneNumber;	// 전화번호
	String birthday;	// 생일

public PhoneInfor(String name, String phoneNumber, String birthday) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = birthday;
}

public PhoneInfor(String name, String phoneNumber) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = null;
}

public static void inputData() {
	Scanner sc = new Scanner(System. in);
	System.out.print("이름 입력\t\t");
	String name = sc.next();	// 이름 입력
	System.out.print("전화번호 입력\t");
	String phoneNumber = sc.next();	// 전화번호 입력
	System.out.print("생일 입력 (패스가능) ");
	String birthday = sc.next();	// 생일 입력

	PhoneInfor inputInfor = new PhoneInfor(name, phoneNumber, birthday);
	System.out.print("-> ");
	inputInfor.showInfor();
}

public void showInfor(){
	System.out.print("이름 : " + name);
	System.out.print("\t전화번호 : " + phoneNumber);
	if (birthday==null) {	// 생년월일 공란 가능하도록
		System.out.println("\t생일 : 공란");
	} else {
		System.out.println("\t생일 : " + birthday);
	}
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System. in);
	PhoneInfor phone;
	
	while(true){// 종료 전까지 무한루프
		System.out.println("1 : 입력 \n2 : 종료");
		int ask = sc.nextInt();	// 1, 2 중 고르기
		
		switch(ask) {
		case 1:
			inputData();
			break;
		case 2:
			System.out.println("종료되었습니다.");
			break;	// 종료
		}
	}
  }
}