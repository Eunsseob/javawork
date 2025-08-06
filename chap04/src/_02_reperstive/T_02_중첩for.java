package _02_reperstive;

import java.util.Scanner;

public class T_02_중첩for {

	public static void main(String args[]) {
		for (int i=1; i<10; i++) {
		for(int j = 1; j<10; j++) {
			System.out.printf("%d*%d = %d   ", j, i, i*j);
		}
		System.out.println("");
		}
	}
}