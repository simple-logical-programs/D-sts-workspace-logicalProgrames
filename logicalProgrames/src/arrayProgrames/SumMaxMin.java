package arrayProgrames;

import java.util.Scanner;

public class SumMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		int sum=0;
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			sum=sum+arr[i];
			res=sum-(max+min)/(arr.length-2);
		}
		System.out.println(res);
		
		

	}

}
