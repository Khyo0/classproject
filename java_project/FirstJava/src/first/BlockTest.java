package first;

public class BlockTest {

	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) +1;
			// 1~10해야함 : (int)(0.0<= r <10.0) -> 0~9 +1 -> 1~10
		}
		System.out.println("배열 요소의 초기화 작업 완료");
	}
	
	// 클래스 초기화 블록 : 코드가  로드될 때 블록 코드 실행
	static {
		System.out.println("static{ 123 }");
	}
	
	// 인스턴스 초기화 블록 : 인스턴스가 생성될 때 블록 코드 실행
	//					생성자보다 우선
	{
		System.out.println("{ }");
	}
	
	BlockTest(){
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		
		System.out.println("BlockTest 인스턴스 생성");
		BlockTest bt1 = new BlockTest();
		
		System.out.println("BlockTest 인스턴스 생성");
		BlockTest bt2 = new BlockTest();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]" + arr[i]);
		}
	}

}