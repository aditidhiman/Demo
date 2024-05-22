package array;
import java.util.Arrays;
import java.util.Scanner;
public class sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println();		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
     
        Arrays.sort(arr);
        System.out.println("The sorted array is: ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
	}

}
