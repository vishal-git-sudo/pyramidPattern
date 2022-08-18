package pyramidPatterns;
import java.util.Scanner;

public class SecondPattern {
	public void draw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	public static void main(String[] args) {
		SecondPattern sp = new SecondPattern();
		sp.draw();
	}
}
