package _02_StringMethod;

public class T04_startWith_endsWoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "springjavahtmlsql";
		
		boolean result = str.contains("sp");
		System.out.println(result);
		
		String[] strArr = {"aa.jpg","bb.class","cc.text"};
		for(int i = 0; i<strArr.length; i++) {
			if(strArr[i].endsWith("jpg") ||  strArr[i].endsWith("png") ) {
				System.out.println(strArr[i]+"는 그림파일 입니다.");
				break;
			} else
				System.out.println(strArr[i]+"는 그림파일이 아닙니다.");
		}
	}

}
