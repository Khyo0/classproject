package first;

import java.util.Scanner;

public class ArrayHW {
	
// 문제1
	// 1차원 배열을 매개변수로 전달받아서
	// 배열에 저장된 최대값, 최소값을 구해서 반환하는 메소드
	
	// 배열의 길이에 상관없이 동작하도록 정의
	// 두 메소드 실행을 확인하기 위한 main 메소드 정의
	// int형 배열에 채워질 정수는 프로그램 사용자로부터 입력받고, 배열의 길이는 임의로 결정
	
	public static int miniValue(int[] arr){
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {	// for문으로 최소값 구하기
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int maxValue(int[] arr){
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {	// for문으로 최대값 구하기
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
// 문제 2
	// int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달될 값의 크기만큼 전부 증가시키는 메서드
	// 그것을 2차원으로 정의
	
	public static void addOneDArr(int[][] arr, int add) {
        for (int i=0; i<arr.length; i++) {
        	for (int j=0; j<arr[i].length; j++) {
        		arr[i][j] +=add;
        	}
        }
}
	
// 문제 3
	// 총 N행으로 이뤄진 2차원 배열이 존재한다면,
	// 메서드 호출 시, 1행은 2행으로 이동이 이뤄져야한다.
	//  가로, 세로길이에 상관 없이 동작
	
	public static void moveValue(int[][]arr) {
		int[][] tmp = new int[arr.length][arr[0].length];
			
		for(int i=0; i<tmp.length-1; i++) {

			tmp[i+1] = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = tmp[i+1];

		}
	}
	
	/* 반대 방향
	 	tmp[i] = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = tmp[i];
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System. in);

// 문제 1
		System.out.println("문제 1");
		int[] hw = new int[10];
		
		System.out.println("값을 입력하세요. ");
		// 값 입력 받기
		for(int i=0; i<hw.length; i++) {
			hw[i] = sc.nextInt();
		}
		System.out.println("최소값 : " + miniValue(hw));
		System.out.println("최대값 : " + maxValue(hw));
		
//문제 2
		System.out.println("문제 2");
		int[][] hw2 = {
				{1, 2, 3},
				{4, 5 ,6},
				{7, 8, 9}
		};
		// 원본 값 출력
		for(int i=0; i<hw2.length; i++){
			for(int j=0; j<hw2[i].length; j++) {
				System.out.print(hw2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("====================");
		addOneDArr(hw2, 5);	// 5씩 증가
		for(int i=0; i<hw2.length; i++){
			for(int j=0; j<hw2[i].length; j++) {
				System.out.print(hw2[i][j] + "\t");
			}
			System.out.println();
		}
		
// 문제 3
		System.out.println("문제 3");
		int [][] hw3 = {
				{1, 2, 3},
				{4, 5 ,6},
				{7, 8, 9}
		};
		// 원본 값 출력
		for(int i=0; i<hw3.length; i++){
			for(int j=0; j<hw3[i].length; j++) {
				System.out.print(hw3[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("====================");
		moveValue(hw3);
		for(int i=0; i<hw3.length; i++){
			for(int j=0; j<hw3[i].length; j++) {
				System.out.print(hw3[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}