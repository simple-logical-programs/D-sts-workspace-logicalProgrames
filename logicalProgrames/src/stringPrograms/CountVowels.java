package stringPrograms;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0;
		System.out.println("enter the input string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch==' ')
			{
				c++;
			}
			
		}
		System.out.println("number of vowels in the given input is="+c);

	}

	}

