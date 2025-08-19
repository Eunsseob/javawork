package _01_arrayList_vector;

public class BoardTest {
	String id;
	private String pw;
	String name;
	private int pn;
	
	// geteer setter 테스트
	
	public BoardTest(){
		
	}
	public BoardTest(String id, String pw, String name, int pn) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pn = pn;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPn() {
		return pn;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPn(int pn) {
		this.pn = pn;
	}
}
