package myPB;

public class PhoneCompanyInfor extends PhoneInfor{
	
	private String company;	// 회사
	
	public PhoneCompanyInfor(String name, String phoneNumber, String email, String company) {
		
		super(name, phoneNumber, email);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("회사 : " + company);
	}
	
	@Override
	public void showBasicInfor() {
		super.showInfor();
	}

}