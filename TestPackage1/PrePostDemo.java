package TestPackage1;
public class PrePostDemo {
    public static void main(String[] args) {
		int result = +1;
		
		System.out.println(result);
		
		result--;
		//result is now 0
		System.out.println(result);
		
		result++;
		//result is not 1
		System.out.println(result);
		
		result = -result;
		//result is now -1
		System.out.println(result);

		boolean success = false;
		//false
		System.out.println(success);
		System.out.println(!success);
		//true
		
	 //++i = increase increment and then re-assign i
	//i++ finds i then increases increment
		
		
	}
}
