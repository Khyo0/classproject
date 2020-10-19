package ver04;

public class PhoneFamInfor extends PhoneInfor{
	// 가족
	private String relation;
	
	//생성자를 이용해서 초기화
	public PhoneFamInfor(String name, String phoneNumber, String address, String email, String relation){
		super(name, phoneNumber, address, email);
		this.relation = relation;
	}
	
	@Override
	public void showInfor(){
		super.showInfor();
		System.out.println("관계 : " + relation);
		}

}