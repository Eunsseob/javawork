package _02_Array;

public class T05_lotto {

	public static void main(String args[]) {
		int[] arr = new int[45];
		
		for(int i=0; i<45; i++) {
			
			arr[i] = i+1;
		}
		
		for(int i=0; i<6; i++) {
			int index = (int)(Math.random()*45);
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			
			System.out.print(arr[i] + "  ");
		}
	}
}
