package com.thread;


class MyThread2 implements Runnable{

	public void run(){
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}		
public class E10_02 {
	public static void main(String[] args) {
		MyThread2 MyThread2=new MyThread2();
		Thread thread1=new Thread(MyThread2,"thread1");
		thread1.start();
		Thread thread2=new Thread(MyThread2,"thread2");
		thread2.start();
	}
}