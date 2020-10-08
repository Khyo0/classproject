package exercise;

import java.util.Scanner;

class PhoneInfor{
	String name;	// 이름
	String phoneNumber;	// 전화번호
	String birthday;	// 생년월일


 PhoneInfor(String name, String phoneNumber, String birthday) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = birthday;
	}

 PhoneInfor(String name, String phoneNumer) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = null;
}

void inputData() {
	Scanner sc = new Scanner(System. in);
	System.out.println("이름 입력");
	String name = sc.next();
	System.out.println("전화번호 입력");
	String phoneNumber = sc.next();
	System.out.println("생일 입력 (패스가능)");
	String birthday = sc.next();

}

void showInfor(){
	System.out.println("이름 : " + name);
	System.out.println("전화번호 : " + phoneNumber);
	if (birthday==null) {
		System.out.println("생년월일 : 공란");
	} else {
		System.out.println("생년월일 : " + birthday);
	}
}

public static void main(String[] args) {

		PhoneInfor phone1 = new PhoneInfor("name", "000-0000-0000", "0000");
		PhoneInfor phone2 = new PhoneInfor("NAME","000-1111-2222");
		phone1.showInfor();
		phone2.showInfor();
		
		/*
		 * while(true){//무한루프
System.out.println("1:입력 \n2:종료");
int input=keyboard.nextInt();
keyboard.nextLine();
if(input==1)
phone=input();
else
break;
		 */
		
		
	}

}