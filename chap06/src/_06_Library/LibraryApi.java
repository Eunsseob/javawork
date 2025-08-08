package _06_Library;

public class LibraryApi {

	String insertName(String name) {
		System.out.print("책 이름은 : ");
		return name;
	}
	
	String insertArtist(String artist) {
		System.out.print("저자 이름은 : ");
		return artist;
	}
	
	int insertCost(int cost) {
		System.out.print("책의 가격은 : ");
		return cost;
	}
	
	String insertInform(String name, String artist, int cost) {
		System.out.println("책의 정보는 : " + name);
		System.out.println("책의 작가는 : " + artist);
		System.out.println("책의 가격은 : " + cost);
		return "이상입니다";
	}
}

