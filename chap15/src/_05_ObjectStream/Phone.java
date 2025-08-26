package _05_ObjectStream;

import java.io.Serializable;

/*
 * 객체를 입출력하고자 한다면 반드시 직렬화를 과정 필수
 *  > 직렬화 : 객체를 스트림으로 만드는 작업
 *  	- 직렬화가 가능한 객체를 만들려면 반드시 직렬화 인터페이스를 구현
 *  	- 직렬화 인터페이스 : 구현할 메서드는 없음. 단지 "이 객체는 직렬화가 가능하다"는 표시를 함
 */
public class Phone implements Serializable {

	private String name;
	private int price;
	
	Phone(){}
	Phone(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
