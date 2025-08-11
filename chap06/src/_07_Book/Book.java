package _07_Book;

public class Book {
	String name;
	String ISBN;
	int price;
	
	Book(){
		this("손은섭", "0123NVJS", 30000);
	};
	
	Book(String name){
		this(name, "SPOUJA", 200000);
	}
	
	Book(String name, String ISBN){
		this(name, ISBN, 44400000);
	}
	
	Book(String name, String ISBN, int price){
		this.name = name;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	void infobook() {
		System.out.println("이름 : " + name);
		System.out.println("바코드 : " + ISBN);
		System.out.println("가격 : " + price);
	}
}
