package thread;

public class Calculator {

	int opPlusCnt=0;
	int opMinCnt=0;

	public int add(int n1, int n2) {
		synchronized(this) {
			opPlusCnt++;
		}

		return n1+n2;
	}

	public int min(int n1, int n2) {
		synchronized (obj) {	// this, obj 서로 다른 키
			opMinCnt++;
		}

		return n1-n2;
	}
	
	// 새로운 동기화 키
	Object obj = new Object();

}