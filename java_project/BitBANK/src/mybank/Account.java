package mybank;

public class Account {

	private String AccountNumber; // 계좌번호
	private String AccountName;         // 이름
	private String password;     // 계좌 비밀번호
	private long balance;		  // 잔액
	private static Account AccountArray[] = new Account[100];
	private int totalTrans;	// 거래횟수

	//생성자	
	public Account (String AccountNumber, String AccountName, String password) {      
	      this.AccountNumber = AccountNumber;
	      this.AccountName = AccountName;
	      this.password = password;
	   }

	@Override
	   public String toString() {
	      // TODO Auto-generated method stub
	      return super.toString();
	   } 
	
	//getter & setter 메서드
	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public static Account[] getAccountArray() {
		return AccountArray;
	}

	public static void setAccountArray(Account[] accountArray) {
		AccountArray = accountArray;
	}

	public int getTotalTrans() {
		return totalTrans;
	}

	public void setTotalTrans(int totalTrans) {
		this.totalTrans = totalTrans;
	}
	
}