package ver04;
public class PhoneInfor {

	private String name;		// 이름
	private String phoneNumber; // 전화번호
	private String address;		// 주소
	private String email;		// 이메일
	
	// 생성자 : 3개의 데이터를 받아 초기화
	public PhoneInfor(String name, String phoneNumber, String address, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	
	// 저장된 데이터의 적절한 출력 메서드
	public void showInfor() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("주소 : " + address);
		System.out.println("이메일 : " + email);
	}
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}

}