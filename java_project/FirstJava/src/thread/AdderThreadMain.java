package thread;

public class AdderThreadMain {

	public static void main(String[] args) {
		
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		
		// 쓰래드 생성
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();	// t1 쓰래드가 종료될 때까지 다른 쓰래드는 멈춤 상태
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100까지 합 : " + (at1.getNum() + at2.getNum()));
	}

}