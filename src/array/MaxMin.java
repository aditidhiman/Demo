package array;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
		int [] arr=new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<5;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("largest element is: "+max);
		System.out.println("smallest element is: "+min);
		

	}

}
