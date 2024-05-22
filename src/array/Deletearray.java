package array;

import java.util.Scanner;
public class Deletearray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		int []arr1=new int [n-1];
		System.out.println();		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element index number to be removed:");
		int d=sc.nextInt();
		for(int i=0;i<n-1;i++) {
			if(i<d) {
				arr1[i]=arr[i];
			}
			else {
				arr1[i]=arr[i+1];
			}
		}
		System.out.println("array after deletion of element is ");
		for(int i=0;i<n-1;i++) {
			System.out.println(arr1[i]);
		}
	}

}
