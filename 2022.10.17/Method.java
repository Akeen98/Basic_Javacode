public class Method{
	static void staticMethod(){
	System.out.println("This is a static method");

	}
	void normalMethod(){
	System.out.println("This is a normal method");

	}
	void normalMethod(int x){
	System.out.println("Interger is "+x);

	}
	public static void main(String [] args){

	staticMethod();

	Method obj1 = new Method();
	obj1.normalMethod();
	obj1.normalMethod(5);

	}
}