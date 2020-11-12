//컴퓨터공학과 1771028 성혜린
import java.util.Random;
import java.util.Scanner;

class Student{ //Student 클래스 생성
	private String name;
	public Student(String name){//생성자 만들어서 학생의 이름 초기화
		this.name=name;
	}
	public String toString() {//학생 이름을 반환함
		return name;
	}
}
public class Hw1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd=new Scanner(System.in);
		System.out.print("몇 명이서 게임을 하겠습니까?: ");
		int count=kbd.nextInt();//게임할 인원수 입력받기
		int i,j;
		Student []student=new Student[count]; //학생에 대한 객체 배열 선언함
		
		Random rand=new Random();//랜덤 클래스로 객체 만들기
		int randNum[]=new int[3]; //3개의 숫자를 배열로 만듦
		
		for(i=0;i<count;i++) {
			System.out.print((i+1)+"번째 학생의 이름을 입력하세요: ");
			student[i]=new Student(kbd.next());//학생의 이름 입력받기
		}	
	
		AA:
		while(true) { //조건이 나올때까지 무한루프 반복
			for(i=0;i<count;i++) {
				System.out.print(student[i].toString()+": <엔터를 입력하세요.>");
				kbd.nextLine(); //엔터누르기 위해 new line이 나올때까지 입력받기
				for(j=0;j<3;j++) {
					randNum[j]=rand.nextInt(3)+13;
					System.out.print(" "+randNum[j]+" ");//랜덤으로 정수 생성하고 출력하기
				}				
				if(randNum[0]==randNum[1]&&randNum[1]==randNum[2]) {
					System.out.println("\n"+student[i].toString()+"이/가 이겼습니다.");
					break AA; //3개의 숫자 중 첫번째와 두번째,두번째와 세번째 숫자가 같으면 그 수가 나온 사람이 이겼다고 출력한다. 이후 AA레이블을 통해 무한루프를 나온다.
				}
				else
					System.out.println("\n아쉽지만 다음 학생 차례입니다.\n"); //숫자가 다르면 계속 다음학생 차례를 기다림
			}	
	
		}

	}

}
