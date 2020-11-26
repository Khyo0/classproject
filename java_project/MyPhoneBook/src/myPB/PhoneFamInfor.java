package myPB;

public class PhoneFamInfor extends PhoneInfor{
	
	private String relations;	// 관계
	
	public PhoneFamInfor(String name, String phoneNumber, String email, String relations) {
		super(name, phoneNumber, email);
		this.relations = relations;
	}

	public String getRelations() {
		return relations;
	}

	public void setRelations(String relations) {
		this.relations = relations;
	}
	
	@Override
	public void showInfor() {
		System.out.println("가족관계 : " + relations);
	}
	
	@Override
	public void showBasicInfor() {
		super.showInfor();
	}

}