package thread;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		
		at.start();
		mt.start();
		
		try {
			at.join();
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("덧셈 연산 횟수 : " + cal.opPlusCnt);
		System.out.println("뺄셈 연산 횟수 : " + cal.opMinCnt);

	}

}

class AddThread extends Thread{
	Calculator cal;
	
	AddThread(Calculator c){
		cal = c;
	}
	
	public void  run() {
		for(int i=0; i<1000; i++) {
			System.out.println("1+2=" + cal.add(1, 2));
			System.out.println("2+3=" + cal.add(2, 3));
		}
		
	}
}

class MinThread extends Thread{
	
	Calculator cal;
	
	public MinThread(Calculator c) {
		cal = c;
	}
	
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("3-1=" + cal.min(3, 1));
			System.out.println("2-1=" + cal.min(2, 1));
		}
		
	}
}