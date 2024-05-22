package array;

import java.util.Scanner;

public class Indexlargest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println();		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int a=0;
		for(int index=1 ;index<n;index++) {
			if(arr[index]>max) {
				max=arr[index];
				a=index;
			}
		}
		System.out.println(" index of largest element is: "+a);

	}

}
