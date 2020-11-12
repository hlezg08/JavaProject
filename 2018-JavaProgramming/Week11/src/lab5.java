class OuterClass2{
	int x=200;
	InnerClass IC=new InnerClass();
	void methodOC() {
		System.out.println("y of innerClass from OuterClass="+IC.y);
		
	}
	class InnerClass{
		int y=400;
		void methodIC() {
			System.out.println("x of OuterClass from InnerClass ="+x);
			
		}
	}
}
public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass2 oc=new OuterClass2();
		OuterClass2.InnerClass ic=oc.new InnerClass();
		
		System.out.println("oc.x = "+oc.x);
		System.out.println("ic.y = "+ic.y);
		
		oc.methodOC();
		ic.methodIC();
		
		System.out.println("oc.ic.y= "+oc.IC.y);
		
		oc.IC.methodIC();
	}

}
