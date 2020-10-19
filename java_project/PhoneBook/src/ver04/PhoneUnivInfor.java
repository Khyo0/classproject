package ver04;

public class PhoneUnivInfor extends PhoneInfor{
	// 대학
	private String major;	// 전공
	private String year;	// 학년
	
	public PhoneUnivInfor (String name, String phoneNumber, String address, String email, String major, String year) {
		super(name, phoneNumber, address, email);
		this.major = major;
		this.year = year;
	}
	
	@Override
	public void showInfor(){
		super.showInfor();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
	}
	
}