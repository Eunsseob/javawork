package _06_Ex.ArrayList;

import java.util.Objects;

public class Book implements Comparable<Book>{

	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {};
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "책 제목 : " + title + ", 작가 : " + author + ", 카테고리 : " + category + ", 가격 : " + price + "\n";
	}
	
	@Override
	public int compareTo(Book o) { // 나이의 오른차순 정렬
		if(price < o.price)
			return -1;
		else if(price == o.price)
			return 0;
		else
			return 1;
	}
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return other.title.equals(title) && other.author.equals(author)
				&& other.category.equals(category)&&other.price==price; 
	}
}
