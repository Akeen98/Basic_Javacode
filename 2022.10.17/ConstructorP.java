public class ConstructorP{
	
	ConstructorP(){
	 System.out.println("This is a  Constructor");

	}
	ConstructorP(int x){
	 System.out.println("This is a  x is " + x);

	}

	public static void main(String [] args){
		ConstructorP obj = new ConstructorP();
		ConstructorP obj1 = new ConstructorP(5);
	}
}