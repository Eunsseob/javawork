package thread;

class ThreadA extends Thread{
	boolean stop = false;
	boolean work = true; // yield 메소드를 호출한 시점을 알기 위해
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 실행");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}

class ThreadB extends Thread{
	boolean stop = false;
	boolean work = true; // yield 메소드를 호출한 시점을 알기 위해
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.print("B실행");
			} else {
				Thread.yield();
			}
		}
		System.out.println();
		System.out.println("ThreadB 종료");
	}
}


public class T09_Yield {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();


		try {
			Thread.sleep(500);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		threadA.work = false;
		System.out.println("A작업 일시정지 ======================");
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		threadA.work = true; // A와 B번갈아 가면서 작업
		System.out.println("A작업 일시정지 ======================");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		threadA.stop = true;
		threadB.stop = true;
		
	}

}
