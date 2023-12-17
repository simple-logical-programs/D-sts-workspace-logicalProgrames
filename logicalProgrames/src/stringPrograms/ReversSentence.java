package stringPrograms;

import java.util.Scanner;

public class ReversSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input String");
		String s=sc.nextLine();
		sc.close();
		String reversed=reverseString(s);
		System.out.println("the reversed string is:"+reversed);
	}
	public static String reverseString(String str)
	{
		if(str.isEmpty())
		{
			return str;
			return reverseString(str.substring(1))+str.charAt(0);
		}
	}
}
		
		
		