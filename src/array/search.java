package array;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		
		int []arr=new int[5];
		int count=0;
		int i=0;
		Scanner sc= new Scanner(System.in);
		for( i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element to be search:");
		int n = sc.nextInt();
		for (i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println( "element is present at index : "+i);
		}
		else {
			System.out.println("element is not present");
		}
	
	}

}
