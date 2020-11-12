class OuterClass{
	int x=200;
	class InnerClass{
		int y=400;
	}
}
public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc=new OuterClass();
		
		OuterClass.InnerClass ic=new OuterClass().new InnerClass();
		
		System.out.println("oc.x ="+oc.x);
		System.out.println("ic.y ="+ic.y);
	}

}
