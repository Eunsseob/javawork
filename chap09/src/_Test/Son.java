package _Test;

import javax.security.auth.login.LoginException;

public class Son {
	private String ID;
	private String PW;
	
	void CorrectId(String ID) {
		System.out.println("아이디가 잘못되었습니다.");
		ID = ID;
	}
	
	void CorrectPW(String PW) {
		System.out.println("비밀번호가 잘못되었습니다.");
		PW = PW;
	}
	
	void Correct(String ID, String PW) throws LoginException{
		System.out.println("로그인 성공");
	}

}
