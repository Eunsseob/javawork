package _02_generice;

class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}

	public void set(T t) {
		this.t= t;
	}	
}
class Apple{
	@Override
	public String toString() {
		return "Apple";
	}}
class Banana{}

public class Generic {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("hello");
		System.out.println(box1.get());
	
		Box<Integer> box2 = new Box<>();
		
		Box<Apple> box3 = new Box<>();
		box3.set(new Apple());
		System.out.println(box3.get());
	}

}
