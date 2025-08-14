package _Test;

import java.util.Scanner;

public class SonRun {

	public static void main(String[] args) throws javax.security.auth.login.LoginException {


		try {
		Son s = new Son();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입을 하시겠습니가??");
		
		System.out.println("아이디를 입력하세요 >>> ");
		String ID1 = sc.nextLine();
		
		System.out.println("비밀번호를 입력하세요 >>> ");
		String PW1 = sc.nextLine();
		
		System.out.println("로그인을 하시겠습니가??");
		
		System.out.println("아이디를 입력 >>> ");
		
		String ID2 = sc.nextLine();
		while(!ID1.equals(ID2)) {
			System.out.println("아이디가 틀렸어요");
			ID2 = sc.nextLine();
		}
		System.out.println("비밀번호를 입력 >>> ");
		
		String PW2 = sc.nextLine();
		while(!PW1.equals(PW2)) {
			System.out.println("비밀번호가 틀렸어요");
			PW2 = sc.nextLine();
		}	
		System.out.println("로그인 성공!!!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
