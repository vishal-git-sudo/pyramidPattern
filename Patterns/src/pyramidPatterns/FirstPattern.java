package pyramidPatterns;

import java.util.Scanner;

public class FirstPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int k=rows-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
	}
}
