package product;
//2020.10.16 조퇴한 날,,
public class Product {

	 int price;
	 int bonusPoint;

	// 생성자
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price*0.1f);
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

}