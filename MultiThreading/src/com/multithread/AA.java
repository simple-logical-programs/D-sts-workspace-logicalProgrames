package com.multithread;

public class AA extends Thread {
	public void run() {
		String n=Thread.currentThread().getName();
		for(int i=3;i<3;i++)
		{
			System.out.println(n);
		}
		
}

}
