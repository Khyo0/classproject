package exercise;

class PhoneInfor{
	String name;	// 이름
	String phoneNumber;	// 전화번호
	String birthday;	// 생년월일


public PhoneInfor(String name, String phoneNumber, String birthday) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = birthday;
	}

public PhoneInfor(String name, String phoneNumer) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = null;
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
	}

}