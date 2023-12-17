package com.multithread;

public class RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi m=new Multi();
		Thread t=new Thread(m);
		t.start();
		
		
		for(int i=1;i<5;i++) {
			System.out.println("akshata");
		}
 
		
		
	}

}


