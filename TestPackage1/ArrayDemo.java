package TestPackage1;

public class ArrayDemo {
    public static void main(String[] args) {
		int [] anArray; //declares an array of integers
		
		anArray = new int[10]; //allocates memory for 10 integers
		
		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;

		
		System.out.println("Element at index 0: " +anArray[0]);
		System.out.println("Element at index 1: " +anArray[1]);
		
	}
}
