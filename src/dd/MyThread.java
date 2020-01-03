package dd;

import java.util.List;

public class MyThread extends Thread{
	
	
	public void run() {
		
		System.out.println("MyThread.run()");
	}
	
	public static void main(String[] args) {
		MyThread myThread1=new MyThread();
		myThread1.start();
	
//		String string="sss";
//		System.out.println(string.length());
		
		int[] nums= {1,6,8,6};
		int i=nums.length;
		System.out.println(i);
	}
	
	
	
	
	
}
