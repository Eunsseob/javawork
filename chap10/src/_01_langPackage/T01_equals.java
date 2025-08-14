package _01_langPackage;

class Value{
	int value;
	Value(int value){
		this.value = value;
	}
	
//	@Override
//	public boolean equals(Object o) {
//		return value == ((Value)o).value; // Value클래스 안에 value가 들어가 있기때문에, 강제 형변환이 필요함
//	}
}

public class T01_equals {
	
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같다");
		else
			System.out.println("V1과 v2는 다르다");
		
		Value v3 = v1;
		if(v1.equals(v3))
			System.out.println("v1과 v3는 같다");
		else
			System.out.println("v1과 v3는 다르다");
	}
	
}
