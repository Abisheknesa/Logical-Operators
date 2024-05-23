package king;
import java.lang.*;
import java.util.*;

public class LogicalOperators {
	
	
	public static void main(String[] args) {
		Scanner abi=new Scanner(System.in);
		
		int a=abi.nextInt();
	    int b=abi.nextInt();
		int c=abi.nextInt();
		
		if(a==b && a>c) {
			System.out.println("True");
		}
		if(a>c || b==c) {
			System.out.println("True");
		}
		
		else {
			System.out.println("LogicalOperators");
		}
		System.out.println("The value of a:"+a);
		System.out.println("The value of b:"+b);
		System.out.println("The value of c:"+c);
	
	}

}