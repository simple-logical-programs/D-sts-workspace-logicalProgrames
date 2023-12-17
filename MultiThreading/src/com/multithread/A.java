package com.multithread;
import java.lang.*;

public class A extends Thread {
	@Override
	public void run() {
		try {
		for(int i=1;i<5;i++)
		{
			System.out.println("Akshata");
			Thread.sleep(1000);
		}
	}catch(InterruptedException i) {
		i.printStackTrace();
			
		}
	
	}
}
