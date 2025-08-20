package homework;

public class Book {

	private String title;
	private String author;
	private String publisther;
	
	Book() {}
	
	public Book(String title, String author, String publisther) {
		this.title = title;
		this.author = author;
		this.publisther = publisther;
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
	public String getPublisther() {
		return publisther;
	}
	public void setPublisther(String publisther) {
		this.publisther = publisther;
	}
	
	@Override
	public String toString() {
		return "제목 : " + title + ", 저자 : " + author + ", 출판사 : " + publisther + "\n";
	}
}
