//��ǻ�Ͱ��а� 1771028 ������
import java.util.Random;
import java.util.Scanner;

class Student{ //Student Ŭ���� ����
	private String name;
	public Student(String name){//������ ���� �л��� �̸� �ʱ�ȭ
		this.name=name;
	}
	public String toString() {//�л� �̸��� ��ȯ��
		return name;
	}
}
public class Hw1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd=new Scanner(System.in);
		System.out.print("�� ���̼� ������ �ϰڽ��ϱ�?: ");
		int count=kbd.nextInt();//������ �ο��� �Է¹ޱ�
		int i,j;
		Student []student=new Student[count]; //�л��� ���� ��ü �迭 ������
		
		Random rand=new Random();//���� Ŭ������ ��ü �����
		int randNum[]=new int[3]; //3���� ���ڸ� �迭�� ����
		
		for(i=0;i<count;i++) {
			System.out.print((i+1)+"��° �л��� �̸��� �Է��ϼ���: ");
			student[i]=new Student(kbd.next());//�л��� �̸� �Է¹ޱ�
		}	
	
		AA:
		while(true) { //������ ���ö����� ���ѷ��� �ݺ�
			for(i=0;i<count;i++) {
				System.out.print(student[i].toString()+": <���͸� �Է��ϼ���.>");
				kbd.nextLine(); //���ʹ����� ���� new line�� ���ö����� �Է¹ޱ�
				for(j=0;j<3;j++) {
					randNum[j]=rand.nextInt(3)+13;
					System.out.print(" "+randNum[j]+" ");//�������� ���� �����ϰ� ����ϱ�
				}				
				if(randNum[0]==randNum[1]&&randNum[1]==randNum[2]) {
					System.out.println("\n"+student[i].toString()+"��/�� �̰���ϴ�.");
					break AA; //3���� ���� �� ù��°�� �ι�°,�ι�°�� ����° ���ڰ� ������ �� ���� ���� ����� �̰�ٰ� ����Ѵ�. ���� AA���̺��� ���� ���ѷ����� ���´�.
				}
				else
					System.out.println("\n�ƽ����� ���� �л� �����Դϴ�.\n"); //���ڰ� �ٸ��� ��� �����л� ���ʸ� ��ٸ�
			}	
	
		}

	}

}
