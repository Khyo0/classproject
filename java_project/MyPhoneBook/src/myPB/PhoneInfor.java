package myPB;

import java.io.Serializable;

public abstract class PhoneInfor implements Infor{
	
	private String name;		// 이름
	private String phoneNumber;	// 전화번호
	private String email;		// 이메일
	
	public PhoneInfor(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	// getter/setter 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override	// 하위에서 출력 가능
	public void showInfor() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("이메일 : " + email);
	}

}