package arrayProgrames;

import java.util.Scanner;

public class SumofArrayElement {
	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[j];
			}
			arr[i]=sum;
		}
		System.out.println(arr[i]);
		
		

	}

}
