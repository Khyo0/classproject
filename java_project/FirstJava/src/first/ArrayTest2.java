package first;

public class ArrayTest2 {

	public static void main(String[] args) {

	// 2차원 배열 선언 : 자료형[][] 배열이름
		int [][] arr = null;
		
	// 2차원 배열 생성 : new 자료형 [행의 개수][열의 개수]
		arr = new int[3][4];
		
	// 2차원 배열 참조 : 배열이름[행의 index][열의 index] , index는 0부터 시작
		arr[0][0] = 10;	//데이터 저장
		System.out.println("arr[0][0] => " + arr[0][0]);
		arr[1][3] = 13;
		System.out.println("arr[1][3] => " + arr[1][3]);
		
	// 2차원 배열은 1차원 배열을 가지는 배열이다.
		System.out.println(arr.length);		// 1차원 배열을 저장하는 주소값 3개(행의 개수)
											// 2차원 배열 arr의 length 값 : 1차원 배열의 개수(2차원 배열의 행의 개수)
		System.out.println(arr[0].length);	// arr[0] : 첫 번째 1차원 배열을 가리키는 주소값을 저장하는 변수
		System.out.println(arr[1].length);	// arr[1] : 두 번째 1차원 배열을 가리키는 주소값을 저장하는 변수
		System.out.println(arr[2].length);	// arr[2] : 세 번째 1차원 배열을 가리키는 주소값을 저장하는 변수
		
	// for 반복문을 이용하여 2차원 배열의 모든 요소 참조
		System.out.println("========2차원 배열 요소 출력========");
		showData(arr);
		/*
		System.out.println("========2차원 배열 요소 출력========");
		for(int i=0; i<arr.length; i++){	// 0, 1, 2
			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		// 전체 요소에 값 대입
		System.out.println("===2차원 배열 모든 요소에 데이터 저장===");
		for(int i=0; i<arr.length; i++) {	// 0, 1, 2
			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
				arr[i][j] = i+j;
			}
		}
		System.out.println("========2차원 배열 요소 출력========");
		showData(arr);
		/*
		System.out.println("========2차원 배열 요소 출력========");
		for(int i=0; i<arr.length; i++){	// 0, 1, 2
			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		
	// 가변배열
		int[][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[5];
		arr2[2] = new int[2];
		
		// 배열 요소 출력
		System.out.println("===========가변 배열 요소 출력===========");
		showData(arr2);
		
		String[][] place = new String[6][];
		place[0] = new String[2];
		place[1] = new String[4];
		place[2] = new String[3];
		place[3] = new String[3];
		place[4] = new String[3];
		place[5] = new String[3];
		
		System.out.println("===============자리배치===============");
		showData(place);
		
		int[][] arr3 = {
				{1, 2},
				{3, 4 ,5},
				{6, 7, 8, 9}
		};
		System.out.println("2차원 배열 세로길이(1차원 배열 개수) : " + arr3.length);
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3[" + i +"].length : " + arr[i].length);
		}
		
	// for-each 구문 : 배열의 원본 데이터의 수정이 아닌 일괄 참조의 목적일 때 사용할 수 있다.
		int[] arr4 = {1, 2, 3, 4, 5};
		
		
		int sum = 0;
		for(int n : arr4) {
			System.out.print(n + "\t");
			sum += n;
		}
		System.out.println("배열 arr4 요소들 합 : " + sum);
		
	// for-each 에서 값의 변경 -> 배열에는 영향을 주지 않는다.
		for(int n : arr4) {
			n++;
			System.out.print(n + "\t");
		}
		System.out.println();
		
		for(int n : arr4) {
			System.out.print(n + "\t");
		}

	}
	
	// 정수형 2차원 배열을 전달받아
	// 모든 요소의 값을 출력하는 메서드
	// 반환하는 데이터 X
	static void showData(int[][] arr) {
		for(int i=0; i<arr.length; i++){	// 0, 1, 2
			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	static void showData(String[][] arr) {	// 오버로딩 (같은이름)
		for(int i=0; i<arr.length; i++){	// 0, 1, 2
			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}