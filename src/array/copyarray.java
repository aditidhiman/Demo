package array;

import java.util.Scanner;

public class copyarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		int []arr1=new int [n];
		System.out.println();		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {

			arr1[i]=arr[i];

		}
		System.out.println("new array is ");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
