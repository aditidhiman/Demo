package array;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
		int []arr=new int[n];
	
		for(int index=0;index<arr.length;index++) {
			arr[index]=sc.nextInt();
		}
		for(int j=n-1;j>=0;j--) {
			System.out.println(arr[j]);
		}
	}

}
