package pyramidPatterns;

import java.util.Scanner;

public class FifthPattern {
	public void draw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int l=rows-i;l>=1;l--) {
				System.out.print("  ");
			}
			for(int j=rows-i+1;j<=rows;j++) {
				System.out.print(j+" ");
			}
			for(int k=rows-1;k>=rows-i+1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	public static void main(String[] args) {
		FifthPattern fp = new FifthPattern();
		fp.draw();
	}
}
