package first;

public class Child  extends Parent {	// Parent 상속
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		// System.out.println(c.money);
		System.out.println(c.getMoney());
	}

}