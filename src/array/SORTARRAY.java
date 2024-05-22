package array;

import java.util.Scanner;

public class SORTARRAY {

	public static void main(String[] args) {
		int []arr=new int[5];
	
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//sorting
		System.out.println("Sorted array: ");
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		} 
		System.out.println();
		
		
			
			int n= arr.length;
			int a = 0, j = (n - 1);


			while (j >= a) 
			{

				if (arr[a] % 2 != 0) 
				{
					if (arr[j] % 2 == 0) 
					{
						temp=arr[a];
						arr[a]=arr[j];
						arr[j]=temp;
						a++;
						j--;
					}
					else 
						j--;
				}
				else 
					a++;
			}
		System.out.println("Segregate array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}




