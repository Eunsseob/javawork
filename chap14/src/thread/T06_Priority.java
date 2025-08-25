package thread;

class Thread4 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("%");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.print("END");
	}
}

class Thread5 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("%");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.print("%-END");
	}
}

public class T06_Priority {

	public static void main(String[] args) {
		Thread4 t4 = new Thread4();
		Thread t5 = new Thread5();
		
		t5.setPriority(10);
		System.out.println("%의 우선순위 : " + t5.getPriority());
		System.out.println("-의 우선순위 : " + t4.getPriority());
		
		t4.start();
		t5.start();
	}

}
