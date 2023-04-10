package TestPackage1;
public class TwoDimensionalArray {
    
	public static void main (String args[]) {
		int arr[][] = { {2, 7, 9 }, {3, 6, 1 }, {7, 4, 2} }; //row 1, 2, and 3
		
		for (int i = 0; i < 3; i++) { //row 
			for (int j = 0; j < 3; j++) { //column
				System.out.print(arr[i][j] + " "); //if you switch i and j, then it changes the row and columns
			}
			System.out.println();
		}
		System.out.println(arr[0][1]); //prints a position in the matrix
	}
}
