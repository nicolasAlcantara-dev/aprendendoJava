public class MultidimensionalArrays {
	public static void main(String[] args) {
	// A multidimensional array is an array of arrays
	int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7},  {8, 9, 10}};
	for (int[] row : myNumbers) {
		for(int i : row) {
		System.out.println(i);
	}
}
}	
}