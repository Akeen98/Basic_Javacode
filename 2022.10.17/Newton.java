import java.util.Scanner;
public class Newton{
	public static void main (String[] args){
		Newton obj = new Newton();
		obj.call();

	}

	public void call(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr Beging Speed ");
	int u = sc.nextInt();
	System.out.println("Enetr Time ");
	int t = sc.nextInt();
	final int a=10;
	int v = u+(a*t);

	System.out.println("Last Speed " +v);
	}

}