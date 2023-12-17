package stringPrograms;

import java.util.Scanner;

public class ValidIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input String");
		String s=sc.nextLine();
		String[] arr=s.split("[.]");
		boolean flag=true;
		for(String ele:arr) {
			int n=Integer.parseInt(ele);
			if(n<0||n>255) {
				flag=false;
			}
		}
		if(flag==true&&arr.length==4) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
			}
		

	}

}
