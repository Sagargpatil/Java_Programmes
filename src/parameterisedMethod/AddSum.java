
package parameterisedMethod;
import java.util.*;

public class AddSum {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers to check your sum");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
        AddSum  c = new AddSum();
        
        System.out.println("Addition of two numbers is : "+c.Add(a,b));
        System.out.println("Substraction of two numbers is : "+c.Sub(a,b));
        

	}
	
	public int Add(int a, int b) {
		
		return a+b;
	}
	
	public int Sub(int a, int b) {
		if(a<b) {
			return 0;
		}
		else {
			return a-b;
		}
		
	}
	
	
	

}
