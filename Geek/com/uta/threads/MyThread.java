package com.uta.threads;

public class MyThread implements Runnable{
	
	public void run(){
		for(int i = 0 ; i < 100 ; i++){
			
			try{
				System.out.println(i);
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
		}
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		t1.start();Thread.sleep(1500);t2.start();
	}

}
