package week14;
import java.util.*;

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> myStack=new LinkedList<Integer>();
		Scanner kbd=new Scanner(System.in);
		
		int num1;
		while(true) {
			System.out.print("Push numbers(0 to quit)");
			num1=kbd.nextInt();
			if(num1==0)
				break;
			myStack.addLast(new Integer(num1));
		}
		System.out.println("<Popped result>");
		while(!myStack.isEmpty()) {
			int num2=myStack.removeLast();
			System.out.println(num2);
		}
	}

}
