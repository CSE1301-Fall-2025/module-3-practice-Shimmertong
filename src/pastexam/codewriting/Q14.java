package pastexam.codewriting;



public class Q14 {

	/*
	 * We wish to write a program that will create 
	 * mirrored arrays. For example, if you were given
	 * the following array:
	 * 
	 * 		1 2 3
	 * 
	 * then your program should create an array that
	 * contains [1, 2, 3, 3, 2, 1].
	 * 
	 * Complete the code below to compute the sum of the columns 
	 * the given array. Your code should work regardless of the size of
	 * this array or the values that it contains. It is not necessary
	 * to print the result, creating the appropriate array is enough.
	 */
	
	public static void main(String[] args) {
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some data
		//to make sure your solution
		//works properly.
		int[] data = {1, 2, 3}; 

		int length = 2 * (data.length);
		int[] array = new int[length];
		for(int a = 0; a < data.length; a++){
			array[a] = data[a];
		}
		for(int b = data.length; b < length; b++){
			array[b] = data[length - 1 - b];
		}

		for(int index = 0; index < length; index++){
			System.out.print(array[index] + " ");
		}
		
	}
}
