package com.multithread;

public class Scheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA t1=new AA();
		AA t2=new AA();
		AA t3=new AA();
		
		
		t1.setName("Thread 1");
		t2.setName("thread 2");
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	}


