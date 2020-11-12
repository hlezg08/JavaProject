import java.util.Scanner;

import javax.swing.*;
class SharedArea{
	double ratio;
	boolean isReady;
}
class SimulThread extends Thread{
	SharedArea sharedarea;
	int n,count;
	
	SimulThread(int n){
		this.n=n;
	}
	
	public void run() {
		for(int i=0;i<n;i++) {
			if(Math.round(Math.random())==1) {
				count++;
			}
		}
		sharedarea.ratio=count/(double) n;
		sharedarea.isReady=true;
		synchronized(sharedarea) {
			sharedarea.notify();
		}
	}
	
}
class PrintThread extends Thread{
	SharedArea sharedarea;
	public void run() {
		if(sharedarea.isReady!=true) {
			try {
				synchronized(sharedarea) {
					sharedarea.wait();
					
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
		System.out.printf("동전을 던졌을 때 앞 면이 나온 비율:%.2f%%\n",sharedarea.ratio*100);
		
	}
	
	
}

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("동전을 몇 번 던지나요?");
		Scanner kbd=new Scanner(System.in);
		int n=kbd.nextInt();
		
		SimulThread s=new SimulThread(n);
		PrintThread p=new PrintThread();
		
		SharedArea sa=new SharedArea();
		
		s.sharedarea=sa;
		p.sharedarea=sa;
		
		s.start();
		p.start();
	}

}
