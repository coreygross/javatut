package TestPackage1;
public class TernaryOperatorDemo {
    public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result;
		
		result = a < b ? a : b; 
		//this is an IF statement
		// IF first condition is a < b. 
		//if first condition is true, then after the ?, 
		//then A is print as result and the : is "or" so b would be printed.
		//only can use one statement at a time
		
		System.out.println(result);
	}
}
