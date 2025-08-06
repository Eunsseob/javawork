package _02_reperstive;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
//		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		   (if문으로)
		System.out.println("============ 1번 문제 ============");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 수학 영어 점수 입력 : >>> ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		if(kor>= 40 && eng >= 40 && math >=40) {
			if ((kor+eng+math)/3 >= 60) {
				System.out.println("합격!!");
			} else
				System.out.println("불합격");
		} else
			System.out.println("불합격");
		
		
//		2. id와 비밀번호를 변수에 저장하고
//		   사용자로부터 아이디와 비밀번호를 입력 받아
//		   아이디와 비밀번호가 모두 맞으면 "로그인 성공"출력
//		   아이디가 틀렸으면 "아이디가 틀렸습니다"출력
//		   비밀번호가 틀렸으면 "비밀번호가 틀렸습니다"출력

		System.out.println("============ 2번 문제 ============");
		
		System.out.print("아이디랑 비번 입력 : >>> ");
		

		String id2 = sc.next();
		int pw2 = sc.nextInt();
		
		String id = "asd";
		int password = 1234;
		
		
		if(id.equals(id2) && password == pw2) {
			System.out.println("로그인 성공");
		} else if(!id.equals(id2)) {
			System.out.println("아이디가 틀렸습니다.");
		} else
			System.out.println("비밀번호가 틀렸습니다.");
		
//		3. 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 
//		   계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
//
//			- BMI = 몸무게 / (키(m) * 키(m))
//
//			BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//			BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//			BMI가 30이상일 경우 고도 비만
		System.out.println("============ 3번 문제 ============");
		
		System.out.print("키(m) 랑 몸무게를 입력하시오 >>> ");
		
		double key = sc.nextDouble();
		double weight = sc.nextDouble();
		
		double BMI = weight / (key * key);
		if(BMI < 18.5) {
			System.out.println("저 체 중");
		} else if(18.5 <= BMI && BMI < 23) {
			System.out.println("정상 체중");
		} else if(23 <= BMI && BMI < 25) {
			System.out.println("과 체 중");
		} else if(25 <= BMI && BMI < 30) {
			System.out.println("비만");
		} else
			System.out.println("고도 비만");
		
////		4. 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력
////		   평가 비율은 중간고사 20%, 
////		                  기말고사 30%, 
////		                  과제 30%, 
////		                  출석 20%로 이루어져 있고 
////		   이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산.
////		   70점 이상일 경우 Pass, 
//		   70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력

		System.out.println("============ 4번 문제 ============");
		
		
		System.out.print("중간고사 점수 : ");
		double test1 = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		double test2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		double test3 = sc.nextInt();
		System.out.print("출석 회수 : ");
		double test4 = sc.nextInt();
		double total =  test1*0.2+test2*0.3+test3*0.3+test4;
		
		System.out.println("============= 결과 ============");
		System.out.printf("중간 고사 점수(20) : %.1f\n", test1*0.2);
		System.out.printf("기말 고사 점수(30) : %.1f\n", test2*0.3);
		System.out.printf("과제 점수(30) : %.1f\n", test3*0.3);
		System.out.printf("출석 점수(20) : %.1f\n", test4);
		System.out.printf("총점 : %.1f\n", total);
		
		if(total > 70) {
			System.out.print("Pass");
		} else if (test4 <= 6) {
			System.out.printf("Fail [출석 횟수 부족(%.0f/20)]", test4);
		}
		else
			System.out.printf("Fail [점수 미달]");
	}
}
