package array;

import java.util.Scanner;

public class Addmatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][]ar1=new int[2][2];
		int[][]ar2=new int[2][2];
		int[][]sum=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				ar1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				ar2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j]=ar2[i][j]+ar1[i][j];
			}
		}
		System.out.println("matric a is");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(" "+ar1[i][j]);
			}
			System.out.println();
		}
		System.out.println("matric b is");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(" "+ar2[i][j]);
			}
			System.out.println();
		}
		System.out.println("sum of matrix is");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(" "+sum[i][j]);
			}
			System.out.println();
		}
	}

}
