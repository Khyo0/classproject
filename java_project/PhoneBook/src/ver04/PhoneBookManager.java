package ver04;

import java.util.Scanner;

import ver03.Util;

public class PhoneBookManager {

	private PhoneInfor[] phoneBook;
	int cnt;
	
	PhoneBookManager(int size) {
		phoneBook = new PhoneInfor[size];
		size = 0;
	}
	
	void infor(PhoneInfor p) {	// 배열로 정보들 저장
		phoneBook[cnt] = p;
		cnt++;
	}
// 정보 저장	
	void insertMember() {
	// 관계
		System.out.println("관계를 선택해주세요.");
		System.out.println("1. 가족");
		System.out.println("2. 대학");
		System.out.println("3. 회사");
		
		char insertMenu = Util.sc.nextLine().charAt(0);
		
		System.out.println("친구의 정보 입력을 시작합니다.");
	// 이름 입력받기
		System.out.println("이름 입력 : ");
		String name = Util.sc.nextLine();		
	// 전화번호 입력받기
		System.out.println("전화번호 입력 : ");
		String phoneNumber = Util.sc.nextLine();		
	// 주소 입력받기
		System.out.println("주소 입력 : ");
		String address = Util.sc.nextLine().trim();		
	// 이메일 입력받기
		System.out.println("이메일 입력 : ");
		String email = Util.sc.nextLine().trim();
		
		switch(insertMenu) {
		case '1' :
			// 가족관계 입력받기
			System.out.println("가족관계 입력 : ");
			String relation = Util.sc.nextLine().trim();
			infor(new PhoneFamInfor(name, phoneNumber, address, email, relation));
			break;
		case '2' :
			// 회사 입력받기
			System.out.println("회사 입력 : ");
			String company = Util.sc.nextLine().trim();

			infor(new PhoneCompanyInfor(name, phoneNumber, address, email, company));
			break;
		case '3' :
			// 전공 입력받기
			System.out.println("전공 입력 : ");
			String major = Util.sc.nextLine().trim();
			// 학년 입력받기
			System.out.println("학년 입력 : ");
			String year = Util.sc.nextLine().trim();
			
			infor(new PhoneUnivInfor(name, phoneNumber, address, email, major, year));

		case '4' :
			System.out.println("잘못 입력하였습니다.");
		break;
	}

}

// 정보 검색
	void searchMember() {
		
		if(cnt==0) {
			System.out.println("저장된 데이터가 없슴니다. 다시 메뉴로 이동합니다.");
			return;	// 저장된 데이터가 없을 때, 검색 불필요
		}
		
		// 찾고자 하는 이름을 받는다.
		System.out.println("정보 검색을 시작합니다.");
		System.out.println("찾고자 하는 이름을 입력해주세요. : ");
		String name = Util.sc.nextLine();
		
		// 이름으로 요소 index 검색
		int index = searchIndex(name);
			
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		} else {
			// 정보 출력
			phoneBook[index].showInfor();
		}
		
	}
	
	// 이름 문자열을 받아서,
	// 배열의 정보와 비교하고,
	// index를 찾아서 반환하는 메서드
	int searchIndex(String name) {
		
		int result = -1;
		// 검색 : index를 찾는다.
		for(int i=0; i<cnt; i++) {
		if(phoneBook[i].getName().equals(name)) {
				result = i;
				break;
			}
		}
		
		return result;
	}
	
// 정보 삭제
	void deleteMember() {
		
		if(cnt==0) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}

		System.out.println("정보 삭제를 진행합니다.");
		System.out.println("삭제하고자 하는 정보의 이름을 입력해주세요.");
		String name = Util.sc.nextLine();
	
		// 이름으로 요소 index 검색
		int index = searchIndex(name);
			
			if(index < 0) {
				System.out.println("삭제하고자 하는 정보가 존재하지 않습니다.");
			} else {
				for(int i=index; i<cnt-1; i++) {
					phoneBook[i] = phoneBook[i+1];
				}
				
				cnt--;
				System.out.println("정보를 삭제했습니다.");
				
			}
	}

// 전체 정보 출력
	void displayAll() {
		
		if(cnt==0) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		
		System.out.println("전체 정보를 출력합니다. (" + cnt + ")");
		System.out.println("--------------------");
		
		for(int i=0; i<cnt; i++) {
			phoneBook[i].showInfor();
			System.out.println("--------------------");
		}
	}
}