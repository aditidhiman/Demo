package array;

import java.util.Scanner;

public class duplicatearray {

	public static void main(String[] args) {
		
		int []arr=new int[8];
		Scanner sc= new Scanner(System.in);
		for(int index=0;index<arr.length;index++) {
			arr[index]=sc.nextInt();
		}
		System.out.println("duplicate element are");
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
	}

}
