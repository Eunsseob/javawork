package _04_overloding;

public class OverloadingRun {
	public static void main(String[] a) {
	Overloding over = new Overloding();
	OverOp over1 = new OverOp();
	
	System.out.println(over.add());
	System.out.println(over.add(3,5));
	System.out.println(over.add(3.0,5.0));
	System.out.println(over.add("문자열"));
	
	System.out.println(over1.check1());
	System.out.println(over1.check2(2));
	System.out.println(over1.check3(2,3));
	}
}
