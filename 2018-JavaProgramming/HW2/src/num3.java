import java.util.Scanner;

import java.util.ArrayList;
import javax.swing.*;

class SharedArea{
	double ratio1,ratio2,ratio3,ratio4,ratio5,ratio6;
	boolean isReady;
} //공유영역

class simul extends Thread{ //시뮬레이션 하는 클래스
	SharedArea area;
	int n;
	int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
	
	simul(int n){
		this.n=n;
	}
	public void run() { //스레드 수행
		for(int i=0;i<n;i++) {
			int dice=(int)(Math.random()*6+1); //1~6까지 랜덤한 숫자 만들기
			switch(dice) {
			case 1:
				count1++;
				break;
			case 2:
				count2++;break;
			case 3:
				count3++;break;
			case 4:
				count4++;break;
			case 5:
				count5++;break;
			case 6:
				count6++;break;
			}//각각 숫자가 나올때마다 count변수를 다르게 해서 하나씩 증가하도록 했음
		}
		area.ratio1=count1/(double) n;
		area.ratio2=count2/(double) n;
		area.ratio3=count3/(double) n;
		area.ratio4=count4/(double) n;
		area.ratio5=count5/(double) n;
		area.ratio6=count6/(double) n; //비율 계산:숫자 나온 횟수/전체 횟수
		area.isReady=true;
		synchronized(area) {
			area.notify();
		}//동기화
	}
}
class printThread extends Thread{
	SharedArea area;
	public void run() {
		if(area.isReady!=true) {
			try {
				synchronized(area) {
					area.wait();
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("1: %.2f%%\n",area.ratio1*100);
		System.out.printf("2: %.2f%%\n",area.ratio2*100);
		System.out.printf("3: %.2f%%\n",area.ratio3*100);
		System.out.printf("4: %.2f%%\n",area.ratio4*100);
		System.out.printf("5: %.2f%%\n",area.ratio5*100);
		System.out.printf("6: %.2f%%\n",area.ratio6*100);
		//출력 스레드
	}
}
public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many times do you want to toss?");
		Scanner kbd=new Scanner(System.in);
		int num=kbd.nextInt();
		
		
		System.out.println("*Result of Dice Tossing");
		simul thread1=new simul(num);
		printThread thread2=new printThread();
		
		SharedArea s=new SharedArea();//스레드,공유영역 클래스 만들기
		
		
		thread1.area=s;
		thread2.area=s;
		
		thread1.start();
		thread2.start();
		
	}
	//컴퓨터공학 1771028 성혜린
}
