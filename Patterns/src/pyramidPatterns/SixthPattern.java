package pyramidPatterns;

import java.util.Scanner;

public class SixthPattern {
	public void draw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
	public static void main(String[] args) {
		SixthPattern sp = new SixthPattern();
		sp.draw();
	}
}
