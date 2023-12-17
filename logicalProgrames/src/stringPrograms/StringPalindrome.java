package stringPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input string");
		String s1=sc.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("palindrome");
			}
		else {
			System.out.println("not a palindrome");
		}

	}

}
