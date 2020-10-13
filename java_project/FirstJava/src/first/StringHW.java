package first;

public class StringHW {

	public static void main(String[] args) {
//문제 1		
		String str = "ABCDEFGHIJKLMN";
		System.out.println(str);
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}

// 문제 2
		StringBuffer str2 = new StringBuffer("990929-1010123");
		System.out.println("\n" + str2);

		str2 = str2.deleteCharAt(6);	// - 제거
		System.out.println(str2);
		
	}
	
}