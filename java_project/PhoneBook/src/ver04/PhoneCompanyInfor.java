package ver04;

public class PhoneCompanyInfor extends PhoneInfor {
	// 회사
	private String company;
	
	//생성자를 이용해서 초기화
	public PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company){
		super(name, phoneNumber, address, email);
		this.company = company;
	}
	
	@Override
	public void showInfor(){
		super.showInfor();
		System.out.println("회사 : " + company);
		}
}