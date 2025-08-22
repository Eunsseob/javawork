
package thread;

class Thread1 extends Thread{
	@Override
	public void run() {
		setName("첫번째 스레드");
		for(int i=1; i<=5; i++) {
			System.out.println(getName());
		}
	}
}

class Thread2 implements Runnable{
	@Override
	public void run() {
		Thread.currentThread().setName("두번째 쓰레드");
		for(int i = 1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
public class _T01_Thread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
	
		t1.start();
		
		Thread t2 = new Thread(new Thread2());
		t2.start();
	
	}

}
