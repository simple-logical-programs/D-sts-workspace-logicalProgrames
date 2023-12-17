package com.multithread;

import java.io.IOException;

public class B {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		A t=new A();
		t.start();
		for(int i=1;i<5;i++) {
			System.out.println("akshay");
			Thread.sleep(1000);
		}

	}

}
