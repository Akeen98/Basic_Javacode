public class MulObject{
	int x =5;
	public static void main(String[] args){
		MulObject obj1 = new MulObject();
		MulObject obj2 = new MulObject();
		obj2.x = 25;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}