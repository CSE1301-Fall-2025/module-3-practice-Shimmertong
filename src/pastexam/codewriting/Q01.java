package pastexam.codewriting;

import java.util.Scanner;

public class Q01 {

	/*
	 * Linear algebra often uses �triangular� arrays. 
	 * An upper triangular array is a square 2D
	 * array with zero values below the diagonal 
	 * and non-zero values at and above it, like:
	 * 
	 *    1 1 1 1 1
	 *    0 1 1 1 1
	 *    0 0 1 1 1
	 *    0 0 0 1 1
	 *    0 0 0 0 1
	 *    
	 * Provide code that will create an n x n
	 * upper triangular array with all non-zero
	 * elements initialized to 1.0.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Array size: ");
		int n = in.nextInt();
		in.close();
		double array[][] = new double[n][n];
		for (int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(j >= i){
					array[i][j] = 1.0;

				}
				else{
					array[i][j] = 0.0;
				}
				
			}
			
		}
		for (int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}



}