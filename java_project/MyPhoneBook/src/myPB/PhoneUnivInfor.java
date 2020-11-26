package myPB;

public class PhoneUnivInfor extends PhoneInfor {
	
	private String address;	// 주소
	private String major;	// 전공
	private int year;		// 학년
	
	public PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, int year) {
		
		super(name, phoneNumber, email);
		this.address = address;
		this.major = major;
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("주소 : " + address);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
	}
	
	@Override
	public void showBasicInfor() {
		super.showInfor();
	}
	
}