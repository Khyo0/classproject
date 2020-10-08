package first;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = "My String";	// "" 가 있으면 같은 문자열을 찾아서
		String str2 = "My String";
		String str3 = "Your String";
		String str4 = new String("My String");	// new가 있으면 다른 것으로
		
		//참조변수 값의 동등 비교 : 같은 인스턴스를 참조한다.
		if(str1==str2) {
			System.out.println("같은 인스턴스 참조");
		} else {
			System.out.println("다른 인스턴스 참조");
		}
		
		if(str1==str3) {
			System.out.println("같은 인스턴스 참조");
		} else {
			System.out.println("다른 인스턴스 참조");
		}

		if(str1==str4) {
			System.out.println("같은 인스턴스 참조");
		} else {
			System.out.println("다른 인스턴스 참조");
		}
		
		System.out.println(str1.contentEquals(str4));	// 문자열 내용 비교 -> true 출력
		System.out.println(str1.contentEquals("str"));	// false 출력
		
	}

}