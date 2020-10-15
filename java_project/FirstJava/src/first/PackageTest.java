package first;

import java.text.SimpleDateFormat;

import java.util.Date;

public class PackageTest {

	public static void main(String[] args) {
		
		//java.util.Date today = new java.util.Date();
		Date today = new Date();
		// java.sql.Date
		
		System.out.println(today);	// 한국식이 아닌 날짜표현 출력
		// 밑에 줄 컨트롤+스페이스하면 자동 import
		SimpleDateFormat date = null;
		
		// yyyy - 년도
		// mm - 월
		// DD - 일
		// hh - 시간
		// mm - 분
		// ss - 초
		// a - 오전 / 오후
		// 2020.10.15 10:56
		date = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");	// 한국식 날짜표현
		
		String now = date.format(today);
		
		System.out.println(now);

	}

}