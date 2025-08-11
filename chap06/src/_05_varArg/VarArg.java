package _05_varArg;

public class VarArg {

	public static void main(String[] args) {
		/*
		VarArg v = new VarArg();
		v.method = 
		*/
	
		method("a", "b", "c");
		method("a", "b", "c", "d", "e", "f");
		
		String[] ar = {"a","b","c","d","e","f"};
		method(ar);
	}
	
	/*
		System.out.println(s1);
	}
	
	void method(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
	
	void method(String s1, String s2, String s3) {
		System.out.println(s1 + " " + s2 + " " + s3);
	}
	*/

	static void method(String... str) {
		for(String s : str) {
			System.out.println(s + " ");
		}
	}
	
}
