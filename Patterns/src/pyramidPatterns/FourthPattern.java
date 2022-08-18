package pyramidPatterns;

import java.util.Scanner;

public class FourthPattern {
	public void draw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=rows-i;j>=1;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			for(int l=i-1;l>=1;l--) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		FourthPattern fp = new FourthPattern();
		fp.draw();
	}
}
