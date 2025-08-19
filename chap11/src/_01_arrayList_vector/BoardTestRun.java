package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class BoardTestRun {

	public static void main(String[] args) {
		List<BoardTest> list = new ArrayList<>();
		
		list.add(new BoardTest("아이디1", "비번1", "이름1", 111111111));
		list.add(new BoardTest("아이디2", "비번2", "이름2", 222222222));
		list.add(new BoardTest("아이디3", "비번3", "이름3", 333333333));
		list.add(new BoardTest("아이디4", "비번4", "이름4", 444444444));
		list.add(new BoardTest("아이디5", "비번5", "이름5", 555555555));

		for(BoardTest b : list) {
			System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getPw()+ "\t" + b.getPn());
		}
	}

}
