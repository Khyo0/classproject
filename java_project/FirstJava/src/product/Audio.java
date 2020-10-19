package product;
//2020.10.16 조퇴한 날,,
public class Audio extends Product {

	public Audio(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "Audio ["+price+"]";
	}

}