package thread;

// 쓰래드 크랠스 정의할 때, 상속이 필요한 경우 Runnable 인터페이스를 구현해서 쓰래드를 생성할 수 있다.
public class ShowRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("안녕하세요. Runnable입니다.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	// 100/1000초
		}
	}
	
	

}
