
import java.util.Scanner;

public class calculator{
	public static void main(String[] args) {
		int x,y;
		char ope;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		x=scan.nextInt();
		y=scan.nextInt();
		System.out.println("enter the operation");
		ope=scan.next().charAt(0);
		switch(ope) {
		case '+':
			System.out.println(x+y);
			break;
		case '-':
			System.out.println(x-y);
			break;
		case '*':
			System.out.println(x*y);
			break;
		case '/':
			System.out.println(x/y);
			break;
		default:
			System.out.println("The operation is invalid");
		}
		scan.close();
			
	}
}
